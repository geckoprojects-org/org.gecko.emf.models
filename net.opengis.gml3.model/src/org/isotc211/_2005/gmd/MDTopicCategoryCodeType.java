/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package org.isotc211._2005.gmd;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MD Topic Category Code Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * High-level geospatial data thematic classification to assist in the grouping and search of available geospatial datasets
 * <!-- end-model-doc -->
 * @see org.isotc211._2005.gmd.GMDPackage#getMDTopicCategoryCodeType()
 * @model extendedMetaData="name='MD_TopicCategoryCode_Type'"
 * @generated
 */
@ProviderType
public enum MDTopicCategoryCodeType implements Enumerator {
	/**
	 * The '<em><b>Farming</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FARMING_VALUE
	 * @generated
	 * @ordered
	 */
	FARMING(0, "farming", "farming"),

	/**
	 * The '<em><b>Biota</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOTA_VALUE
	 * @generated
	 * @ordered
	 */
	BIOTA(1, "biota", "biota"),

	/**
	 * The '<em><b>Boundaries</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUNDARIES_VALUE
	 * @generated
	 * @ordered
	 */
	BOUNDARIES(2, "boundaries", "boundaries"),

	/**
	 * The '<em><b>Climatology Meteorology Atmosphere</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIMATOLOGY_METEOROLOGY_ATMOSPHERE_VALUE
	 * @generated
	 * @ordered
	 */
	CLIMATOLOGY_METEOROLOGY_ATMOSPHERE(3, "climatologyMeteorologyAtmosphere", "climatologyMeteorologyAtmosphere"),

	/**
	 * The '<em><b>Economy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECONOMY_VALUE
	 * @generated
	 * @ordered
	 */
	ECONOMY(4, "economy", "economy"),

	/**
	 * The '<em><b>Elevation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATION_VALUE
	 * @generated
	 * @ordered
	 */
	ELEVATION(5, "elevation", "elevation"),

	/**
	 * The '<em><b>Environment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ENVIRONMENT(6, "environment", "environment"),

	/**
	 * The '<em><b>Geoscientific Information</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOSCIENTIFIC_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	GEOSCIENTIFIC_INFORMATION(7, "geoscientificInformation", "geoscientificInformation"),

	/**
	 * The '<em><b>Health</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTH(8, "health", "health"),

	/**
	 * The '<em><b>Imagery Base Maps Earth Cover</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGERY_BASE_MAPS_EARTH_COVER_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGERY_BASE_MAPS_EARTH_COVER(9, "imageryBaseMapsEarthCover", "imageryBaseMapsEarthCover"),

	/**
	 * The '<em><b>Intelligence Military</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTELLIGENCE_MILITARY_VALUE
	 * @generated
	 * @ordered
	 */
	INTELLIGENCE_MILITARY(10, "intelligenceMilitary", "intelligenceMilitary"),

	/**
	 * The '<em><b>Inland Waters</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INLAND_WATERS_VALUE
	 * @generated
	 * @ordered
	 */
	INLAND_WATERS(11, "inlandWaters", "inlandWaters"),

	/**
	 * The '<em><b>Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(12, "location", "location"),

	/**
	 * The '<em><b>Oceans</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCEANS_VALUE
	 * @generated
	 * @ordered
	 */
	OCEANS(13, "oceans", "oceans"),

	/**
	 * The '<em><b>Planning Cadastre</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNING_CADASTRE_VALUE
	 * @generated
	 * @ordered
	 */
	PLANNING_CADASTRE(14, "planningCadastre", "planningCadastre"),

	/**
	 * The '<em><b>Society</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIETY_VALUE
	 * @generated
	 * @ordered
	 */
	SOCIETY(15, "society", "society"),

	/**
	 * The '<em><b>Structure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE_VALUE
	 * @generated
	 * @ordered
	 */
	STRUCTURE(16, "structure", "structure"),

	/**
	 * The '<em><b>Transportation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPORTATION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPORTATION(17, "transportation", "transportation"),

	/**
	 * The '<em><b>Utilities Communication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTILITIES_COMMUNICATION_VALUE
	 * @generated
	 * @ordered
	 */
	UTILITIES_COMMUNICATION(18, "utilitiesCommunication", "utilitiesCommunication");

	/**
	 * The '<em><b>Farming</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FARMING
	 * @model name="farming"
	 * @generated
	 * @ordered
	 */
	public static final int FARMING_VALUE = 0;

	/**
	 * The '<em><b>Biota</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOTA
	 * @model name="biota"
	 * @generated
	 * @ordered
	 */
	public static final int BIOTA_VALUE = 1;

	/**
	 * The '<em><b>Boundaries</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOUNDARIES
	 * @model name="boundaries"
	 * @generated
	 * @ordered
	 */
	public static final int BOUNDARIES_VALUE = 2;

	/**
	 * The '<em><b>Climatology Meteorology Atmosphere</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIMATOLOGY_METEOROLOGY_ATMOSPHERE
	 * @model name="climatologyMeteorologyAtmosphere"
	 * @generated
	 * @ordered
	 */
	public static final int CLIMATOLOGY_METEOROLOGY_ATMOSPHERE_VALUE = 3;

	/**
	 * The '<em><b>Economy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ECONOMY
	 * @model name="economy"
	 * @generated
	 * @ordered
	 */
	public static final int ECONOMY_VALUE = 4;

	/**
	 * The '<em><b>Elevation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELEVATION
	 * @model name="elevation"
	 * @generated
	 * @ordered
	 */
	public static final int ELEVATION_VALUE = 5;

