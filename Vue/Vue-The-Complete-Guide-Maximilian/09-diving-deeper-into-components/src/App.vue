<template>
  <div>
    <the-header></the-header>
    <!-- or simply <TheHeader/> -->
    <button @click="setSelectedComponent('active-goals')">Active Goals</button>
    <button @click="setSelectedComponent('manage-goals')">Manage Goals</button>
    <!-- <active-goals v-if="selectedComponent === 'active-goals'"></active-goals>
    <manage-goals v-else></manage-goals> -->
    <!-- con component, te puedes deshacer de una manera elegante del v-if, v-else -->
    <keep-alive>
    <component :is="selectedComponent"></component>
    </keep-alive>
    <!-- Forma de usar scoped slots -->
    <!-- <course-goals v-slot:default="slotProps">
      <h2>{{ slotProps.item}}</h2>
      <p> {{ slotProps.anotherProp}}</p>
    </course-goals> -->
  </div>
</template>

<script>
import TheHeader from './components/layout/TheHeader';
import ActiveGoals from './components/ActiveGoals';
import ManageGoals from './components/ManageGoals';

export default {
  components: {
    'the-header': TheHeader,
    // or simply TheHeader
    ActiveGoals,
    ManageGoals
  },
  data() {
    return {
      selectedComponent: 'active-goals',
      activeUser: {
        name: 'Maximilian Schwarzmüller',
        description: 'Site owner and admin',
        role: 'admin',
      },
    };
  },
  methods: {
    setSelectedComponent(cmp) {
      this.selectedComponent = cmp;
    }
  }
};
</script>

<style>
html {
  font-family: sans-serif;
}

body {
  margin: 0;
}
</style>