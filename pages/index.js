import Head from 'next/head';
import Footer from './components/Footer/Footer';
import Main from './components/Main/Main';

export default function Home() {
  return (
    <div className="min-h-screen bg-gray-900">
      <Head>
        <title>Hacktoberfest 2022</title>
        <meta name="description" content="Hacktoberfest: a month-long celebration of open-source projects, their maintainers, and the entire community of contributors.">
        <link
          rel="icon"
          href="data:image/svg+xml,<svg xmlns=%22http://www.w3.org/2000/svg%22 viewBox=%220 0 100 100%22><text y=%22.9em%22 font-size=%2290%22>🎉</text></svg>"
        />
      </Head>

      <section className="relative justify-center mx-auto my-auto">
        <Main />
      </section>

      <Footer />
    </div>
  );
}