	/**
	 * The '<em><b>Environment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENVIRONMENT
	 * @model name="environment"
	 * @generated
	 * @ordered
	 */
	public static final int ENVIRONMENT_VALUE = 6;

	/**
	 * The '<em><b>Geoscientific Information</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOSCIENTIFIC_INFORMATION
	 * @model name="geoscientificInformation"
	 * @generated
	 * @ordered
	 */
	public static final int GEOSCIENTIFIC_INFORMATION_VALUE = 7;

	/**
	 * The '<em><b>Health</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH
	 * @model name="health"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTH_VALUE = 8;

	/**
	 * The '<em><b>Imagery Base Maps Earth Cover</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGERY_BASE_MAPS_EARTH_COVER
	 * @model name="imageryBaseMapsEarthCover"
	 * @generated
	 * @ordered
	 */
	public static final int IMAGERY_BASE_MAPS_EARTH_COVER_VALUE = 9;

	/**
	 * The '<em><b>Intelligence Military</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTELLIGENCE_MILITARY
	 * @model name="intelligenceMilitary"
	 * @generated
	 * @ordered
	 */
	public static final int INTELLIGENCE_MILITARY_VALUE = 10;

	/**
	 * The '<em><b>Inland Waters</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INLAND_WATERS
	 * @model name="inlandWaters"
	 * @generated
	 * @ordered
	 */
	public static final int INLAND_WATERS_VALUE = 11;

	/**
	 * The '<em><b>Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION
	 * @model name="location"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 12;

	/**
	 * The '<em><b>Oceans</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCEANS
	 * @model name="oceans"
	 * @generated
	 * @ordered
	 */
	public static final int OCEANS_VALUE = 13;

	/**
	 * The '<em><b>Planning Cadastre</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLANNING_CADASTRE
	 * @model name="planningCadastre"
	 * @generated
	 * @ordered
	 */
	public static final int PLANNING_CADASTRE_VALUE = 14;

	/**
	 * The '<em><b>Society</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIETY
	 * @model name="society"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIETY_VALUE = 15;

	/**
	 * The '<em><b>Structure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRUCTURE
	 * @model name="structure"
	 * @generated
	 * @ordered
	 */
	public static final int STRUCTURE_VALUE = 16;

	/**
	 * The '<em><b>Transportation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPORTATION
	 * @model name="transportation"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPORTATION_VALUE = 17;

	/**
	 * The '<em><b>Utilities Communication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UTILITIES_COMMUNICATION
	 * @model name="utilitiesCommunication"
	 * @generated
	 * @ordered
	 */
	public static final int UTILITIES_COMMUNICATION_VALUE = 18;

	/**
	 * An array of all the '<em><b>MD Topic Category Code Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MDTopicCategoryCodeType[] VALUES_ARRAY =
		new MDTopicCategoryCodeType[] {
			FARMING,
			BIOTA,
			BOUNDARIES,
			CLIMATOLOGY_METEOROLOGY_ATMOSPHERE,
			ECONOMY,
			ELEVATION,
			ENVIRONMENT,
			GEOSCIENTIFIC_INFORMATION,
			HEALTH,
			IMAGERY_BASE_MAPS_EARTH_COVER,
			INTELLIGENCE_MILITARY,
			INLAND_WATERS,
			LOCATION,
			OCEANS,
			PLANNING_CADASTRE,
			SOCIETY,
			STRUCTURE,
			TRANSPORTATION,
			UTILITIES_COMMUNICATION,
		};

	/**
	 * A public read-only list of all the '<em><b>MD Topic Category Code Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MDTopicCategoryCodeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MD Topic Category Code Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MDTopicCategoryCodeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MDTopicCategoryCodeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MD Topic Category Code Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MDTopicCategoryCodeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MDTopicCategoryCodeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MD Topic Category Code Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MDTopicCategoryCodeType get(int value) {
		switch (value) {
			case FARMING_VALUE: return FARMING;
			case BIOTA_VALUE: return BIOTA;
			case BOUNDARIES_VALUE: return BOUNDARIES;
			case CLIMATOLOGY_METEOROLOGY_ATMOSPHERE_VALUE: return CLIMATOLOGY_METEOROLOGY_ATMOSPHERE;
			case ECONOMY_VALUE: return ECONOMY;
			case ELEVATION_VALUE: return ELEVATION;
			case ENVIRONMENT_VALUE: return ENVIRONMENT;
			case GEOSCIENTIFIC_INFORMATION_VALUE: return GEOSCIENTIFIC_INFORMATION;
			case HEALTH_VALUE: return HEALTH;
			case IMAGERY_BASE_MAPS_EARTH_COVER_VALUE: return IMAGERY_BASE_MAPS_EARTH_COVER;
			case INTELLIGENCE_MILITARY_VALUE: return INTELLIGENCE_MILITARY;
			case INLAND_WATERS_VALUE: return INLAND_WATERS;
			case LOCATION_VALUE: return LOCATION;
			case OCEANS_VALUE: return OCEANS;
			case PLANNING_CADASTRE_VALUE: return PLANNING_CADASTRE;
			case SOCIETY_VALUE: return SOCIETY;
			case STRUCTURE_VALUE: return STRUCTURE;
			case TRANSPORTATION_VALUE: return TRANSPORTATION;
			case UTILITIES_COMMUNICATION_VALUE: return UTILITIES_COMMUNICATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MDTopicCategoryCodeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MDTopicCategoryCodeType
