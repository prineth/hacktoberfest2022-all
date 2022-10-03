/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    './pages/**/*.{js,ts,jsx,tsx}',
    './components/**/*.{js,ts,jsx,tsx}',
  ],
  theme: {
    extend: {
      colors: {
        gray: {
          10: '#111827',
        },
        white: {
          10: '#F9FAFB',
        },
      },
    },
  },
  plugins: [],
};
