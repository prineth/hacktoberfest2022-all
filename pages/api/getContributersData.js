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
  ]);
}
