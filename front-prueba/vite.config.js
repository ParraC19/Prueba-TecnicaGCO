import { defineConfig } from 'vite'
import react from '@vitejs/plugin-react-swc'
import tailwindcss from '@tailwindcss/vite'

// https://vite.dev/config/
export default defineConfig({
  content: ["./index.html", "./src/**/*.{js,ts,jsx,tsx}"],
  theme: {
    extend: {
      fontFamily: {
        belgrano: ['Belgrano', 'serif'], 
      },
    },
  },
  plugins: 
  [
    react(),
    tailwindcss(),
  ],
})
