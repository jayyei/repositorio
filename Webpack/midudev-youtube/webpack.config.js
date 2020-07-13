const HtmlWebpackPlugin = require('html-webpack-plugin');
const CompressionPlugin = require('compression-webpack-plugin');

const javascriptRules = {
    test: /\.js$/,
    exclude: /node_modules/,
    use: {
        loader: 'babel-loader',
        options: {
            presets: ['@babel/preset-react', '@babel/preset-env'],
            plugins: ['@babel/plugin-proposal-optional-chaining']
        }
    }
}

module.exports = (env, {mode})=>({
    entry: './src/index.js',
    output: {
        filename: 'app.[hash].js'
    },
    module: {
        rules: [
            javascriptRules,
        ]
    },
    plugins: [
        mode === 'production' && new CompressionPlugin(),
        new HtmlWebpackPlugin({
            title: 'Webpack paso a paso',
            template: 'src/index.html'
        })
    ].filter(Boolean)
});
