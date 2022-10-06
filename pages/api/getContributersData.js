// Next.js API route support: https://nextjs.org/docs/api-routes/introduction

export default function handler(req, res) {
  res.status(200).json([
    {
      id: 1,
      name: "Prineth Fernando",
      img: "https://avatars.githubusercontent.com/u/70090385?v=4",
      github: "https://github.com/prineth",
      linkedin: "https://linkedin.com/in/prineth-fernando",
    },
    {
      id: 2,
      name: "Muhammad Uzair",
      img: "https://avatars.githubusercontent.com/u/89875366?v=4",
      github: "https://github.com/heyitsuzair",
      linkedin: "https://linkedin.com/in/uzair-dev",
    },
    {
      id: 3,
      name: 'Ugur Atmaca',
      img: 'https://avatars.githubusercontent.com/u/1944295?v=4',
      github: 'https://github.com/uguratmaca',
      linkedin: 'https://www.linkedin.com/in/atmacaugur/',
    },
    {
      id: 4,
      name: 'Shamil Keheliya',
      img: 'https://avatars.githubusercontent.com/u/62515133?v=4',
      github: 'https://github.com/shamilkeheliya',
      linkedin: 'https://linkedin.com/in/shamilkeheliya',
    },
    {
      id: 5,
      name: 'Deepak',
      img: 'https://avatars.githubusercontent.com/u/60574055?v=4',
      github: 'https://github.com/darakhshadeepak',
      linkedin: 'https://www.linkedin.com/in/deepak-gautam-14b027184/',
    },
  ]);
}
