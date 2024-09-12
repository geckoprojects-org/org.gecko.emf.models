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
package de.dwd.cdc;


import net.opengis.gml.GMLPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.gecko.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Top level GML schema
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Basic support for tracking moving objects and objects with changing state.     
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML Feature schema. 		      
 *     Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Extends the units.xsd and basicTypes.xsd schemas with types for recording measures using specific types of units, especially the measures and units needed for coordinate reference systems and coordinate operations. The specific unit types encoded are length, angle, scale factor, time, area, volume, speed, and grid length. This schema allows angle values to be recorded as single numbers or in degree-minute-second format. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		Parts of this schema are based on Subclause 6.5.7 of ISO/CD 19103 Geographic information - Conceptual schema language, on Subclause A.5.2.2.3 of ISO/CD 19118 Geographic information - Encoding, and on Subclause 4.7 of OpenGIS Recommendation Paper OGC 02-007r4 Units of Measure Use and Definition Recommendations.
 * Builds on gmlBase.xsd to encode units of measure (or uom), including definitions of units of measure and dictionaries of such definitions. GML 3.0 candidate schema, primary editor: Arliss Whiteside. Last updated 2005-06-22.
 * 	Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 	Parts of this schema are based on Subclause 6.5.7 of ISO/CD 19103 Geographic information - Conceptual schema language, on Subclause A.5.2.2.3 of ISO/CD 19118 Geographic information - Encoding, and on most of OpenGIS Recommendation Paper OGC 02-007r4 Units of Measure Use and Definition Recommendations.
 * 
 * 			Dictionary schema for GML 3.1.1 
 * 			Components to support the lists of definitions.  
 *     Copyright (c) 2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML base schema for GML 3
 * 		Components to support the GML encoding model.  
 * 		The abstract Schematron rules can be used by any schema that includes gmlBase.  
 * 		Copyright (c) 2001-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 
 *     Generic simpleContent components for use in GML 
 *     Copyright (c) 2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 *     
 * 
 * 			GML 3.0 candidate xlinks schema. Copyright (c) 2001 OGC, All Rights Reserved.
 * 		
 * The temporal schema for GML 3.1 provides constructs for handling time-varying spatial data. 
 *     This schema reflects a partial implementation of the model described in ISO 19108:2002. 
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * This schema defines "direction" element and type.
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 
 * 	Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Copyright (c) 2001-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML Coverage schema. 
 *         Copyright (c) 2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * GML conformant schema for Values in which the  
 * 		    * scalar Value types and lists have their values recorded in simpleContent elements 
 * 		    * complex Value types are built recursively
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Grid geometries
 *     A subset of implicit geometries
 *     Designed for use with GML Coverage schema, but maybe useful elsewhere as well.  
 *     
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * How to encode coordinate reference system definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate reference systems, including the specific subtypes of coordinate reference systems. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Coordinate Reference System (SC_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates, with the exception of the abstract "SC_CRS" class. The "SC_CRS" class is encoded in referenceSystems.xsd, to eliminate the (circular) references from coordinateOperations.xsd to coordinateReferenceSystems.xsd. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode coordinate system definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate systems, including the specific subtypes of coordinate systems. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Coordinate System (CS_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode reference system definitions. Builds on several other parts of GML 3 to encode the data needed to define reference systems. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Reference System (RS_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. The SC_CRS class is also encoded here, to eliminate the (circular) references from coordinateOperations.xsd to coordinateReferenceSystems.xsd. The RS_SpatialReferenceSystemUsingGeographicIdentifier class is not encoded, since it is not applicable to coordinate positions. The CI_Citation class is not directly encoded, since such information can be included as metaDataProperty elements which are optionally allowed. A modified version of the EX_Extent (DataType) class from ISO 19115 is currently encoded here, using GML 3 schema types. (A more extensive version of the EX_Extent package might be XML encoded in the future, probably in a separate extent.xsd schema.)
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111.
 * How to encode datum definitions. Builds on referenceSystems.xsd to encode the data needed to define datums, including the specific subtypes of datums. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Datum (CD_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode coordinate operation definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate operations, including Transformations, Conversions, and other specific subtypes of operations. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Coordinate Operation (CC_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * How to encode positional data quality information. Builds on units.xsd to encode the data needed to describe the positional accuracy of coordinate operations. 
 * 		Copyright (c) 2002-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		This schema encodes the Data Quality (DQ) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * Observation schema for GML 3.1     
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * Default Style schema for GML 3.1.0
 * 		Copyright (c) 2001-2005 OGC, All Rights Reserved. For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * 		Compliance: reference to ISO Specifications
 * The Temporal Reference Systems schema for GML 3.1 provides constructs for handling various styles of temporal reference system. 
 *     This schema reflects a partial implementation of the model described in ISO 19108:2002. 
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * The temporal topology schema for ISO19136 provides constructs for handling topological complexes and 
 * 		temporal feature relationships. 
 * 		Temporal geometric characteristics of features are represented as instants and periods. 
 * 		While, temporal context of features that does not relate to the position of time is described as connectivity relationships 
 * 		among instants and periods. These relationships are called temporal topology as they do not change in time, 
 * 		as long as the direction of time does not change. 
 * 		It is used effectively in the case of describing a family tree expressing evolution of species, an ecological cycle, 
 * 		a lineage of lands or buildings, or a history of separation and merger of administrative boundaries.
 * 		This schema reflects a partial yet consistent implementation of the model described in ISO 19108:2002. 
 *     Copyright (c) 2002-2005 OGC, All Rights Reserved.
 * 	For conditions, see OGC Software Notice http://www.opengeospatial.org/about/?page=ipr
 * <!-- end-model-doc -->
 * @see de.dwd.cdc.CDCFactory
 * @model kind="package"
 *        annotation="urn:opengis:specification:gml:schema-xsd:gml:3.1.1 appinfo='gml.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:feature:v3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1 appinfo='geometryBasic2d.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1 appinfo='geometryBasic0d1d.xsd\n\n  \t\t\t\n  &lt;sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\"&gt;Schematron validation&lt;/sch:title&gt;\n  \t\t\t\n  &lt;sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"&gt;\n    \t\t\t\t\n    &lt;sch:rule abstract=\"true\" id=\"CRSLabels\"&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"not(@srsDimension) or @srsName\"&gt;The presence of a dimension attribute implies the presence of the srsName attribute.&lt;/sch:report&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"not(@axisLabels) or @srsName\"&gt;The presence of an axisLabels attribute implies the presence of the srsName attribute.&lt;/sch:report&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"not(@uomLabels) or @srsName\"&gt;The presence of an uomLabels attribute implies the presence of the srsName attribute.&lt;/sch:report&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"(not(@uomLabels) and not(@axisLabels)) or (@uomLabels and @axisLabels)\"&gt;The presence of an uomLabels attribute implies the presence of the axisLabels attribute and vice versa.&lt;/sch:report&gt;\n      \t\t\t\t\n    &lt;/sch:rule&gt;\n    \t\t\t\n  &lt;/sch:pattern&gt;\n  \t\t\t\n  &lt;sch:pattern name=\"Check Dimension\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"&gt;\n    \t\t\t\t\n    &lt;sch:rule abstract=\"true\" id=\"Count\"&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"not(@count) or @srsDimension\"&gt;The presence of a count attribute implies the presence of the dimension attribute.&lt;/sch:report&gt;\n      \t\t\t\t\n    &lt;/sch:rule&gt;\n    \t\t\t\n  &lt;/sch:pattern&gt;\n  \t\t\n'"
 *        annotation="urn:opengis:specification:gml:schema-measures:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-units:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1 appinfo='\n  \t\t\t\n  &lt;sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\"&gt;Schematron validation&lt;/sch:title&gt;\n  \t\t\t\n  &lt;sch:ns prefix=\"gml\" uri=\"http://www.opengis.net/gml\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/&gt;\n  \t\t\t\n  &lt;sch:ns prefix=\"xlink\" uri=\"http://www.w3.org/1999/xlink\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/&gt;\n  \t\t\t\n  &lt;sch:pattern name=\"Check either href or content not both\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"&gt;\n    \t\t\t\t\n    &lt;sch:rule abstract=\"true\" id=\"hrefOrContent\"&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"@xlink:href and (*|text())\"&gt;Property element may not carry both a reference to an object and contain an object.&lt;/sch:report&gt;\n      \t\t\t\t\t\n      &lt;sch:assert test=\"@xlink:href | (*|text())\"&gt;Property element must either carry a reference to an object or contain an object.&lt;/sch:assert&gt;\n      \t\t\t\t\n    &lt;/sch:rule&gt;\n    \t\t\t\n  &lt;/sch:pattern&gt;\n  \t\t\n'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1 appinfo='basicTypes.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xlinks:v3.0c2 appinfo='xlinks.xsd v3.0b2 2001-07'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporal:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:direction:3.1.1 appinfo='direction.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:topology:3.1.1 appinfo='topology.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1 appinfo='geometryComplexes.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1 appinfo='geometryAggregates.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1 appinfo='geometryPrimitives.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coverage:3.1.1 appinfo='coverage.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1 appinfo='valueObjects.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:grids:3.1.1 appinfo='grids.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:datums:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:observation:3.1.1 appinfo='observation.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-defaultStyle:v3.1.0 appinfo='defaultStyle.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1 appinfo=''"
 * @generated
 */
@ProviderType
@EPackage(uri = CDCPackage.eNS_URI, genModel = "/model/cdc.genmodel", genModelSourceLocations = {"model/cdc.genmodel","de.dwd.cdc.model/model/cdc.genmodel"}, ecore="/model/cdc.ecore", ecoreSourceLocations="/model/cdc.ecore")
public interface CDCPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cdc.dwd.de";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CDCPackage eINSTANCE = de.dwd.cdc.impl.CDCPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dwd.cdc.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.impl.DocumentRootImpl
	 * @see de.dwd.cdc.impl.CDCPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>OBSDEUPT1HT2M</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBSDEUPT1HT2M = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl <em>OBSDEUPT1HT2M Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl
	 * @see de.dwd.cdc.impl.CDCPackageImpl#getOBSDEUPT1HT2MType()
	 * @generated
	 */
	int OBSDEUPT1HT2M_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__META_DATA_PROPERTY = GMLPackage.ABSTRACT_FEATURE_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__DESCRIPTION = GMLPackage.ABSTRACT_FEATURE_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__NAME_GROUP = GMLPackage.ABSTRACT_FEATURE_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__NAME = GMLPackage.ABSTRACT_FEATURE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__ID = GMLPackage.ABSTRACT_FEATURE_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__BOUNDED_BY = GMLPackage.ABSTRACT_FEATURE_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__LOCATION_GROUP = GMLPackage.ABSTRACT_FEATURE_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__LOCATION = GMLPackage.ABSTRACT_FEATURE_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>SDOGEOM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__SDOGEOM = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>SDOTYPE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__SDOTYPE = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>SDOGUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__SDOGUID = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>SDOCODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__SDOCODE = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>SDONAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__SDONAME = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ZEITSTEMPEL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__ZEITSTEMPEL = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>ZEITINTERVALL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__ZEITINTERVALL = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>WERT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__WERT = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>EINHEIT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__EINHEIT = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>QUALITAETBYTE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__QUALITAETBYTE = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>QUALITAETNIVEAU</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE__QUALITAETNIVEAU = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>OBSDEUPT1HT2M Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE_FEATURE_COUNT = GMLPackage.ABSTRACT_FEATURE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>OBSDEUPT1HT2M Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSDEUPT1HT2M_TYPE_OPERATION_COUNT = GMLPackage.ABSTRACT_FEATURE_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see de.dwd.cdc.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link de.dwd.cdc.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see de.dwd.cdc.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link de.dwd.cdc.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see de.dwd.cdc.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link de.dwd.cdc.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see de.dwd.cdc.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link de.dwd.cdc.DocumentRoot#getOBSDEUPT1HT2M <em>OBSDEUPT1HT2M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>OBSDEUPT1HT2M</em>'.
	 * @see de.dwd.cdc.DocumentRoot#getOBSDEUPT1HT2M()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_OBSDEUPT1HT2M();

	/**
	 * Returns the meta object for class '{@link de.dwd.cdc.OBSDEUPT1HT2MType <em>OBSDEUPT1HT2M Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OBSDEUPT1HT2M Type</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType
	 * @generated
	 */
	EClass getOBSDEUPT1HT2MType();

	/**
	 * Returns the meta object for the containment reference '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOGEOM <em>SDOGEOM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>SDOGEOM</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getSDOGEOM()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EReference getOBSDEUPT1HT2MType_SDOGEOM();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOTYPE <em>SDOTYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDOTYPE</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getSDOTYPE()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EAttribute getOBSDEUPT1HT2MType_SDOTYPE();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOGUID <em>SDOGUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDOGUID</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getSDOGUID()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EAttribute getOBSDEUPT1HT2MType_SDOGUID();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDOCODE <em>SDOCODE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDOCODE</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getSDOCODE()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EAttribute getOBSDEUPT1HT2MType_SDOCODE();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getSDONAME <em>SDONAME</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SDONAME</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getSDONAME()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EAttribute getOBSDEUPT1HT2MType_SDONAME();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getZEITSTEMPEL <em>ZEITSTEMPEL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZEITSTEMPEL</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getZEITSTEMPEL()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EAttribute getOBSDEUPT1HT2MType_ZEITSTEMPEL();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getZEITINTERVALL <em>ZEITINTERVALL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ZEITINTERVALL</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getZEITINTERVALL()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EAttribute getOBSDEUPT1HT2MType_ZEITINTERVALL();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getWERT <em>WERT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>WERT</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getWERT()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EAttribute getOBSDEUPT1HT2MType_WERT();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getEINHEIT <em>EINHEIT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EINHEIT</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getEINHEIT()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EAttribute getOBSDEUPT1HT2MType_EINHEIT();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getQUALITAETBYTE <em>QUALITAETBYTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QUALITAETBYTE</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getQUALITAETBYTE()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EAttribute getOBSDEUPT1HT2MType_QUALITAETBYTE();

	/**
	 * Returns the meta object for the attribute '{@link de.dwd.cdc.OBSDEUPT1HT2MType#getQUALITAETNIVEAU <em>QUALITAETNIVEAU</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>QUALITAETNIVEAU</em>'.
	 * @see de.dwd.cdc.OBSDEUPT1HT2MType#getQUALITAETNIVEAU()
	 * @see #getOBSDEUPT1HT2MType()
	 * @generated
	 */
	EAttribute getOBSDEUPT1HT2MType_QUALITAETNIVEAU();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CDCFactory getCDCFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dwd.cdc.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.impl.DocumentRootImpl
		 * @see de.dwd.cdc.impl.CDCPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>OBSDEUPT1HT2M</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBSDEUPT1HT2M = eINSTANCE.getDocumentRoot_OBSDEUPT1HT2M();

		/**
		 * The meta object literal for the '{@link de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl <em>OBSDEUPT1HT2M Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dwd.cdc.impl.OBSDEUPT1HT2MTypeImpl
		 * @see de.dwd.cdc.impl.CDCPackageImpl#getOBSDEUPT1HT2MType()
		 * @generated
		 */
		EClass OBSDEUPT1HT2M_TYPE = eINSTANCE.getOBSDEUPT1HT2MType();

		/**
		 * The meta object literal for the '<em><b>SDOGEOM</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBSDEUPT1HT2M_TYPE__SDOGEOM = eINSTANCE.getOBSDEUPT1HT2MType_SDOGEOM();

		/**
		 * The meta object literal for the '<em><b>SDOTYPE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSDEUPT1HT2M_TYPE__SDOTYPE = eINSTANCE.getOBSDEUPT1HT2MType_SDOTYPE();

		/**
		 * The meta object literal for the '<em><b>SDOGUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSDEUPT1HT2M_TYPE__SDOGUID = eINSTANCE.getOBSDEUPT1HT2MType_SDOGUID();

		/**
		 * The meta object literal for the '<em><b>SDOCODE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSDEUPT1HT2M_TYPE__SDOCODE = eINSTANCE.getOBSDEUPT1HT2MType_SDOCODE();

		/**
		 * The meta object literal for the '<em><b>SDONAME</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSDEUPT1HT2M_TYPE__SDONAME = eINSTANCE.getOBSDEUPT1HT2MType_SDONAME();

		/**
		 * The meta object literal for the '<em><b>ZEITSTEMPEL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSDEUPT1HT2M_TYPE__ZEITSTEMPEL = eINSTANCE.getOBSDEUPT1HT2MType_ZEITSTEMPEL();

		/**
		 * The meta object literal for the '<em><b>ZEITINTERVALL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSDEUPT1HT2M_TYPE__ZEITINTERVALL = eINSTANCE.getOBSDEUPT1HT2MType_ZEITINTERVALL();

		/**
		 * The meta object literal for the '<em><b>WERT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSDEUPT1HT2M_TYPE__WERT = eINSTANCE.getOBSDEUPT1HT2MType_WERT();

		/**
		 * The meta object literal for the '<em><b>EINHEIT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSDEUPT1HT2M_TYPE__EINHEIT = eINSTANCE.getOBSDEUPT1HT2MType_EINHEIT();

		/**
		 * The meta object literal for the '<em><b>QUALITAETBYTE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSDEUPT1HT2M_TYPE__QUALITAETBYTE = eINSTANCE.getOBSDEUPT1HT2MType_QUALITAETBYTE();

		/**
		 * The meta object literal for the '<em><b>QUALITAETNIVEAU</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBSDEUPT1HT2M_TYPE__QUALITAETNIVEAU = eINSTANCE.getOBSDEUPT1HT2MType_QUALITAETNIVEAU();

	}

} //CDCPackage
