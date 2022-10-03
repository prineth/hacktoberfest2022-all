import Image from 'next/image';
import React from 'react';

const ProfileImg = ({ img }) => {
  return (
    <Image
      width="128px"
      height="128px"
      src={img}
      alt="profile"
      className="rounded-full"
    />
  );
};

export default ProfileImg;
