// Next.js API route support: https://nextjs.org/docs/api-routes/introduction

export default function handler(req, res) {
  res.status(200).json([
    {
      id: 1,
      name: 'Prineth Fernando',
      img: 'https://avatars.githubusercontent.com/u/70090385?v=4',
      github: 'https://github.com/prineth',
      linkedin: 'https://linkedin.com/in/prineth-fernando',
    },
    {
      id: 2,
      name: 'Ugur Atmaca',
      img: 'https://avatars.githubusercontent.com/u/1944295?v=4',
      github: 'https://github.com/uguratmaca',
      linkedin: 'https://www.linkedin.com/in/atmacaugur/',
    },
  ]);
}
