<template>
  <div id="app">
    <Navbar/>
    <img src="./assets/sparqshark.png">
    <Searchbox/>
    <Sparqlsearch/>
  </div>

</template>

<script>
import Navbar from './components/navbar.vue'
import Searchbox from './components/searchbox.vue'
import Sparqlsearch from './components/sparqlsearch.vue'

export default {
  name: 'app',
  components: {
    Navbar,
    Searchbox,
    Sparqlsearch
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
