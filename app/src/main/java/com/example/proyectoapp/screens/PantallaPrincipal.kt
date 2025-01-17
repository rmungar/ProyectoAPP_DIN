package com.example.proyectoapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.asFlow
import androidx.navigation.NavController
import com.example.proyectoapp.MVVM.ViewModel
import com.example.proyectoapp.R
import com.example.proyectoapp.componentes.topAppBar


@Composable
fun MainScreen(viewModel: ViewModel, innerPaddingValues: PaddingValues, navController: NavController, nombre: String){




    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPaddingValues)
            .background(Color.LightGray)
    ) {
        topAppBar( nombre, navController, viewModel )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(top = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                Card(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .size(180.dp)
                        .padding(10.dp)
                        .clickable {  }
                    ,
                    elevation = CardDefaults.elevatedCardElevation(
                        defaultElevation = 5.dp
                    ),
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.vpn),
                            contentDescription = null,
                            modifier = Modifier
                                .size(90.dp)
                        )
                        Text(
                            "VPN",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                }
                Card(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .size(180.dp)
                        .padding(10.dp)
                        .clickable {  },

                    elevation = CardDefaults.elevatedCardElevation(
                        defaultElevation = 5.dp
                    )
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.viruses),
                            contentDescription = null,
                            modifier = Modifier
                                .size(90.dp)
                        )
                        Text(
                            "ANTIVIRUS",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Row {
                Card(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .size(180.dp)
                        .padding(10.dp)
                        .clickable {  },

                    elevation = CardDefaults.elevatedCardElevation(
                        defaultElevation = 5.dp
                    )
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.clean),
                            contentDescription = null,
                            modifier = Modifier
                                .size(90.dp)
                        )
                        Text(
                            "CLEAN FILES",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Card(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .size(180.dp)
                        .padding(10.dp)
                        .clickable {  },

                    elevation = CardDefaults.elevatedCardElevation(
                        defaultElevation = 5.dp
                    )
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.scan),
                            contentDescription = null,
                            modifier = Modifier
                                .size(90.dp)
                        )
                        Text(
                            "SCAN FILES",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Row {
                Card(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .size(180.dp)
                        .padding(10.dp)
                        .clickable {  },

                    elevation = CardDefaults.elevatedCardElevation(
                        defaultElevation = 5.dp
                    )
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.person),
                            contentDescription = null,
                            modifier = Modifier
                                .size(90.dp)
                        )
                        Text(
                            "ACCOUNT",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Card(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .size(180.dp)
                        .padding(10.dp)
                        .clickable {  },

                    elevation = CardDefaults.elevatedCardElevation(
                        defaultElevation = 5.dp
                    )
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.settings),
                            contentDescription = null,
                            modifier = Modifier
                                .size(90.dp)
                        )
                        Text(
                            "SETTINGS",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Row {
                Card(
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier
                        .size(180.dp)
                        .padding(10.dp)
                        .clickable {  },

                    elevation = CardDefaults.elevatedCardElevation(
                        defaultElevation = 5.dp
                    )
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.terms),
                            contentDescription = null,
                            modifier = Modifier
                                .size(90.dp)
                        )
                        Text(
                            "TERMS OF SERVICE",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 30.dp),
                            maxLines = 2
                        )
                    }
                }

            }
        }


    }
}