/** @type {import('next').NextConfig} */
const nextConfig = {
  reactStrictMode: true,
  swcMinify: true,
};

module.exports = {
  images: {
    domains: ['avatars.githubusercontent.com', 'avatars.dicebear.com','i.ibb.co','media-exp1.licdn.com','static1.cbrimages.com'],
  },
};
