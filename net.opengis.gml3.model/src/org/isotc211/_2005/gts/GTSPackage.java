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
package org.isotc211._2005.gts;


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
 * Geographic Temporal Schema (GTS) extensible markup language is a component of the XML Schema Implementation of Geographic Information Metadata documented in ISO/TS 19139:2007. GTS includes all the definitions of http://www.isotc211.org/2005/gts namespace. The root document of this namespace is the file gts.xsd. The temporalObjects.xsd schema contains the XML implementation of TM_Object, TM_Primitive and TM_PeriodDuration from ISO 19108. The encoding of these classes is mapped to ISO 19136 temporal types and W3C built-in types.
 * Geographic Temporal Schema (GTS) extensible markup language is a component of the XML Schema Implementation of Geographic Information Metadata documented in ISO/TS 19139:2007. GTS includes all the definitions of http://www.isotc211.org/2005/gts namespace. The root document of this namespace is the file gts.xsd.
 * 
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 15.6.
 * A number of types and relationships are defined to represent the time-varying properties of geographic features. 
 * In a comprehensive treatment of spatiotemporal modeling, Langran (see Bibliography) distinguished three principal temporal entities: states, events, and evidence; the schema specified in the following Subclauses incorporates elements for each.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 14.
 * Topology is the branch of mathematics describing the properties of objects which are invariant under continuous deformation. For example, a circle is topologically equivalent to an ellipse because one can be transformed into the other by stretching. In geographic modelling, the foremost use of topology is in accelerating computational geometry. The constructs of topology allow characterisation of the spatial relationships between objects using simple combinatorial or algebraic algorithms. Topology, realised by the appropriate geometry, also allows a compact and unambiguous mechanism for expressing shared geometry among geographic features.
 * There are four instantiable classes of primitive topology objects, one for each dimension up to 3D. In addition, topological complexes are supported, too. 
 * There is strong symmetry in the (topological boundary and coboundary) relationships between topology primitives of adjacent dimensions. Topology primitives are bounded by directed primitives of one lower dimension. The coboundary of each topology primitive is formed from directed topology primitives of one higher dimension.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 20.3.
 * A coverage incorporates a mapping from a spatiotemporal domain to a range set, the latter providing the set in which the attribute values live.  The range set may be an arbitrary set including discrete lists, integer or floating point ranges, and multi-dimensional vector spaces.
 * A coverage can be viewed as the graph of the coverage function f:A à B, that is as the set of ordered pairs {(x, f(x)) | where x is in A}. This view is especially applicable to the GML encoding of a coverage.  In the case of a discrete coverage, the domain set A is partitioned into a collection of subsets (typically a disjoint collection) A = UAi and the function f is constant on each Ai. For a spatial domain, the Ai are geometry elements, hence the coverage can be viewed as a collection of (geometry,value) pairs, where the value is an element of the range set.  If the spatial domain A is a topological space then the coverage can be viewed as a collection of (topology,value) pairs, where the topology element in the pair is a topological n-chain (in GML terms this is a gml:TopoPoint, gml:TopoCurve, gml:TopoSurface or gml:TopoSolid). 
 * A coverage is implemented as a GML feature. We can thus speak of a "temperature distribution feature", or a "remotely sensed image feature", or a "soil distribution feature".
 * As is the case for any GML object, a coverage object may also be the value of a property of a feature.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 13.3.
 * The spatial-temporal coordinate reference systems schema components are divided into two logical parts. One part defines elements and types for XML encoding of abstract coordinate reference systems definitions. The larger part defines specialized constructs for XML encoding of definitions of the multiple concrete types of spatial-temporal coordinate reference systems.
 * These schema components encode the Coordinate Reference System packages of the UML Models of ISO 19111 Clause 8 and ISO/DIS 19136 D.3.10, with the exception of the abstract "SC_CRS" class.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 19.
 * A GML observation models the act of observing, often with a camera, a person or some form of instrument.  An observation feature describes the "metadata" associated with an information capture event, together with a value for the result of the observation.  This covers a broad range of cases, from a tourist photo (not the photo but the act of taking the photo), to images acquired by space borne sensors or the measurement of a temperature 5 meters below the surfaces of a lake.
 * The basic structures introduced in this schema are intended to serve as the foundation for more comprehensive schemas for scientific, technical and engineering measurement schemas.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 15.5.
 * A value in the time domain is measured relative to a temporal reference system. Common types of reference systems include calendars, ordinal temporal reference systems, and temporal coordinate systems (time elapsed since some epoch).  The primary temporal reference system for use with geographic information is the Gregorian Calendar and 24 hour local or Coordinated Universal Time (UTC), but special applications may entail the use of alternative reference systems.  The Julian day numbering system is a temporal coordinate system that has an origin earlier than any known calendar, at noon on 1 January 4713 BC in the Julian proleptic calendar, and is useful in transformations between dates in different calendars.    
 * In GML seven concrete elements are used to describe temporal reference systems: gml:TimeReferenceSystem, gml:TimeCoordinateSystem, gml:TimeCalendar, gml:TimeCalendarEra, gml:TimeClock, gml:TimeOrdinalReferenceSystem, and gml:TimeOrdinalEra.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * All global schema components that are part of the GML schema, but were deprecated. See Annex I.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 15.3.
 * Temporal topology is described in terms of time complexes, nodes, and edges, and the connectivity between these. Temporal topology does not directly provide information about temporal position. It is used in the case of describing a lineage or a history (e.g. a family tree expressing evolution of species, an ecological cycle, a lineage of lands or buildings, or a history of separation and merger of administrative boundaries). The following Subclauses specifies the temporal topology as temporal characteristics of features in compliance with ISO 19108.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 16.
 * Many applications require definitions of terms which are used within instance documents as the values of certain properties or as reference information to tie properties to standard information values in some way.  Units of measure and descriptions of measurable phenomena are two particular examples. 
 * It will often be convenient to use definitions provided by external authorities. These may already be packaged for delivery in various ways, both online and offline. In order that they may be referred to from GML documents it is generally necessary that a URI be available for each definition. Where this is the case then it is usually preferable to refer to these directly. 
 * Alternatively, it may be convenient or necessary to capture definitions in XML, either embedded within an instance document containing features or as a separate document. The definitions may be transcriptions from an external source, or may be new definitions for a local purpose. In order to support this case, some simple components are provided in GML in the form of 
 * -	a generic gml:Definition, which may serve as the basis for more specialized definitions
 * -	a generic gml:Dictionary, which allows a set of definitions or references to definitions to be collected 
 * These components may be used directly, but also serve as the basis for more specialised definition elements in GML, in particular: coordinate operations, coordinate reference systems, datums, temporal reference systems, and units of measure.  
 * Note that the GML definition and dictionary components implement a simple nested hierarchy of definitions with identifiers. The latter provide handles which may be used in the description of more complex relationships between terms. However, the GML dictionary components are not intended to provide direct support for complex taxonomies, ontologies or thesauri.  Specialised XML tools are available to satisfy the more sophisticated requirements.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 7.2.
 * The gmlBase schema components establish the GML model and syntax, in particular
 * -	a root XML type from which XML types for all GML objects should be derived,
 * -	a pattern and components for GML properties,
 * -	patterns for collections and arrays, and components for generic collections and arrays,
 * -	components for associating metadata with GML objects,
 * -	components for constructing definitions and dictionaries.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 15.2.
 * The GML temporal schemas include components for describing temporal geometry and topology, temporal reference systems, and the temporal characteristics of geographic data. The model underlying the representation constitutes a profile of the conceptual schema described in ISO 19108. The underlying spatiotemporal model strives to accommodate both feature-level and attribute-level time stamping; basic support for tracking moving objects is also included. 
 * Time is measured on two types of scales: interval and ordinal.  An interval scale offers a basis for measuring duration, an ordinal scale provides information only about relative position in time.
 * Two other ISO standards are relevant to describing temporal objects:  ISO 8601 describes encodings for time instants and time periods, as text strings with particular structure and punctuation; ISO 11404 provides a detailed description of time intervals as part of a general discussion of language independent datatypes.  
 * The temporal schemas cover two interrelated topics and provide basic schema components for representing temporal instants and periods, temporal topology, and reference systems; more specialized schema components defines components used for dynamic features. Instances of temporal geometric types are used as values for the temporal properties of geographic features.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 9.
 * A GML feature is a (representation of a) identifiable real-world object in a selected domain of discourse. The feature schema provides a framework for the creation of GML features and feature collections.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 18.
 * The direction schema components provide the GML Application Schema developer with a standard property element to describe direction, and associated objects that may be used to express orientation, direction, heading, bearing or other directional aspects of geographic features.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 17.5.
 * The elements declared in this Clause build on other GML schema components, in particular gml:AbstractTimeObject, gml:AbstractGeometry, and the following types:  gml:MeasureType, gml:MeasureListType, gml:CodeType, gml:CodeOrNilReasonListType, gml:BooleanOrNilReasonListType, gml:IntegerOrNilReasonList.  
 * Of particular interest are elements that are the heads of substitution groups, and one named choice group. These are the primary reasons for the value objects schema, since they may act as variables in the definition of content models, such as Observations, when it is desired to permit alternative value types to occur some of which may have complex content such as arrays, geometry and time objects, and where it is useful not to prescribe the actual value type in advance. The members of the groups include quantities, category classifications, boolean, count, temporal and spatial values, and aggregates of these.  
 * The value objects are defined in a hierarchy. The following relationships are defined:
 * -	Concrete elements gml:Quantity, gml:Category, gml:Count and gml:Boolean are substitutable for the abstract element gml:AbstractScalarValue.  
 * -	Concrete elements gml:QuantityList, gml:CategoryList, gml:CountList and gml:BooleanList are substitutable for the abstract element gml:AbstractScalarValueList.  
 * -	Concrete element gml:ValueArray is substitutable for the concrete element gml:CompositeValue.  
 * -	Abstract elements gml:AbstractScalarValue and gml:AbstractScalarValueList, and concrete elements gml:CompositeValue, gml:ValueExtent, gml:CategoryExtent, gml:CountExtent and gml:QuantityExtent are substitutable for abstract element gml:AbstractValue.  
 * -	Abstract elements gml:AbstractValue, gml:AbstractTimeObject and gml:AbstractGeometry are all in a choice group named gml:Value, which is used for compositing in gml:CompositeValue and gml:ValueExtent.  
 * -	Schemas which need values may use the abstract element gml:AbstractValue in a content model in order to permit any of the gml:AbstractScalarValues, gml:AbstractScalarValueLists, gml:CompositeValue or gml:ValueExtent to occur in an instance, or the named group gml:Value to also permit gml:AbstractTimeObjects, gml:AbstractGeometrys.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 10.
 * Any geometry element that inherits the semantics of AbstractGeometryType may be viewed as a set of direct positions. 
 * All of the classes derived from AbstractGeometryType inherit an optional association to a coordinate reference system. All direct positions shall directly or indirectly be associated with a coordinate reference system. When geometry elements are aggregated in another geometry element (such as a MultiGeometry or GeometricComplex), which already has a coordinate reference system specified, then these elements are assumed to be in that same coordinate reference system unless otherwise specified.
 * The geometry model distinguishes geometric primitives, aggregates and complexes. 
 * Geometric primitives, i.e. instances of a subtype of AbstractGeometricPrimitiveType, will be open, that is, they will not contain their boundary points; curves will not contain their end points, surfaces will not contain their boundary curves, and solids will not contain their bounding surfaces.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 13.4.
 * The coordinate systems schema components can be divded into  three logical parts, which define elements and types for XML encoding of the definitions of:
 * -	Coordinate system axes
 * -	Abstract coordinate system
 * -	Multiple concrete types of spatial-temporal coordinate systems
 * These schema components encode the Coordinate System packages of the UML Models of ISO 19111 Clause 9 and ISO/DIS 19136 D.3.10.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 13.5
 * The datums schema components can be divided into three logical parts, which define elements and types for XML encoding of the definitions of:
 * -	Abstract datum
 * -	Geodetic datums, including ellipsoid and prime meridian
 * -	Multiple other concrete types of spatial or temporal datums
 * These schema components encode the Datum packages of the UML Models of ISO 19111 Clause 10 and ISO/DIS 19136 D.3.10.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 13.6.
 * The spatial or temporal coordinate operations schema components can be divided into five logical parts, which define elements and types for XML encoding of the definitions of:
 * -	Multiple abstract coordinate operations
 * -	Multiple concrete types of coordinate operations, including Transformations and Conversions
 * -	Abstract and concrete parameter values and groups
 * -	Operation methods
 * -	Abstract and concrete operation parameters and groups
 * These schema component encodes the Coordinate Operation package of the UML Model for ISO 19111 Clause 11.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 13.2.
 * The reference systems schema components have two logical parts, which define elements and types for XML encoding of the definitions of:
 * -	Identified Object, inherited by the ten types of GML objects used for coordinate reference systems and coordinate operations
 * -	High-level part of the definitions of coordinate reference systems
 * This schema encodes the Identified Object and Reference System packages of the UML Model for ISO 19111.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 17.3.
 * gml:MeasureType is defined in the basicTypes schema.  The measure types defined here correspond with a set of convenience measure types described in ISO/TS 19103.  The XML implementation is based on the XML Schema simple type "double" which supports both decimal and scientific notation, and includes an XML attribute "uom" which refers to the units of measure for the value.  Note that, there is no requirement to store values using any particular format, and applications receiving elements of this type may choose to coerce the data to any other type as convenient.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 17.2.
 * Several GML Schema components concern or require a reference scale or units of measure.  Units are required for quantities that may occur as values of properties of feature types, as the results of observations, in the range parameters of a coverage, and for measures used in Coordinate Reference System definitions. 
 * The basic unit definition is an extension of the general gml:Definition element defined in 16.2.1.  Three specialized elements for unit definition are further derived from this. 
 * This model is based on the SI system of units [ISO 1000], which distinguishes between Base Units and Derived Units.  
 * -	Base Units are the preferred units for a set of orthogonal fundamental quantities which define the particular system of units, which may not be derived by combination of other base units.  
 * -	Derived Units are the preferred units for other quantities in the system, which may be defined by algebraic combination of the base units.  
 * In some application areas Conventional units are used, which may be converted to the preferred units using a scaling factor or a formula which defines a re-scaling and offset.  The set of preferred units for all physical quantity types in a particular system of units is composed of the union of its base units and derived units.  
 * Unit definitions are substitutable for the gml:Definition element declared as part of the dictionary model.  A dictionary that contains only unit definitions and references to unit definitions is a units dictionary.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * Geographic MetaData (GMD) extensible markup language is a component of the XML Schema Implementation of Geographic Information Metadata documented in ISO/TS 19139:2007. GMD includes all the definitions of http://www.isotc211.org/2005/gmd namespace. The root document of this namespace is the file gmd.xsd.
 * Geographic MetaData (GMD) extensible markup language is a component of the XML Schema Implementation of Geographic Information Metadata documented in ISO/TS 19139:2007. GMD includes all the definitions of http://www.isotc211.org/2005/gmd namespace. The root document of this namespace is the file gmd.xsd. This metadataApplication.xsd schema implements the UML conceptual schema defined in A.2.12 of ISO 19115:2003. It contains the implementation of the class: MD_ApplicationSchemaInformation.
 * See ISO/DIS 19136 20.2.
 * An implicit description of geometry is one in which the items of the geometry do not explicitly appear in the encoding.  Instead, a compact notation records a set of parameters, and a set of objects may be generated using a rule with these parameters.  This Clause provides grid geometries that are used in the description of gridded coverages and other applications.
 * In GML two grid structures are defined, namely gml:Grid and gml:RectifiedGrid.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 12.3.
 * Geometric aggregates (i.e. instances of a subtype of gml:AbstractGeometricAggregateType) are arbitrary aggregations of geometry elements. They are not assumed to have any additional internal structure and are used to "collect" pieces of geometry of a specified type. Application schemas may use aggregates for features that use multiple geometric objects in their representations.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 Clause 11.
 * Beside the "simple" geometric primitives specified in the previous Clause, this Clause specifies additional primitives to describe real world situations which require a more expressive geometry model.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 12.2.
 * Geometric complexes (i.e. instances of gml:GeometricComplexType) are closed collections of geometric primitives, i.e. they will contain their boundaries. 
 * A geometric complex (gml:GeometricComplex) is defined by ISO 19107:2003, 6.6.1 as "a set of primitive geometric objects (in a common coordinate system) whose interiors are disjoint. Further, if a primitive is in a geometric complex, then there exists a set of primitives in that complex whose point-wise union is the boundary of this first primitive."
 * A geometric composite (gml:CompositeCurve, gml:CompositeSurface and gml:CompositeSolid) represents a geometric complex with an underlying core geometry that is isomorphic to a primitive, i.e. it can be viewed as a primitive and as a complex. See ISO 19107:2003, 6.1 and 6.6.3 for more details on the nature of composite geometries.
 * Geometric complexes and composites are intended to be used in application schemas where the sharing of geometry is important.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * See ISO/DIS 19136 8.2.
 * W3C XML Schema provides a set of built-in "simple" types which define methods for representing values as literals without internal markup.  These are described in W3C XML Schema Part 2:2001.  Because GML is an XML encoding in which instances are described using XML Schema, these simple types shall be used as far as possible and practical for the representation of data types.  W3C XML Schema also provides methods for defining 
 * -	new simple types by restriction and combination of the built-in types, and 
 * -	complex types, with simple content, but which also have XML attributes.  
 * In many places where a suitable built-in simple type is not available, simple content types derived using the XML Schema mechanisms are used for the representation of data types in GML.  
 * A set of these simple content types that are required by several GML components are defined in the basicTypes schema, as well as some elements based on them. These are primarily based around components needed to record amounts, counts, flags and terms, together with support for exceptions or null values.
 * 
 * GML is an OGC Standard.
 * Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This schema document provides attribute declarations and
 * attribute group, complex type and simple type definitions which can be used in
 * the construction of user schemas to define the structure of particular linking
 * constructs, e.g.
 * 
 * <xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
 *            xmlns:xl="http://www.w3.org/1999/xlink">
 * 
 *  <xs:import namespace="http://www.w3.org/1999/xlink"
 *             location="http://www.w3.org/1999/xlink.xsd">
 * 
 *  <xs:element name="mySimple">
 *   <xs:complexType>
 *    ...
 *    <xs:attributeGroup ref="xl:simpleAttrs"/>
 *    ...
 *   </xs:complexType>
 *  </xs:element>
 *  ...
 * </xs:schema>
 * 
 *      
 *   <div xmlns="http://www.w3.org/1999/xhtml">
 *         
 *     <h1>About the XML namespace</h1>
 *         
 *     <div class="bodytext">
 *            
 *       <p>
 *       This schema document describes the XML namespace, in a form
 *       suitable for import by other schema documents.
 *      </p>
 *            
 *       <p>
 *               See 
 *         <a href="http://www.w3.org/XML/1998/namespace.html">
 *       http://www.w3.org/XML/1998/namespace.html</a>
 *          and
 *       
 *         <a href="http://www.w3.org/TR/REC-xml">
 *       http://www.w3.org/TR/REC-xml</a>
 *          for information 
 *       about this namespace.
 *      
 *       </p>
 *            
 *       <p>
 *       Note that local names in this namespace are intended to be
 *       defined only by the World Wide Web Consortium or its subgroups.
 *       The names currently defined in this namespace are listed below.
 *       They should not be used with conflicting semantics by any Working
 *       Group, specification, or document instance.
 *      </p>
 *            
 *       <p>
 *            
 *       See further below in this document for more information about 
 *         <a href="#usage">how to refer to this schema document from your own
 *       XSD schema documents</a>
 *          and about 
 *         <a href="#nsversioning">the
 *       namespace-versioning policy governing this schema document</a>
 *         .
 *      
 *       </p>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * 
 *      
 *   <div xmlns="http://www.w3.org/1999/xhtml">
 *        
 *     
 *     <h3>Father (in any context at all)</h3>
 *      
 * 
 *     
 *     <div class="bodytext">
 *            
 *       <p>
 *       denotes Jon Bosak, the chair of 
 *       the original XML Working Group.  This name is reserved by 
 *       the following decision of the W3C XML Plenary and 
 *       XML Coordination groups:
 *      </p>
 *            
 *       <blockquote>
 *                
 *         <p>
 * 	In appreciation for his vision, leadership and
 * 	dedication the W3C XML Plenary on this 10th day of
 * 	February, 2000, reserves for Jon Bosak in perpetuity
 * 	the XML name "xml:Father".
 *        </p>
 *              
 *       </blockquote>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * 
 *      
 *   <div id="usage" xml:id="usage" xmlns="http://www.w3.org/1999/xhtml">
 *         
 *     <h2>
 *       <a name="usage">About this schema document</a>
 *     </h2>
 *         
 *     <div class="bodytext">
 *            
 *       <p>
 *               This schema defines attributes and an attribute group suitable
 *       for use by schemas wishing to allow 
 *         <code>xml:base</code>
 *         ,
 *       
 *         <code>xml:lang</code>
 *         , 
 *         <code>xml:space</code>
 *          or
 *       
 *         <code>xml:id</code>
 *          attributes on elements they define.
 *      
 *       </p>
 *            
 *       <p>
 *       To enable this, such a schema must import this schema for
 *       the XML namespace, e.g. as follows:
 *      </p>
 *            
 *       <pre>
 *           &lt;schema . . .&gt;
 *            . . .
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2001/xml.xsd"/&gt;
 *      </pre>
 *            
 *       <p>
 *       or
 *      </p>
 *            
 *       <pre>
 *            &lt;import namespace="http://www.w3.org/XML/1998/namespace"
 *                       schemaLocation="http://www.w3.org/2009/01/xml.xsd"/&gt;
 *      </pre>
 *            
 *       <p>
 *       Subsequently, qualified reference to any of the attributes or the
 *       group defined below will have the desired effect, e.g.
 *      </p>
 *            
 *       <pre>
 *           &lt;type . . .&gt;
 *            . . .
 *            &lt;attributeGroup ref="xml:specialAttrs"/&gt;
 *      </pre>
 *            
 *       <p>
 *       will define a type which will schema-validate an instance element
 *       with any of those attributes.
 *      </p>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * 
 *      
 *   <div id="nsversioning" xml:id="nsversioning" xmlns="http://www.w3.org/1999/xhtml">
 *         
 *     <h2>
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *     </h2>
 *         
 *     <div class="bodytext">
 *            
 *       <p>
 *               In keeping with the XML Schema WG's standard versioning
 *       policy, this schema document will persist at
 *       
 *         <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd</a>
 *         .
 *      
 *       </p>
 *            
 *       <p>
 *               At the date of issue it can also be found at
 *       
 *         <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd</a>
 *         .
 *      
 *       </p>
 *            
 *       <p>
 *               The schema document at that URI may however change in the future,
 *       in order to remain compatible with the latest version of XML
 *       Schema itself, or with the XML namespace itself.  In other words,
 *       if the XML Schema or XML namespaces change, the version of this
 *       document at 
 *         <a href="http://www.w3.org/2001/xml.xsd">
 *        http://www.w3.org/2001/xml.xsd 
 *       </a>
 *          
 *       will change accordingly; the version at 
 *       
 *         <a href="http://www.w3.org/2009/01/xml.xsd">
 *        http://www.w3.org/2009/01/xml.xsd 
 *       </a>
 *          
 *       will not change.
 *      
 *       </p>
 *            
 *       <p>
 *       Previous dated (and unchanging) versions of this schema 
 *       document are at:
 *      </p>
 *            
 *       <ul>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *         </li>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *         </li>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *         </li>
 *               
 *         <li>
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *         </li>
 *              
 *       </ul>
 *           
 *     </div>
 *        
 *   </div>
 *     
 * 
 * See ISO/DIS 19136 Clause 10.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * Geographic COmmon (GCO) extensible markup language is a component of the XML Schema Implementation of Geographic Information Metadata documented in ISO/TS 19139:2007. GCO includes all the definitions of http://www.isotc211.org/2005/gco namespace. The root document of this namespace is the file gco.xsd.
 * Geographic COmmon (GCO) extensible markup language is a component of the XML Schema Implementation of Geographic
 * Information Metadata documented in ISO/TS 19139:2007. GCO includes all the definitions of http://www.isotc211.org/2005/gco namespace. The root document of this namespace is the file gco.xsd. This basicTypes.xsd schema implements concepts from the "basic types" package of ISO/TS 19103.
 * Geographic COmmon (GCO) extensible markup language is a component of the XML Schema Implementation of Geographic
 * Information Metadata documented in ISO/TS 19139:2007. GCO includes all the definitions of http://www.isotc211.org/2005/gco namespace. The root document of this namespace is the file gco.xsd. This gcoBase.xsd schema provides:
 * 		1.  tools to handle specific objects like "code lists" and "record";
 * 		2. Some XML types representing that do not follow the general encoding rules.
 * <!-- end-model-doc -->
 * @see org.isotc211._2005.gts.GTSFactory
 * @model kind="package"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:gml:3.2.2 appinfo='gml.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:dynamicFeature:3.2.2 appinfo='dynamicFeature.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:topology:3.2.2 appinfo='topology.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:coverage:3.2.2 appinfo='coverage.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:coordinateReferenceSystems:3.2.2 appinfo='coordinateReferenceSystems.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:observation:3.2.2 appinfo='observation.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:temporalReferenceSystems:3.2.2 appinfo='temporalReferenceSystems.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:deprecatedTypes:3.2.2 appinfo='deprecatedTypes.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:temporalTopology:3.2.2 appinfo='temporalTopology.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dictionary:v3.2.1 appinfo='dictionary.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:gmlBase:3.2.2 appinfo='gmlBase.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:temporal:3.2.2 appinfo='temporal.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:feature:3.2.2 appinfo='feature.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:direction:3.2.2 appinfo='direction.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:valueObjects:3.2.2 appinfo='valueObjects.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:geometryBasic0d1d:3.2.2 appinfo='geometryBasic0d1d.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:coordinateSystems:3.2.2 appinfo='coordinateSystems.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:datums:3.2.2 appinfo='datums.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:coordinateOperations:3.2.2 appinfo='coordinateOperations.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:referenceSystems:3.2.2 appinfo='referenceSystems.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:measures:3.2.2 appinfo='measures.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:units:3.2.2 appinfo='units.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:grids:3.2.2 appinfo='grids.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:geometryAggregates:3.2.2 appinfo='geometryAggregates.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:geometryPrimitives:3.2.2 appinfo='geometryPrimitives.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:geometryComplexes:3.2.2 appinfo='geometryComplexes.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:basicTypes:3.2.2 appinfo='basicTypes.xsd'"
 *        annotation="urn:x-ogc:specification:gml:schema-xsd:geometryBasic2d:3.2.2 appinfo='geometryBasic2d.xsd'"
 * @generated
 */
