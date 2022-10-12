import React from 'react';
import ProfileImg from './ProfileImg';
import { FaLinkedin } from '@react-icons/all-files/fa/FaLinkedin';
import { FaGithub } from '@react-icons/all-files/fa/FaGithub';
import Link from 'next/link';

const ProfileCard = ({ name, image, github, linkedin }) => {
  return (
    <div className="flex flex-col w-52 h-60 bg-slate-700 m-5 rounded-xl shadow-md shadow-blue-400 transition ease-in-out delay-150 hover:-translate-y-1 hover:scale-110 duration-300">
      <div className="mx-auto mt-5">
        <ProfileImg img={image} />
      </div>
      <p className="font-medium text-slate-200 mx-auto font-mono">{name}</p>
      <div className="mx-auto">
        <div className="flex">
          <a
            href={github}
            target={'_blank'}
            rel="noreferrer"
            className="cursor-pointer mx-5 my-5"
          >
            <FaGithub fill="#ffffff" size="25" />
          </a>

          <a
            href={linkedin}
            target={'_blank'}
            rel="noreferrer"
            className="cursor-pointer mx-5 my-5"
          >
            <FaLinkedin fill="#ffffff" size="25" />
          </a>
        </div>
      </div>
    </div>
  );
};

export default ProfileCard;
