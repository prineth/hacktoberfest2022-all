import React from 'react';
import useSWR from 'swr';
import ProfileCard from '../../shared/ProfileCard';

const Main = () => {
  const fetcher = (url) => fetch(url).then((res) => res.json());
  const { data, error } = useSWR('/api/getContributersData', fetcher);
  if (error) return <div>Failed to load</div>;
  return (
    <div>
      <div className="grid grid-flow-row-dense w-fit grid-cols-1 sm:grid-cols-5 grid-rows content-start mx-auto">
        {data &&
          data?.map((contibuter, index) => (
            <ProfileCard
              key={index}
              name={contibuter?.name}
              image={contibuter?.img}
              github={contibuter?.github}
              linkedin={contibuter?.linkedin}
            />
          ))}
      </div>
    </div>
  );
};

export default Main;