@ProviderType
@EPackage(uri = GTSPackage.eNS_URI, genModel = "/model/gml.genmodel", genModelSourceLocations = {"model/gml.genmodel","net.opengis.gml3.model/model/gml.genmodel"}, ecore="/model/gts.ecore", ecoreSourceLocations="/model/gts.ecore")
public interface GTSPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.isotc211.org/2005/gts";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GTSPackage eINSTANCE = org.isotc211._2005.gts.impl.GTSPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gts.impl.TMPeriodDurationPropertyTypeImpl <em>TM Period Duration Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gts.impl.TMPeriodDurationPropertyTypeImpl
	 * @see org.isotc211._2005.gts.impl.GTSPackageImpl#getTMPeriodDurationPropertyType()
	 * @generated
	 */
	int TM_PERIOD_DURATION_PROPERTY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>TM Period Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PERIOD_DURATION_PROPERTY_TYPE__TM_PERIOD_DURATION = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PERIOD_DURATION_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>TM Period Duration Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PERIOD_DURATION_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>TM Period Duration Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PERIOD_DURATION_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gts.impl.TMPrimitivePropertyTypeImpl <em>TM Primitive Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gts.impl.TMPrimitivePropertyTypeImpl
	 * @see org.isotc211._2005.gts.impl.GTSPackageImpl#getTMPrimitivePropertyType()
	 * @generated
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Time Primitive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__ABSTRACT_TIME_PRIMITIVE = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__NIL_REASON = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE__UUIDREF = 10;

	/**
	 * The number of structural features of the '<em>TM Primitive Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>TM Primitive Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TM_PRIMITIVE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gts.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gts.impl.DocumentRootImpl
	 * @see org.isotc211._2005.gts.impl.GTSPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The feature id for the '<em><b>TM Period Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TM_PERIOD_DURATION = 3;

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
	 * Returns the meta object for class '{@link org.isotc211._2005.gts.TMPeriodDurationPropertyType <em>TM Period Duration Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TM Period Duration Property Type</em>'.
	 * @see org.isotc211._2005.gts.TMPeriodDurationPropertyType
	 * @generated
	 */
	EClass getTMPeriodDurationPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPeriodDurationPropertyType#getTMPeriodDuration <em>TM Period Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TM Period Duration</em>'.
	 * @see org.isotc211._2005.gts.TMPeriodDurationPropertyType#getTMPeriodDuration()
	 * @see #getTMPeriodDurationPropertyType()
	 * @generated
	 */
	EAttribute getTMPeriodDurationPropertyType_TMPeriodDuration();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPeriodDurationPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gts.TMPeriodDurationPropertyType#getNilReason()
	 * @see #getTMPeriodDurationPropertyType()
	 * @generated
	 */
	EAttribute getTMPeriodDurationPropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gts.TMPrimitivePropertyType <em>TM Primitive Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TM Primitive Property Type</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType
	 * @generated
	 */
	EClass getTMPrimitivePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getAbstractTimePrimitiveGroup <em>Abstract Time Primitive Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Time Primitive Group</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getAbstractTimePrimitiveGroup()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EAttribute getTMPrimitivePropertyType_AbstractTimePrimitiveGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getAbstractTimePrimitive <em>Abstract Time Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Time Primitive</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getAbstractTimePrimitive()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EReference getTMPrimitivePropertyType_AbstractTimePrimitive();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getActuate()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EAttribute getTMPrimitivePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getArcrole()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EAttribute getTMPrimitivePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getHref()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EAttribute getTMPrimitivePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getNilReason()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EAttribute getTMPrimitivePropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getRole()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EAttribute getTMPrimitivePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getShow()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EAttribute getTMPrimitivePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getTitle()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EAttribute getTMPrimitivePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getType()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EAttribute getTMPrimitivePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.TMPrimitivePropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gts.TMPrimitivePropertyType#getUuidref()
	 * @see #getTMPrimitivePropertyType()
	 * @generated
	 */
	EAttribute getTMPrimitivePropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gts.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.isotc211._2005.gts.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gts.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.isotc211._2005.gts.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.isotc211._2005.gts.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.isotc211._2005.gts.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.isotc211._2005.gts.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.isotc211._2005.gts.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gts.DocumentRoot#getTMPeriodDuration <em>TM Period Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TM Period Duration</em>'.
	 * @see org.isotc211._2005.gts.DocumentRoot#getTMPeriodDuration()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_TMPeriodDuration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GTSFactory getGTSFactory();

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
		 * The meta object literal for the '{@link org.isotc211._2005.gts.impl.TMPeriodDurationPropertyTypeImpl <em>TM Period Duration Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gts.impl.TMPeriodDurationPropertyTypeImpl
		 * @see org.isotc211._2005.gts.impl.GTSPackageImpl#getTMPeriodDurationPropertyType()
		 * @generated
		 */
		EClass TM_PERIOD_DURATION_PROPERTY_TYPE = eINSTANCE.getTMPeriodDurationPropertyType();

		/**
		 * The meta object literal for the '<em><b>TM Period Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PERIOD_DURATION_PROPERTY_TYPE__TM_PERIOD_DURATION = eINSTANCE.getTMPeriodDurationPropertyType_TMPeriodDuration();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PERIOD_DURATION_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getTMPeriodDurationPropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gts.impl.TMPrimitivePropertyTypeImpl <em>TM Primitive Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gts.impl.TMPrimitivePropertyTypeImpl
		 * @see org.isotc211._2005.gts.impl.GTSPackageImpl#getTMPrimitivePropertyType()
		 * @generated
		 */
		EClass TM_PRIMITIVE_PROPERTY_TYPE = eINSTANCE.getTMPrimitivePropertyType();

		/**
		 * The meta object literal for the '<em><b>Abstract Time Primitive Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PRIMITIVE_PROPERTY_TYPE__ABSTRACT_TIME_PRIMITIVE_GROUP = eINSTANCE.getTMPrimitivePropertyType_AbstractTimePrimitiveGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Time Primitive</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TM_PRIMITIVE_PROPERTY_TYPE__ABSTRACT_TIME_PRIMITIVE = eINSTANCE.getTMPrimitivePropertyType_AbstractTimePrimitive();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PRIMITIVE_PROPERTY_TYPE__ACTUATE = eINSTANCE.getTMPrimitivePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PRIMITIVE_PROPERTY_TYPE__ARCROLE = eINSTANCE.getTMPrimitivePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PRIMITIVE_PROPERTY_TYPE__HREF = eINSTANCE.getTMPrimitivePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PRIMITIVE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getTMPrimitivePropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PRIMITIVE_PROPERTY_TYPE__ROLE = eINSTANCE.getTMPrimitivePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PRIMITIVE_PROPERTY_TYPE__SHOW = eINSTANCE.getTMPrimitivePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PRIMITIVE_PROPERTY_TYPE__TITLE = eINSTANCE.getTMPrimitivePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PRIMITIVE_PROPERTY_TYPE__TYPE = eINSTANCE.getTMPrimitivePropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TM_PRIMITIVE_PROPERTY_TYPE__UUIDREF = eINSTANCE.getTMPrimitivePropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gts.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gts.impl.DocumentRootImpl
		 * @see org.isotc211._2005.gts.impl.GTSPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>TM Period Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__TM_PERIOD_DURATION = eINSTANCE.getDocumentRoot_TMPeriodDuration();

	}

} //GTSPackage
