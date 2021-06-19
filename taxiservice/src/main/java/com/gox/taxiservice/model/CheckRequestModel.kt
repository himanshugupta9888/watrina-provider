package com.gox.taxiservice.model

import java.io.Serializable

data class CheckRequestModel(
        var error: List<Any> = listOf(),
        var message: String = "",
        var responseData: ResponseData = ResponseData(),
        var statusCode: String = "",
        var title: String = ""
) : Serializable

data class ResponseData(
        var account_status: String = "",
        var provider_details: ProviderDetails = ProviderDetails(),
        var reasons: List<Reason> = listOf(),
        var referral_amount: String = "",
        var referral_count: String = "",
        var referral_total_amount: Double? = 0.0,
        var referral_total_count: String = "",
        var request: Request = Request(),
        var ride_otp: String = "",
        var service_status: String = "",
        var sos: String = "",
        var waitingStatus: Int? = 0,
        var waitingTime: Long = 0
) : Serializable

data class ProviderDetails(
        var activation_status: Int? = 0,
        var admin_id: Any = Any(),
        var city_id: Int? = 0,
        var country_code: String = "",
        var country_id: Int? = 0,
        var currency: String = "",
        var currency_symbol: String = "",
        var device_id: Any = Any(),
        var device_token: Any = Any(),
        var device_type: Any = Any(),
        var email: String = "",
        var first_name: String = "",
        var gender: Any = Any(),
        var id: Int? = 0,
        var is_assigned: Int? = 0,
        var is_bankdetail: Int? = 0,
        var is_document: Int? = 0,
        var is_online: Int? = 0,
        var is_service: Int? = 0,
        var language: String = "",
        var last_name: String = "",
        var latitude: String = "",
        var login_by: String = "",
        var longitude: String = "",
        var mobile: String = "",
        var otp: Any = Any(),
        var payment_gateway_id: Any = Any(),
        var payment_mode: String = "",
        var picture: Any = Any(),
        var qrcode_url: String = "",
        var rating: Double? = 0.0,
        var referal_count: Int? = 0,
        var referral_unique_id: String = "",
        var service: Service = Service(),
        var social_unique_id: Any = Any(),
        var state_id: Any = Any(),
        var status: String = "",
        var stripe_cust_id: Any = Any(),
        var wallet_balance: Double? = 0.0,
        var zone_id: Any = Any()
) : Serializable

data class Service(
        var admin_service_id: Int? = 0,
        var base_fare: Double? = 0.0,
        var category_id: Int? = 0,
        var company_id: Int? = 0,
        var id: Int? = 0,
        var per_miles: Double? = 0.0,
        var per_mins: Double? = 0.0,
        var provider_id: Int? = 0,
        var provider_vehicle_id: Int? = 0,
        var ride_delivery_id: Int? = 0,
        var service_id: Int? = 0,
        var status: String = "",
        var admin_service: String = "",
        var sub_category_id: Int? = 0
) : Serializable

data class Reason(
        var created_by: Int? = 0,
        var created_type: String = "",
        var deleted_by: Any = Any(),
        var deleted_type: Any = Any(),
        var id: Int? = 0,
        var modified_by: Int? = 0,
        var modified_type: String = "",
        var reason: String = "",
        var service: String = "",
        var status: String = "",
        var type: String = ""
) : Serializable

data class Request(
        var admin_id: Any = Any(),
        var assigned_at: String = "",
        var assigned_time: String = "",
        var booking_id: String = "",
        var calculator: String = "",
        var cancel_reason: Any = Any(),
        var cancelled_by: Any = Any(),
        var city_id: Int? = 0,
        var admin_service_id: Int? = 0,
        var company_id: Int? = 0,
        var country_id: Any = Any(),
        var created_at: String = "",
        var currency: String = "",
        var d_address: String = "",
        var d_latitude: Double? = 0.0,
        var d_longitude: Double? = 0.0,
        var destination_log: String = "",
        var distance: Double? = 0.0,
        var finished_at: String = "",
        var finished_time: String = "",
        var id: Int = 0,
        var is_scheduled: String = "",
        var is_track: String = "",
        var otp: String = "",
        var paid: Int? = 0,
        var payment: Payment = Payment(),
        var payment_mode: String = "",
        var peak_hour_id: Any = Any(),
        var promocode_id: Double? = 0.0,
        var provider_id: Int? = 0,
        var provider_rated: Int? = 0,
        var provider_service_id: Int? = 0,
        var provider_vehicle_id: Int? = 0,
        var request_type: String = "",
        var ride_delivery_id: Int? = 0,
        var ride_type_id: Int? = 0,
        var route_key: String = "",
        var s_address: String = "",
        var s_latitude: Double? = 0.0,
        var s_longitude: Double? = 0.0,
        var schedule_at: Any = Any(),
        var schedule_time: String = "",
        var started_at: String = "",
        var started_time: String = "",
        var status: String = "",
        var surge: Double? = 0.0,
        var timezone: String = "",
        var track_distance: Double? = 0.0,
        var track_latitude: Double? = 0.0,
        var track_longitude: Double? = 0.0,
        var travel_time: String = "",
        var unit: String = "",
        var use_wallet: Int? = 0,
        var user: User = User(),
        var user_id: Int? = 0,
        var user_rated: Double? = 0.0,
        var vehicle_type: String = "",
        var leave_at_door :Int?=0
) : Serializable

data class User(
        var city_id: Int? = 0,
        var country_code: String = "",
        var country_id: Int? = 0,
        var created_at: String = "",
        var currency_symbol: String = "",
        var email: String = "",
        var first_name: String = "",
        var gender: String = "",
        var id: Int? = 0,
        var language: String = "",
        var last_name: String = "",
        var latitude: Any = Any(),
        var login_by: String = "",
        var longitude: Any = Any(),
        var mobile: String = "",
        var payment_mode: String = "",
        var picture: String = "",
        var rating: String = "",
        var state_id: Int? = 0,
        var status: Int? = 0,
        var user_type: String = "",
        var wallet_balance: Double? = 0.0
) : Serializable

data class Payment(
        var card: Double? = 0.0,
        var cash: Double? = 0.0,
        var commision: Double? = 0.0,
        var commision_percent: Double? = 0.0,
        var company_id: Int? = 0,
        var discount: Double? = 0.0,
        var discount_percent: Double? = 0.0,
        var distance: Double? = 0.0,
        var fixed: Double? = 0.0,
        var fleet: Int? = 0,
        var fleet_id: Any = Any(),
        var fleet_percent: Double? = 0.0,
        var hour: Double? = 0.0,
        var id: Int? = 0,
        var is_partial: Any = Any(),
        var minute: Double? = 0.0,
        var payable: Double? = 0.0,
        var payment_id: Any = Any(),
        var payment_mode: String = "",
        var peak_amount: Double? = 0.0,
        var peak_comm_amount: Double? = 0.0,
        var promocode_id: Double? = 0.0,
        var provider_id: Int? = 0,
        var provider_pay: Double? = 0.0,
        var ride_request_id: Int? = 0,
        var round_of: Double? = 0.0,
        var tax: Double? = 0.0,
        var tax_percent: Double? = 0.0,
        var tips: Double? = 0.0,
        var toll_charge: Double? = 0.0,
        var total: Double? = 0.0,
        var total_waiting_time: Double? = 0.0,
        var user_id: Int? = 0,
        var waiting_amount: Double? = 0.0,
        var waiting_comm_amount: Double? = 0.0,
        var wallet: Double? = 0.0
) : Serializable

