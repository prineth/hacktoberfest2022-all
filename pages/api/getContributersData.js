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
      name: "Teddy Firman",
      img: "https://avatars.githubusercontent.com/u/44187690?s=400&u=5697ad3a5b29e193d306985aafea565d01223e41&v=4",
      github: "https://github.com/TeddyFirman",
      linkedin: "www.linkedin.com/in/teddyfirman",
    },
  ]);
}
