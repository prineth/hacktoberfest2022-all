import React from 'react';
import useSWR from 'swr';
import ProfileCard from '../../shared/ProfileCard';

const Main = () => {
  const fetcher = (url) => fetch(url).then((res) => res.json());
  const { data, error } = useSWR('/api/getContributersData', fetcher);
  if (error) return <div>Failed to load</div>;
  return (
    <div>
      <main className="flex flex-col sm:flex-row justify-center items-center">
        {data &&
          data?.map((contibuter) => (
            <ProfileCard
              key={contibuter?.id}
              name={contibuter?.name}
              image={contibuter?.img}
              github={contibuter?.github}
              linkedin={contibuter?.linkedin}
            />
          ))}
      </main>
    </div>
  );
};

export default Main;
