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
package org.isotc211._2005.gco;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * Geographic COmmon (GCO) extensible markup language is a component of the XML Schema Implementation of Geographic
 * Information Metadata documented in ISO/TS 19139:2007. GCO includes all the definitions of http://www.isotc211.org/2005/gco namespace. The root document of this namespace is the file gco.xsd. This gcoBase.xsd schema provides:
 * 		1.  tools to handle specific objects like "code lists" and "record";
 * 		2. Some XML types representing that do not follow the general encoding rules.
 * Geographic COmmon (GCO) extensible markup language is a component of the XML Schema Implementation of Geographic Information Metadata documented in ISO/TS 19139:2007. GCO includes all the definitions of http://www.isotc211.org/2005/gco namespace. The root document of this namespace is the file gco.xsd.
 * Geographic COmmon (GCO) extensible markup language is a component of the XML Schema Implementation of Geographic
 * Information Metadata documented in ISO/TS 19139:2007. GCO includes all the definitions of http://www.isotc211.org/2005/gco namespace. The root document of this namespace is the file gco.xsd. This basicTypes.xsd schema implements concepts from the "basic types" package of ISO/TS 19103.
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
 * See ISO/DIS 19136 Clause 10.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2007, 2010, 2016, 2018 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * <!-- end-model-doc -->
 * @see org.isotc211._2005.gco.GCOFactory
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
@EPackage(uri = GCOPackage.eNS_URI, genModel = "/model/gml.genmodel", genModelSourceLocations = {"model/gml.genmodel","net.opengis.gml3.model/model/gml.genmodel"}, ecore="/model/gco.ecore", ecoreSourceLocations="/model/gco.ecore")
public interface GCOPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gco";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.isotc211.org/2005/gco";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gco";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GCOPackage eINSTANCE = org.isotc211._2005.gco.impl.GCOPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.AbstractObjectTypeImpl <em>Abstract Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.AbstractObjectTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getAbstractObjectType()
	 * @generated
	 */
	int ABSTRACT_OBJECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_TYPE__UUID = 1;

	/**
	 * The number of structural features of the '<em>Abstract Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Abstract Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_OBJECT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.AnglePropertyTypeImpl <em>Angle Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.AnglePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getAnglePropertyType()
	 * @generated
	 */
	int ANGLE_PROPERTY_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_PROPERTY_TYPE__ANGLE = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Angle Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Angle Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.BinaryPropertyTypeImpl <em>Binary Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.BinaryPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getBinaryPropertyType()
	 * @generated
	 */
	int BINARY_PROPERTY_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY_TYPE__BINARY = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Binary Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binary Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.BinaryTypeImpl <em>Binary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.BinaryTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__SRC = 1;

	/**
	 * The number of structural features of the '<em>Binary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.BooleanPropertyTypeImpl <em>Boolean Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.BooleanPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getBooleanPropertyType()
	 * @generated
	 */
	int BOOLEAN_PROPERTY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_TYPE__BOOLEAN = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Boolean Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Boolean Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.CharacterStringPropertyTypeImpl <em>Character String Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.CharacterStringPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getCharacterStringPropertyType()
	 * @generated
	 */
	int CHARACTER_STRING_PROPERTY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Character String Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Character String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING = 1;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_PROPERTY_TYPE__NIL_REASON = 2;

	/**
	 * The number of structural features of the '<em>Character String Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Character String Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHARACTER_STRING_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.CodeListValueTypeImpl <em>Code List Value Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.CodeListValueTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getCodeListValueType()
	 * @generated
	 */
	int CODE_LIST_VALUE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LIST_VALUE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Code List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LIST_VALUE_TYPE__CODE_LIST = 1;

	/**
	 * The feature id for the '<em><b>Code List Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LIST_VALUE_TYPE__CODE_LIST_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Code Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LIST_VALUE_TYPE__CODE_SPACE = 3;

	/**
	 * The number of structural features of the '<em>Code List Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LIST_VALUE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Code List Value Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_LIST_VALUE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.DatePropertyTypeImpl <em>Date Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.DatePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDatePropertyType()
	 * @generated
	 */
	int DATE_PROPERTY_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PROPERTY_TYPE__DATE = 0;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PROPERTY_TYPE__DATE_TIME = 1;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PROPERTY_TYPE__NIL_REASON = 2;

	/**
	 * The number of structural features of the '<em>Date Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Date Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.DateTimePropertyTypeImpl <em>Date Time Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.DateTimePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDateTimePropertyType()
	 * @generated
	 */
	int DATE_TIME_PROPERTY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY_TYPE__DATE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Date Time Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date Time Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TIME_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.DecimalPropertyTypeImpl <em>Decimal Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.DecimalPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDecimalPropertyType()
	 * @generated
	 */
	int DECIMAL_PROPERTY_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_PROPERTY_TYPE__DECIMAL = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Decimal Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Decimal Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.DistancePropertyTypeImpl <em>Distance Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.DistancePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDistancePropertyType()
	 * @generated
	 */
	int DISTANCE_PROPERTY_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_PROPERTY_TYPE__DISTANCE = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Distance Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Distance Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.GenericNamePropertyTypeImpl <em>Generic Name Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.GenericNamePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getGenericNamePropertyType()
	 * @generated
	 */
	int GENERIC_NAME_PROPERTY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Abstract Generic Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Abstract Generic Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME = 1;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NAME_PROPERTY_TYPE__NIL_REASON = 2;

	/**
	 * The number of structural features of the '<em>Generic Name Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NAME_PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Generic Name Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_NAME_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.IntegerPropertyTypeImpl <em>Integer Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.IntegerPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getIntegerPropertyType()
	 * @generated
	 */
	int INTEGER_PROPERTY_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY_TYPE__INTEGER = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Integer Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Integer Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.LengthPropertyTypeImpl <em>Length Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.LengthPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getLengthPropertyType()
	 * @generated
	 */
	int LENGTH_PROPERTY_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Length Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PROPERTY_TYPE__LENGTH_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PROPERTY_TYPE__LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PROPERTY_TYPE__NIL_REASON = 2;

	/**
	 * The number of structural features of the '<em>Length Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Length Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.LocalNamePropertyTypeImpl <em>Local Name Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.LocalNamePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getLocalNamePropertyType()
	 * @generated
	 */
	int LOCAL_NAME_PROPERTY_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME_PROPERTY_TYPE__LOCAL_NAME = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Local Name Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Local Name Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_NAME_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.MultiplicityPropertyTypeImpl <em>Multiplicity Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.MultiplicityPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMultiplicityPropertyType()
	 * @generated
	 */
	int MULTIPLICITY_PROPERTY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE__MULTIPLICITY = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE__ARCROLE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE__NIL_REASON = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE__SHOW = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE__UUIDREF = 9;

	/**
	 * The number of structural features of the '<em>Multiplicity Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Multiplicity Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.MultiplicityRangePropertyTypeImpl <em>Multiplicity Range Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.MultiplicityRangePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMultiplicityRangePropertyType()
	 * @generated
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Multiplicity Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE__MULTIPLICITY_RANGE = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE__ARCROLE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE__NIL_REASON = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE__SHOW = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE__UUIDREF = 9;

	/**
	 * The number of structural features of the '<em>Multiplicity Range Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Multiplicity Range Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.ObjectReferencePropertyTypeImpl <em>Object Reference Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.ObjectReferencePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getObjectReferencePropertyType()
	 * @generated
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE__ACTUATE = 0;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE__ARCROLE = 1;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE__HREF = 2;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE__NIL_REASON = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE__SHOW = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE__TITLE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE__UUIDREF = 8;

	/**
	 * The number of structural features of the '<em>Object Reference Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Object Reference Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_REFERENCE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.RealPropertyTypeImpl <em>Real Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.RealPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getRealPropertyType()
	 * @generated
	 */
	int REAL_PROPERTY_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PROPERTY_TYPE__REAL = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Real Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Real Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.DocumentRootImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 19;

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
	 * The feature id for the '<em><b>Abstract Generic Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_GENERIC_NAME = 3;

	/**
	 * The feature id for the '<em><b>Abstract Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT_OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ANGLE = 5;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEASURE = 6;

	/**
	 * The feature id for the '<em><b>Binary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BINARY = 7;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOLEAN = 8;

	/**
	 * The feature id for the '<em><b>Character String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHARACTER_STRING = 9;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE = 10;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE_TIME = 11;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DECIMAL = 12;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISTANCE = 13;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LENGTH = 14;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTEGER = 15;

	/**
	 * The feature id for the '<em><b>Local Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCAL_NAME = 16;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEMBER_NAME = 17;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTIPLICITY = 18;

	/**
	 * The feature id for the '<em><b>Multiplicity Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MULTIPLICITY_RANGE = 19;

	/**
	 * The feature id for the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__REAL = 20;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECORD = 21;

	/**
	 * The feature id for the '<em><b>Record Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RECORD_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCALE = 23;

	/**
	 * The feature id for the '<em><b>Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCOPED_NAME = 24;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TYPE_NAME = 25;

	/**
	 * The feature id for the '<em><b>Unlimited Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UNLIMITED_INTEGER = 26;

	/**
	 * The feature id for the '<em><b>Iso Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ISO_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NIL_REASON = 28;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 29;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.MeasurePropertyTypeImpl <em>Measure Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.MeasurePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMeasurePropertyType()
	 * @generated
	 */
	int MEASURE_PROPERTY_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Measure Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_PROPERTY_TYPE__MEASURE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_PROPERTY_TYPE__MEASURE = 1;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_PROPERTY_TYPE__NIL_REASON = 2;

	/**
	 * The number of structural features of the '<em>Measure Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Measure Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.MemberNamePropertyTypeImpl <em>Member Name Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.MemberNamePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMemberNamePropertyType()
	 * @generated
	 */
	int MEMBER_NAME_PROPERTY_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Member Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE__MEMBER_NAME = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE__ARCROLE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE__NIL_REASON = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE__SHOW = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE__UUIDREF = 9;

	/**
	 * The number of structural features of the '<em>Member Name Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Member Name Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.MemberNameTypeImpl <em>Member Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.MemberNameTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMemberNameType()
	 * @generated
	 */
	int MEMBER_NAME_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_TYPE__UUID = ABSTRACT_OBJECT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>AName</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_TYPE__ANAME = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_TYPE__ATTRIBUTE_TYPE = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Member Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_NAME_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.MultiplicityRangeTypeImpl <em>Multiplicity Range Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.MultiplicityRangeTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMultiplicityRangeType()
	 * @generated
	 */
	int MULTIPLICITY_RANGE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_TYPE__UUID = ABSTRACT_OBJECT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_TYPE__LOWER = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_TYPE__UPPER = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multiplicity Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Multiplicity Range Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_RANGE_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.MultiplicityTypeImpl <em>Multiplicity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.MultiplicityTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMultiplicityType()
	 * @generated
	 */
	int MULTIPLICITY_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE__UUID = ABSTRACT_OBJECT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE__RANGE = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multiplicity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Multiplicity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLICITY_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.NumberPropertyTypeImpl <em>Number Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.NumberPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getNumberPropertyType()
	 * @generated
	 */
	int NUMBER_PROPERTY_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY_TYPE__REAL = 0;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY_TYPE__DECIMAL = 1;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY_TYPE__INTEGER = 2;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY_TYPE__NIL_REASON = 3;

	/**
	 * The number of structural features of the '<em>Number Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Number Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.RecordPropertyTypeImpl <em>Record Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.RecordPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getRecordPropertyType()
	 * @generated
	 */
	int RECORD_PROPERTY_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Record</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE__RECORD = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE__ARCROLE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE__NIL_REASON = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE__SHOW = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE__UUIDREF = 9;

	/**
	 * The number of structural features of the '<em>Record Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Record Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.RecordTypePropertyTypeImpl <em>Record Type Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.RecordTypePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getRecordTypePropertyType()
	 * @generated
	 */
	int RECORD_TYPE_PROPERTY_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Record Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_PROPERTY_TYPE__RECORD_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Record Type Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Record Type Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.RecordTypeTypeImpl <em>Record Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.RecordTypeTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getRecordTypeType()
	 * @generated
	 */
	int RECORD_TYPE_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_TYPE__ARCROLE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_TYPE__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_TYPE__SHOW = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_TYPE__TITLE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_TYPE__TYPE = 7;

	/**
	 * The number of structural features of the '<em>Record Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Record Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORD_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.ScalePropertyTypeImpl <em>Scale Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.ScalePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getScalePropertyType()
	 * @generated
	 */
	int SCALE_PROPERTY_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_PROPERTY_TYPE__SCALE = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Scale Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scale Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.ScopedNamePropertyTypeImpl <em>Scoped Name Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.ScopedNamePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getScopedNamePropertyType()
	 * @generated
	 */
	int SCOPED_NAME_PROPERTY_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Scoped Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_NAME_PROPERTY_TYPE__SCOPED_NAME = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_NAME_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Scoped Name Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_NAME_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scoped Name Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPED_NAME_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.TypeNamePropertyTypeImpl <em>Type Name Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.TypeNamePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getTypeNamePropertyType()
	 * @generated
	 */
	int TYPE_NAME_PROPERTY_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE__TYPE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE__ACTUATE = 1;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE__ARCROLE = 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE__HREF = 3;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE__NIL_REASON = 4;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE__ROLE = 5;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE__SHOW = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE__TYPE = 8;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE__UUIDREF = 9;

	/**
	 * The number of structural features of the '<em>Type Name Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Type Name Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.TypeNameTypeImpl <em>Type Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.TypeNameTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getTypeNameType()
	 * @generated
	 */
	int TYPE_NAME_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_TYPE__ID = ABSTRACT_OBJECT_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Uuid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_TYPE__UUID = ABSTRACT_OBJECT_TYPE__UUID;

	/**
	 * The feature id for the '<em><b>AName</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_TYPE__ANAME = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_TYPE_FEATURE_COUNT = ABSTRACT_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_TYPE_OPERATION_COUNT = ABSTRACT_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.UnitOfMeasurePropertyTypeImpl <em>Unit Of Measure Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.UnitOfMeasurePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUnitOfMeasurePropertyType()
	 * @generated
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Unit Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Unit Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__UNIT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__NIL_REASON = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE__UUIDREF = 10;

	/**
	 * The number of structural features of the '<em>Unit Of Measure Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Unit Of Measure Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OF_MEASURE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.UnlimitedIntegerPropertyTypeImpl <em>Unlimited Integer Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.UnlimitedIntegerPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUnlimitedIntegerPropertyType()
	 * @generated
	 */
	int UNLIMITED_INTEGER_PROPERTY_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Unlimited Integer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER = 0;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_INTEGER_PROPERTY_TYPE__NIL_REASON = 1;

	/**
	 * The number of structural features of the '<em>Unlimited Integer Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_INTEGER_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unlimited Integer Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_INTEGER_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.UnlimitedIntegerTypeImpl <em>Unlimited Integer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.UnlimitedIntegerTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUnlimitedIntegerType()
	 * @generated
	 */
	int UNLIMITED_INTEGER_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_INTEGER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Is Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_INTEGER_TYPE__IS_INFINITE = 1;

	/**
	 * The number of structural features of the '<em>Unlimited Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_INTEGER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Unlimited Integer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLIMITED_INTEGER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.UomAnglePropertyTypeImpl <em>Uom Angle Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.UomAnglePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomAnglePropertyType()
	 * @generated
	 */
	int UOM_ANGLE_PROPERTY_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Unit Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Unit Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__UNIT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__NIL_REASON = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE__UUIDREF = 10;

	/**
	 * The number of structural features of the '<em>Uom Angle Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Uom Angle Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_ANGLE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.UomAreaPropertyTypeImpl <em>Uom Area Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.UomAreaPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomAreaPropertyType()
	 * @generated
	 */
	int UOM_AREA_PROPERTY_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Unit Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Unit Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__UNIT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__NIL_REASON = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE__UUIDREF = 10;

	/**
	 * The number of structural features of the '<em>Uom Area Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Uom Area Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_AREA_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.UomLengthPropertyTypeImpl <em>Uom Length Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.UomLengthPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomLengthPropertyType()
	 * @generated
	 */
	int UOM_LENGTH_PROPERTY_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Unit Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Unit Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__UNIT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__NIL_REASON = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE__UUIDREF = 10;

	/**
	 * The number of structural features of the '<em>Uom Length Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Uom Length Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_LENGTH_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.UomScalePropertyTypeImpl <em>Uom Scale Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.UomScalePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomScalePropertyType()
	 * @generated
	 */
	int UOM_SCALE_PROPERTY_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Unit Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Unit Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__UNIT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__NIL_REASON = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE__UUIDREF = 10;

	/**
	 * The number of structural features of the '<em>Uom Scale Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Uom Scale Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_SCALE_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.UomTimePropertyTypeImpl <em>Uom Time Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.UomTimePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomTimePropertyType()
	 * @generated
	 */
	int UOM_TIME_PROPERTY_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Unit Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Unit Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__UNIT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__NIL_REASON = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE__UUIDREF = 10;

	/**
	 * The number of structural features of the '<em>Uom Time Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Uom Time Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_TIME_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.UomVelocityPropertyTypeImpl <em>Uom Velocity Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.UomVelocityPropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomVelocityPropertyType()
	 * @generated
	 */
	int UOM_VELOCITY_PROPERTY_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Unit Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Unit Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__UNIT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__NIL_REASON = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE__UUIDREF = 10;

	/**
	 * The number of structural features of the '<em>Uom Velocity Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Uom Velocity Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VELOCITY_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.isotc211._2005.gco.impl.UomVolumePropertyTypeImpl <em>Uom Volume Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.isotc211._2005.gco.impl.UomVolumePropertyTypeImpl
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomVolumePropertyType()
	 * @generated
	 */
	int UOM_VOLUME_PROPERTY_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Unit Definition Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Unit Definition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__UNIT_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Actuate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__ACTUATE = 2;

	/**
	 * The feature id for the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__ARCROLE = 3;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__HREF = 4;

	/**
	 * The feature id for the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__NIL_REASON = 5;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__ROLE = 6;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__SHOW = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Uuidref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE__UUIDREF = 10;

	/**
	 * The number of structural features of the '<em>Uom Volume Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Uom Volume Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UOM_VOLUME_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Date Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 43;


	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.AbstractObjectType <em>Abstract Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Object Type</em>'.
	 * @see org.isotc211._2005.gco.AbstractObjectType
	 * @generated
	 */
	EClass getAbstractObjectType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.AbstractObjectType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.isotc211._2005.gco.AbstractObjectType#getId()
	 * @see #getAbstractObjectType()
	 * @generated
	 */
	EAttribute getAbstractObjectType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.AbstractObjectType#getUuid <em>Uuid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuid</em>'.
	 * @see org.isotc211._2005.gco.AbstractObjectType#getUuid()
	 * @see #getAbstractObjectType()
	 * @generated
	 */
	EAttribute getAbstractObjectType_Uuid();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.AnglePropertyType <em>Angle Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle Property Type</em>'.
	 * @see org.isotc211._2005.gco.AnglePropertyType
	 * @generated
	 */
	EClass getAnglePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.AnglePropertyType#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see org.isotc211._2005.gco.AnglePropertyType#getAngle()
	 * @see #getAnglePropertyType()
	 * @generated
	 */
	EReference getAnglePropertyType_Angle();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.AnglePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.AnglePropertyType#getNilReason()
	 * @see #getAnglePropertyType()
	 * @generated
	 */
	EAttribute getAnglePropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.BinaryPropertyType <em>Binary Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Property Type</em>'.
	 * @see org.isotc211._2005.gco.BinaryPropertyType
	 * @generated
	 */
	EClass getBinaryPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.BinaryPropertyType#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary</em>'.
	 * @see org.isotc211._2005.gco.BinaryPropertyType#getBinary()
	 * @see #getBinaryPropertyType()
	 * @generated
	 */
	EReference getBinaryPropertyType_Binary();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.BinaryPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.BinaryPropertyType#getNilReason()
	 * @see #getBinaryPropertyType()
	 * @generated
	 */
	EAttribute getBinaryPropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Type</em>'.
	 * @see org.isotc211._2005.gco.BinaryType
	 * @generated
	 */
	EClass getBinaryType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.BinaryType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.isotc211._2005.gco.BinaryType#getValue()
	 * @see #getBinaryType()
	 * @generated
	 */
	EAttribute getBinaryType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.BinaryType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.isotc211._2005.gco.BinaryType#getSrc()
	 * @see #getBinaryType()
	 * @generated
	 */
	EAttribute getBinaryType_Src();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.BooleanPropertyType <em>Boolean Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Property Type</em>'.
	 * @see org.isotc211._2005.gco.BooleanPropertyType
	 * @generated
	 */
	EClass getBooleanPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.BooleanPropertyType#isBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean</em>'.
	 * @see org.isotc211._2005.gco.BooleanPropertyType#isBoolean()
	 * @see #getBooleanPropertyType()
	 * @generated
	 */
	EAttribute getBooleanPropertyType_Boolean();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.BooleanPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.BooleanPropertyType#getNilReason()
	 * @see #getBooleanPropertyType()
	 * @generated
	 */
	EAttribute getBooleanPropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.CharacterStringPropertyType <em>Character String Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Character String Property Type</em>'.
	 * @see org.isotc211._2005.gco.CharacterStringPropertyType
	 * @generated
	 */
	EClass getCharacterStringPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.CharacterStringPropertyType#getCharacterStringGroup <em>Character String Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Character String Group</em>'.
	 * @see org.isotc211._2005.gco.CharacterStringPropertyType#getCharacterStringGroup()
	 * @see #getCharacterStringPropertyType()
	 * @generated
	 */
	EAttribute getCharacterStringPropertyType_CharacterStringGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.CharacterStringPropertyType#getCharacterString <em>Character String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character String</em>'.
	 * @see org.isotc211._2005.gco.CharacterStringPropertyType#getCharacterString()
	 * @see #getCharacterStringPropertyType()
	 * @generated
	 */
	EAttribute getCharacterStringPropertyType_CharacterString();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.CharacterStringPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.CharacterStringPropertyType#getNilReason()
	 * @see #getCharacterStringPropertyType()
	 * @generated
	 */
	EAttribute getCharacterStringPropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.CodeListValueType <em>Code List Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code List Value Type</em>'.
	 * @see org.isotc211._2005.gco.CodeListValueType
	 * @generated
	 */
	EClass getCodeListValueType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.CodeListValueType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.isotc211._2005.gco.CodeListValueType#getValue()
	 * @see #getCodeListValueType()
	 * @generated
	 */
	EAttribute getCodeListValueType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.CodeListValueType#getCodeList <em>Code List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code List</em>'.
	 * @see org.isotc211._2005.gco.CodeListValueType#getCodeList()
	 * @see #getCodeListValueType()
	 * @generated
	 */
	EAttribute getCodeListValueType_CodeList();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.CodeListValueType#getCodeListValue <em>Code List Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code List Value</em>'.
	 * @see org.isotc211._2005.gco.CodeListValueType#getCodeListValue()
	 * @see #getCodeListValueType()
	 * @generated
	 */
	EAttribute getCodeListValueType_CodeListValue();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.CodeListValueType#getCodeSpace <em>Code Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Space</em>'.
	 * @see org.isotc211._2005.gco.CodeListValueType#getCodeSpace()
	 * @see #getCodeListValueType()
	 * @generated
	 */
	EAttribute getCodeListValueType_CodeSpace();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.DatePropertyType <em>Date Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Property Type</em>'.
	 * @see org.isotc211._2005.gco.DatePropertyType
	 * @generated
	 */
	EClass getDatePropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DatePropertyType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.isotc211._2005.gco.DatePropertyType#getDate()
	 * @see #getDatePropertyType()
	 * @generated
	 */
	EAttribute getDatePropertyType_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DatePropertyType#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see org.isotc211._2005.gco.DatePropertyType#getDateTime()
	 * @see #getDatePropertyType()
	 * @generated
	 */
	EAttribute getDatePropertyType_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DatePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.DatePropertyType#getNilReason()
	 * @see #getDatePropertyType()
	 * @generated
	 */
	EAttribute getDatePropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.DateTimePropertyType <em>Date Time Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Time Property Type</em>'.
	 * @see org.isotc211._2005.gco.DateTimePropertyType
	 * @generated
	 */
	EClass getDateTimePropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DateTimePropertyType#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see org.isotc211._2005.gco.DateTimePropertyType#getDateTime()
	 * @see #getDateTimePropertyType()
	 * @generated
	 */
	EAttribute getDateTimePropertyType_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DateTimePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.DateTimePropertyType#getNilReason()
	 * @see #getDateTimePropertyType()
	 * @generated
	 */
	EAttribute getDateTimePropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.DecimalPropertyType <em>Decimal Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Property Type</em>'.
	 * @see org.isotc211._2005.gco.DecimalPropertyType
	 * @generated
	 */
	EClass getDecimalPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DecimalPropertyType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see org.isotc211._2005.gco.DecimalPropertyType#getDecimal()
	 * @see #getDecimalPropertyType()
	 * @generated
	 */
	EAttribute getDecimalPropertyType_Decimal();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DecimalPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.DecimalPropertyType#getNilReason()
	 * @see #getDecimalPropertyType()
	 * @generated
	 */
	EAttribute getDecimalPropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.DistancePropertyType <em>Distance Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Property Type</em>'.
	 * @see org.isotc211._2005.gco.DistancePropertyType
	 * @generated
	 */
	EClass getDistancePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DistancePropertyType#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see org.isotc211._2005.gco.DistancePropertyType#getDistance()
	 * @see #getDistancePropertyType()
	 * @generated
	 */
	EReference getDistancePropertyType_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DistancePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.DistancePropertyType#getNilReason()
	 * @see #getDistancePropertyType()
	 * @generated
	 */
	EAttribute getDistancePropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.GenericNamePropertyType <em>Generic Name Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Name Property Type</em>'.
	 * @see org.isotc211._2005.gco.GenericNamePropertyType
	 * @generated
	 */
	EClass getGenericNamePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.GenericNamePropertyType#getAbstractGenericNameGroup <em>Abstract Generic Name Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Abstract Generic Name Group</em>'.
	 * @see org.isotc211._2005.gco.GenericNamePropertyType#getAbstractGenericNameGroup()
	 * @see #getGenericNamePropertyType()
	 * @generated
	 */
	EAttribute getGenericNamePropertyType_AbstractGenericNameGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.GenericNamePropertyType#getAbstractGenericName <em>Abstract Generic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Generic Name</em>'.
	 * @see org.isotc211._2005.gco.GenericNamePropertyType#getAbstractGenericName()
	 * @see #getGenericNamePropertyType()
	 * @generated
	 */
	EReference getGenericNamePropertyType_AbstractGenericName();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.GenericNamePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.GenericNamePropertyType#getNilReason()
	 * @see #getGenericNamePropertyType()
	 * @generated
	 */
	EAttribute getGenericNamePropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.IntegerPropertyType <em>Integer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Property Type</em>'.
	 * @see org.isotc211._2005.gco.IntegerPropertyType
	 * @generated
	 */
	EClass getIntegerPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.IntegerPropertyType#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see org.isotc211._2005.gco.IntegerPropertyType#getInteger()
	 * @see #getIntegerPropertyType()
	 * @generated
	 */
	EAttribute getIntegerPropertyType_Integer();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.IntegerPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.IntegerPropertyType#getNilReason()
	 * @see #getIntegerPropertyType()
	 * @generated
	 */
	EAttribute getIntegerPropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.LengthPropertyType <em>Length Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length Property Type</em>'.
	 * @see org.isotc211._2005.gco.LengthPropertyType
	 * @generated
	 */
	EClass getLengthPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.LengthPropertyType#getLengthGroup <em>Length Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Length Group</em>'.
	 * @see org.isotc211._2005.gco.LengthPropertyType#getLengthGroup()
	 * @see #getLengthPropertyType()
	 * @generated
	 */
	EAttribute getLengthPropertyType_LengthGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.LengthPropertyType#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see org.isotc211._2005.gco.LengthPropertyType#getLength()
	 * @see #getLengthPropertyType()
	 * @generated
	 */
	EReference getLengthPropertyType_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.LengthPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.LengthPropertyType#getNilReason()
	 * @see #getLengthPropertyType()
	 * @generated
	 */
	EAttribute getLengthPropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.LocalNamePropertyType <em>Local Name Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Name Property Type</em>'.
	 * @see org.isotc211._2005.gco.LocalNamePropertyType
	 * @generated
	 */
	EClass getLocalNamePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.LocalNamePropertyType#getLocalName <em>Local Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Name</em>'.
	 * @see org.isotc211._2005.gco.LocalNamePropertyType#getLocalName()
	 * @see #getLocalNamePropertyType()
	 * @generated
	 */
	EReference getLocalNamePropertyType_LocalName();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.LocalNamePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.LocalNamePropertyType#getNilReason()
	 * @see #getLocalNamePropertyType()
	 * @generated
	 */
	EAttribute getLocalNamePropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.MultiplicityPropertyType <em>Multiplicity Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Property Type</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType
	 * @generated
	 */
	EClass getMultiplicityPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.MultiplicityPropertyType#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType#getMultiplicity()
	 * @see #getMultiplicityPropertyType()
	 * @generated
	 */
	EReference getMultiplicityPropertyType_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityPropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType#getActuate()
	 * @see #getMultiplicityPropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityPropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityPropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType#getArcrole()
	 * @see #getMultiplicityPropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityPropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityPropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType#getHref()
	 * @see #getMultiplicityPropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityPropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType#getNilReason()
	 * @see #getMultiplicityPropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityPropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityPropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType#getRole()
	 * @see #getMultiplicityPropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityPropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityPropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType#getShow()
	 * @see #getMultiplicityPropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityPropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityPropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType#getTitle()
	 * @see #getMultiplicityPropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityPropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType#getType()
	 * @see #getMultiplicityPropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityPropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityPropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityPropertyType#getUuidref()
	 * @see #getMultiplicityPropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityPropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType <em>Multiplicity Range Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Range Property Type</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType
	 * @generated
	 */
	EClass getMultiplicityRangePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType#getMultiplicityRange <em>Multiplicity Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity Range</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType#getMultiplicityRange()
	 * @see #getMultiplicityRangePropertyType()
	 * @generated
	 */
	EReference getMultiplicityRangePropertyType_MultiplicityRange();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType#getActuate()
	 * @see #getMultiplicityRangePropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityRangePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType#getArcrole()
	 * @see #getMultiplicityRangePropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityRangePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType#getHref()
	 * @see #getMultiplicityRangePropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityRangePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType#getNilReason()
	 * @see #getMultiplicityRangePropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityRangePropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType#getRole()
	 * @see #getMultiplicityRangePropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityRangePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType#getShow()
	 * @see #getMultiplicityRangePropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityRangePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType#getTitle()
	 * @see #getMultiplicityRangePropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityRangePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType#getType()
	 * @see #getMultiplicityRangePropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityRangePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MultiplicityRangePropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangePropertyType#getUuidref()
	 * @see #getMultiplicityRangePropertyType()
	 * @generated
	 */
	EAttribute getMultiplicityRangePropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.ObjectReferencePropertyType <em>Object Reference Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Reference Property Type</em>'.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType
	 * @generated
	 */
	EClass getObjectReferencePropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ObjectReferencePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType#getActuate()
	 * @see #getObjectReferencePropertyType()
	 * @generated
	 */
	EAttribute getObjectReferencePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ObjectReferencePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType#getArcrole()
	 * @see #getObjectReferencePropertyType()
	 * @generated
	 */
	EAttribute getObjectReferencePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ObjectReferencePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType#getHref()
	 * @see #getObjectReferencePropertyType()
	 * @generated
	 */
	EAttribute getObjectReferencePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ObjectReferencePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType#getNilReason()
	 * @see #getObjectReferencePropertyType()
	 * @generated
	 */
	EAttribute getObjectReferencePropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ObjectReferencePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType#getRole()
	 * @see #getObjectReferencePropertyType()
	 * @generated
	 */
	EAttribute getObjectReferencePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ObjectReferencePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType#getShow()
	 * @see #getObjectReferencePropertyType()
	 * @generated
	 */
	EAttribute getObjectReferencePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ObjectReferencePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType#getTitle()
	 * @see #getObjectReferencePropertyType()
	 * @generated
	 */
	EAttribute getObjectReferencePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ObjectReferencePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType#getType()
	 * @see #getObjectReferencePropertyType()
	 * @generated
	 */
	EAttribute getObjectReferencePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ObjectReferencePropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.ObjectReferencePropertyType#getUuidref()
	 * @see #getObjectReferencePropertyType()
	 * @generated
	 */
	EAttribute getObjectReferencePropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.RealPropertyType <em>Real Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Property Type</em>'.
	 * @see org.isotc211._2005.gco.RealPropertyType
	 * @generated
	 */
	EClass getRealPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RealPropertyType#getReal <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real</em>'.
	 * @see org.isotc211._2005.gco.RealPropertyType#getReal()
	 * @see #getRealPropertyType()
	 * @generated
	 */
	EAttribute getRealPropertyType_Real();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RealPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.RealPropertyType#getNilReason()
	 * @see #getRealPropertyType()
	 * @generated
	 */
	EAttribute getRealPropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.isotc211._2005.gco.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.isotc211._2005.gco.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getAbstractGenericName <em>Abstract Generic Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Generic Name</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getAbstractGenericName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractGenericName();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getAbstractObject <em>Abstract Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract Object</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getAbstractObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AbstractObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getAngle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Angle();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getMeasure()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Measure();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getBinary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binary</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getBinary()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Binary();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DocumentRoot#isBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#isBoolean()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Boolean();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DocumentRoot#getCharacterString <em>Character String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character String</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getCharacterString()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_CharacterString();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DocumentRoot#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DocumentRoot#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getDateTime()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DocumentRoot#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getDecimal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Decimal();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getDistance()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Distance();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getLength()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DocumentRoot#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getInteger()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Integer();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getLocalName <em>Local Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Name</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getLocalName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LocalName();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getMemberName <em>Member Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member Name</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getMemberName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MemberName();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getMultiplicity()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Multiplicity();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getMultiplicityRange <em>Multiplicity Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity Range</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getMultiplicityRange()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_MultiplicityRange();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DocumentRoot#getReal <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getReal()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Real();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getRecord()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Record();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getRecordType <em>Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Type</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getRecordType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_RecordType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getScale()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scale();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getScopedName <em>Scoped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped Name</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getScopedName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ScopedName();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Name</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getTypeName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TypeName();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.DocumentRoot#getUnlimitedInteger <em>Unlimited Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unlimited Integer</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getUnlimitedInteger()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_UnlimitedInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DocumentRoot#getIsoType <em>Iso Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iso Type</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getIsoType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_IsoType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.DocumentRoot#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.DocumentRoot#getNilReason()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.MeasurePropertyType <em>Measure Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Property Type</em>'.
	 * @see org.isotc211._2005.gco.MeasurePropertyType
	 * @generated
	 */
	EClass getMeasurePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.MeasurePropertyType#getMeasureGroup <em>Measure Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Measure Group</em>'.
	 * @see org.isotc211._2005.gco.MeasurePropertyType#getMeasureGroup()
	 * @see #getMeasurePropertyType()
	 * @generated
	 */
	EAttribute getMeasurePropertyType_MeasureGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.MeasurePropertyType#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Measure</em>'.
	 * @see org.isotc211._2005.gco.MeasurePropertyType#getMeasure()
	 * @see #getMeasurePropertyType()
	 * @generated
	 */
	EReference getMeasurePropertyType_Measure();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MeasurePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.MeasurePropertyType#getNilReason()
	 * @see #getMeasurePropertyType()
	 * @generated
	 */
	EAttribute getMeasurePropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.MemberNamePropertyType <em>Member Name Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Name Property Type</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType
	 * @generated
	 */
	EClass getMemberNamePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.MemberNamePropertyType#getMemberName <em>Member Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Member Name</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType#getMemberName()
	 * @see #getMemberNamePropertyType()
	 * @generated
	 */
	EReference getMemberNamePropertyType_MemberName();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MemberNamePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType#getActuate()
	 * @see #getMemberNamePropertyType()
	 * @generated
	 */
	EAttribute getMemberNamePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MemberNamePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType#getArcrole()
	 * @see #getMemberNamePropertyType()
	 * @generated
	 */
	EAttribute getMemberNamePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MemberNamePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType#getHref()
	 * @see #getMemberNamePropertyType()
	 * @generated
	 */
	EAttribute getMemberNamePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MemberNamePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType#getNilReason()
	 * @see #getMemberNamePropertyType()
	 * @generated
	 */
	EAttribute getMemberNamePropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MemberNamePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType#getRole()
	 * @see #getMemberNamePropertyType()
	 * @generated
	 */
	EAttribute getMemberNamePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MemberNamePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType#getShow()
	 * @see #getMemberNamePropertyType()
	 * @generated
	 */
	EAttribute getMemberNamePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MemberNamePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType#getTitle()
	 * @see #getMemberNamePropertyType()
	 * @generated
	 */
	EAttribute getMemberNamePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MemberNamePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType#getType()
	 * @see #getMemberNamePropertyType()
	 * @generated
	 */
	EAttribute getMemberNamePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.MemberNamePropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.MemberNamePropertyType#getUuidref()
	 * @see #getMemberNamePropertyType()
	 * @generated
	 */
	EAttribute getMemberNamePropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.MemberNameType <em>Member Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Name Type</em>'.
	 * @see org.isotc211._2005.gco.MemberNameType
	 * @generated
	 */
	EClass getMemberNameType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.MemberNameType#getAName <em>AName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>AName</em>'.
	 * @see org.isotc211._2005.gco.MemberNameType#getAName()
	 * @see #getMemberNameType()
	 * @generated
	 */
	EReference getMemberNameType_AName();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.MemberNameType#getAttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute Type</em>'.
	 * @see org.isotc211._2005.gco.MemberNameType#getAttributeType()
	 * @see #getMemberNameType()
	 * @generated
	 */
	EReference getMemberNameType_AttributeType();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.MultiplicityRangeType <em>Multiplicity Range Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Range Type</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangeType
	 * @generated
	 */
	EClass getMultiplicityRangeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.MultiplicityRangeType#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangeType#getLower()
	 * @see #getMultiplicityRangeType()
	 * @generated
	 */
	EReference getMultiplicityRangeType_Lower();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.MultiplicityRangeType#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityRangeType#getUpper()
	 * @see #getMultiplicityRangeType()
	 * @generated
	 */
	EReference getMultiplicityRangeType_Upper();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.MultiplicityType <em>Multiplicity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Type</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityType
	 * @generated
	 */
	EClass getMultiplicityType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.isotc211._2005.gco.MultiplicityType#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see org.isotc211._2005.gco.MultiplicityType#getRange()
	 * @see #getMultiplicityType()
	 * @generated
	 */
	EReference getMultiplicityType_Range();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.NumberPropertyType <em>Number Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Property Type</em>'.
	 * @see org.isotc211._2005.gco.NumberPropertyType
	 * @generated
	 */
	EClass getNumberPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.NumberPropertyType#getReal <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Real</em>'.
	 * @see org.isotc211._2005.gco.NumberPropertyType#getReal()
	 * @see #getNumberPropertyType()
	 * @generated
	 */
	EAttribute getNumberPropertyType_Real();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.NumberPropertyType#getDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see org.isotc211._2005.gco.NumberPropertyType#getDecimal()
	 * @see #getNumberPropertyType()
	 * @generated
	 */
	EAttribute getNumberPropertyType_Decimal();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.NumberPropertyType#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see org.isotc211._2005.gco.NumberPropertyType#getInteger()
	 * @see #getNumberPropertyType()
	 * @generated
	 */
	EAttribute getNumberPropertyType_Integer();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.NumberPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.NumberPropertyType#getNilReason()
	 * @see #getNumberPropertyType()
	 * @generated
	 */
	EAttribute getNumberPropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.RecordPropertyType <em>Record Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Property Type</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType
	 * @generated
	 */
	EClass getRecordPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.RecordPropertyType#getRecord <em>Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType#getRecord()
	 * @see #getRecordPropertyType()
	 * @generated
	 */
	EReference getRecordPropertyType_Record();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordPropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType#getActuate()
	 * @see #getRecordPropertyType()
	 * @generated
	 */
	EAttribute getRecordPropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordPropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType#getArcrole()
	 * @see #getRecordPropertyType()
	 * @generated
	 */
	EAttribute getRecordPropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordPropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType#getHref()
	 * @see #getRecordPropertyType()
	 * @generated
	 */
	EAttribute getRecordPropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType#getNilReason()
	 * @see #getRecordPropertyType()
	 * @generated
	 */
	EAttribute getRecordPropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordPropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType#getRole()
	 * @see #getRecordPropertyType()
	 * @generated
	 */
	EAttribute getRecordPropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordPropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType#getShow()
	 * @see #getRecordPropertyType()
	 * @generated
	 */
	EAttribute getRecordPropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordPropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType#getTitle()
	 * @see #getRecordPropertyType()
	 * @generated
	 */
	EAttribute getRecordPropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType#getType()
	 * @see #getRecordPropertyType()
	 * @generated
	 */
	EAttribute getRecordPropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordPropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.RecordPropertyType#getUuidref()
	 * @see #getRecordPropertyType()
	 * @generated
	 */
	EAttribute getRecordPropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.RecordTypePropertyType <em>Record Type Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Type Property Type</em>'.
	 * @see org.isotc211._2005.gco.RecordTypePropertyType
	 * @generated
	 */
	EClass getRecordTypePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.RecordTypePropertyType#getRecordType <em>Record Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Record Type</em>'.
	 * @see org.isotc211._2005.gco.RecordTypePropertyType#getRecordType()
	 * @see #getRecordTypePropertyType()
	 * @generated
	 */
	EReference getRecordTypePropertyType_RecordType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordTypePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.RecordTypePropertyType#getNilReason()
	 * @see #getRecordTypePropertyType()
	 * @generated
	 */
	EAttribute getRecordTypePropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.RecordTypeType <em>Record Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Record Type Type</em>'.
	 * @see org.isotc211._2005.gco.RecordTypeType
	 * @generated
	 */
	EClass getRecordTypeType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordTypeType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.isotc211._2005.gco.RecordTypeType#getValue()
	 * @see #getRecordTypeType()
	 * @generated
	 */
	EAttribute getRecordTypeType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordTypeType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.RecordTypeType#getActuate()
	 * @see #getRecordTypeType()
	 * @generated
	 */
	EAttribute getRecordTypeType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordTypeType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.RecordTypeType#getArcrole()
	 * @see #getRecordTypeType()
	 * @generated
	 */
	EAttribute getRecordTypeType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordTypeType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.RecordTypeType#getHref()
	 * @see #getRecordTypeType()
	 * @generated
	 */
	EAttribute getRecordTypeType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordTypeType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.RecordTypeType#getRole()
	 * @see #getRecordTypeType()
	 * @generated
	 */
	EAttribute getRecordTypeType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordTypeType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.RecordTypeType#getShow()
	 * @see #getRecordTypeType()
	 * @generated
	 */
	EAttribute getRecordTypeType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordTypeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.RecordTypeType#getTitle()
	 * @see #getRecordTypeType()
	 * @generated
	 */
	EAttribute getRecordTypeType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.RecordTypeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.RecordTypeType#getType()
	 * @see #getRecordTypeType()
	 * @generated
	 */
	EAttribute getRecordTypeType_Type();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.ScalePropertyType <em>Scale Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale Property Type</em>'.
	 * @see org.isotc211._2005.gco.ScalePropertyType
	 * @generated
	 */
	EClass getScalePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.ScalePropertyType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scale</em>'.
	 * @see org.isotc211._2005.gco.ScalePropertyType#getScale()
	 * @see #getScalePropertyType()
	 * @generated
	 */
	EReference getScalePropertyType_Scale();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ScalePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.ScalePropertyType#getNilReason()
	 * @see #getScalePropertyType()
	 * @generated
	 */
	EAttribute getScalePropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.ScopedNamePropertyType <em>Scoped Name Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scoped Name Property Type</em>'.
	 * @see org.isotc211._2005.gco.ScopedNamePropertyType
	 * @generated
	 */
	EClass getScopedNamePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.ScopedNamePropertyType#getScopedName <em>Scoped Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scoped Name</em>'.
	 * @see org.isotc211._2005.gco.ScopedNamePropertyType#getScopedName()
	 * @see #getScopedNamePropertyType()
	 * @generated
	 */
	EReference getScopedNamePropertyType_ScopedName();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.ScopedNamePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.ScopedNamePropertyType#getNilReason()
	 * @see #getScopedNamePropertyType()
	 * @generated
	 */
	EAttribute getScopedNamePropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.TypeNamePropertyType <em>Type Name Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Name Property Type</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType
	 * @generated
	 */
	EClass getTypeNamePropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.TypeNamePropertyType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Name</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType#getTypeName()
	 * @see #getTypeNamePropertyType()
	 * @generated
	 */
	EReference getTypeNamePropertyType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.TypeNamePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType#getActuate()
	 * @see #getTypeNamePropertyType()
	 * @generated
	 */
	EAttribute getTypeNamePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.TypeNamePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType#getArcrole()
	 * @see #getTypeNamePropertyType()
	 * @generated
	 */
	EAttribute getTypeNamePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.TypeNamePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType#getHref()
	 * @see #getTypeNamePropertyType()
	 * @generated
	 */
	EAttribute getTypeNamePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.TypeNamePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType#getNilReason()
	 * @see #getTypeNamePropertyType()
	 * @generated
	 */
	EAttribute getTypeNamePropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.TypeNamePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType#getRole()
	 * @see #getTypeNamePropertyType()
	 * @generated
	 */
	EAttribute getTypeNamePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.TypeNamePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType#getShow()
	 * @see #getTypeNamePropertyType()
	 * @generated
	 */
	EAttribute getTypeNamePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.TypeNamePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType#getTitle()
	 * @see #getTypeNamePropertyType()
	 * @generated
	 */
	EAttribute getTypeNamePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.TypeNamePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType#getType()
	 * @see #getTypeNamePropertyType()
	 * @generated
	 */
	EAttribute getTypeNamePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.TypeNamePropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.TypeNamePropertyType#getUuidref()
	 * @see #getTypeNamePropertyType()
	 * @generated
	 */
	EAttribute getTypeNamePropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.TypeNameType <em>Type Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Name Type</em>'.
	 * @see org.isotc211._2005.gco.TypeNameType
	 * @generated
	 */
	EClass getTypeNameType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.TypeNameType#getAName <em>AName</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>AName</em>'.
	 * @see org.isotc211._2005.gco.TypeNameType#getAName()
	 * @see #getTypeNameType()
	 * @generated
	 */
	EReference getTypeNameType_AName();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType <em>Unit Of Measure Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Of Measure Property Type</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType
	 * @generated
	 */
	EClass getUnitOfMeasurePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getUnitDefinitionGroup <em>Unit Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unit Definition Group</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getUnitDefinitionGroup()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EAttribute getUnitOfMeasurePropertyType_UnitDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getUnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Definition</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getUnitDefinition()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EReference getUnitOfMeasurePropertyType_UnitDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getActuate()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EAttribute getUnitOfMeasurePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getArcrole()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EAttribute getUnitOfMeasurePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getHref()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EAttribute getUnitOfMeasurePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getNilReason()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EAttribute getUnitOfMeasurePropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getRole()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EAttribute getUnitOfMeasurePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getShow()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EAttribute getUnitOfMeasurePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getTitle()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EAttribute getUnitOfMeasurePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getType()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EAttribute getUnitOfMeasurePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnitOfMeasurePropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.UnitOfMeasurePropertyType#getUuidref()
	 * @see #getUnitOfMeasurePropertyType()
	 * @generated
	 */
	EAttribute getUnitOfMeasurePropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.UnlimitedIntegerPropertyType <em>Unlimited Integer Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlimited Integer Property Type</em>'.
	 * @see org.isotc211._2005.gco.UnlimitedIntegerPropertyType
	 * @generated
	 */
	EClass getUnlimitedIntegerPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.UnlimitedIntegerPropertyType#getUnlimitedInteger <em>Unlimited Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unlimited Integer</em>'.
	 * @see org.isotc211._2005.gco.UnlimitedIntegerPropertyType#getUnlimitedInteger()
	 * @see #getUnlimitedIntegerPropertyType()
	 * @generated
	 */
	EReference getUnlimitedIntegerPropertyType_UnlimitedInteger();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnlimitedIntegerPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.UnlimitedIntegerPropertyType#getNilReason()
	 * @see #getUnlimitedIntegerPropertyType()
	 * @generated
	 */
	EAttribute getUnlimitedIntegerPropertyType_NilReason();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.UnlimitedIntegerType <em>Unlimited Integer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlimited Integer Type</em>'.
	 * @see org.isotc211._2005.gco.UnlimitedIntegerType
	 * @generated
	 */
	EClass getUnlimitedIntegerType();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnlimitedIntegerType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.isotc211._2005.gco.UnlimitedIntegerType#getValue()
	 * @see #getUnlimitedIntegerType()
	 * @generated
	 */
	EAttribute getUnlimitedIntegerType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UnlimitedIntegerType#isIsInfinite <em>Is Infinite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Infinite</em>'.
	 * @see org.isotc211._2005.gco.UnlimitedIntegerType#isIsInfinite()
	 * @see #getUnlimitedIntegerType()
	 * @generated
	 */
	EAttribute getUnlimitedIntegerType_IsInfinite();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.UomAnglePropertyType <em>Uom Angle Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uom Angle Property Type</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType
	 * @generated
	 */
	EClass getUomAnglePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.UomAnglePropertyType#getUnitDefinitionGroup <em>Unit Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unit Definition Group</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getUnitDefinitionGroup()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EAttribute getUomAnglePropertyType_UnitDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.UomAnglePropertyType#getUnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Definition</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getUnitDefinition()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EReference getUomAnglePropertyType_UnitDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAnglePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getActuate()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EAttribute getUomAnglePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAnglePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getArcrole()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EAttribute getUomAnglePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAnglePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getHref()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EAttribute getUomAnglePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAnglePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getNilReason()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EAttribute getUomAnglePropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAnglePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getRole()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EAttribute getUomAnglePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAnglePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getShow()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EAttribute getUomAnglePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAnglePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getTitle()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EAttribute getUomAnglePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAnglePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getType()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EAttribute getUomAnglePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAnglePropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.UomAnglePropertyType#getUuidref()
	 * @see #getUomAnglePropertyType()
	 * @generated
	 */
	EAttribute getUomAnglePropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.UomAreaPropertyType <em>Uom Area Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uom Area Property Type</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType
	 * @generated
	 */
	EClass getUomAreaPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.UomAreaPropertyType#getUnitDefinitionGroup <em>Unit Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unit Definition Group</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getUnitDefinitionGroup()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EAttribute getUomAreaPropertyType_UnitDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.UomAreaPropertyType#getUnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Definition</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getUnitDefinition()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EReference getUomAreaPropertyType_UnitDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAreaPropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getActuate()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EAttribute getUomAreaPropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAreaPropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getArcrole()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EAttribute getUomAreaPropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAreaPropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getHref()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EAttribute getUomAreaPropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAreaPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getNilReason()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EAttribute getUomAreaPropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAreaPropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getRole()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EAttribute getUomAreaPropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAreaPropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getShow()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EAttribute getUomAreaPropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAreaPropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getTitle()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EAttribute getUomAreaPropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAreaPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getType()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EAttribute getUomAreaPropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomAreaPropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.UomAreaPropertyType#getUuidref()
	 * @see #getUomAreaPropertyType()
	 * @generated
	 */
	EAttribute getUomAreaPropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.UomLengthPropertyType <em>Uom Length Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uom Length Property Type</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType
	 * @generated
	 */
	EClass getUomLengthPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.UomLengthPropertyType#getUnitDefinitionGroup <em>Unit Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unit Definition Group</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getUnitDefinitionGroup()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EAttribute getUomLengthPropertyType_UnitDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.UomLengthPropertyType#getUnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Definition</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getUnitDefinition()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EReference getUomLengthPropertyType_UnitDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomLengthPropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getActuate()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EAttribute getUomLengthPropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomLengthPropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getArcrole()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EAttribute getUomLengthPropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomLengthPropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getHref()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EAttribute getUomLengthPropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomLengthPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getNilReason()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EAttribute getUomLengthPropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomLengthPropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getRole()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EAttribute getUomLengthPropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomLengthPropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getShow()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EAttribute getUomLengthPropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomLengthPropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getTitle()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EAttribute getUomLengthPropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomLengthPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getType()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EAttribute getUomLengthPropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomLengthPropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.UomLengthPropertyType#getUuidref()
	 * @see #getUomLengthPropertyType()
	 * @generated
	 */
	EAttribute getUomLengthPropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.UomScalePropertyType <em>Uom Scale Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uom Scale Property Type</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType
	 * @generated
	 */
	EClass getUomScalePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.UomScalePropertyType#getUnitDefinitionGroup <em>Unit Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unit Definition Group</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getUnitDefinitionGroup()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EAttribute getUomScalePropertyType_UnitDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.UomScalePropertyType#getUnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Definition</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getUnitDefinition()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EReference getUomScalePropertyType_UnitDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomScalePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getActuate()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EAttribute getUomScalePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomScalePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getArcrole()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EAttribute getUomScalePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomScalePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getHref()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EAttribute getUomScalePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomScalePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getNilReason()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EAttribute getUomScalePropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomScalePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getRole()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EAttribute getUomScalePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomScalePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getShow()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EAttribute getUomScalePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomScalePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getTitle()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EAttribute getUomScalePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomScalePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getType()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EAttribute getUomScalePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomScalePropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.UomScalePropertyType#getUuidref()
	 * @see #getUomScalePropertyType()
	 * @generated
	 */
	EAttribute getUomScalePropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.UomTimePropertyType <em>Uom Time Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uom Time Property Type</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType
	 * @generated
	 */
	EClass getUomTimePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.UomTimePropertyType#getUnitDefinitionGroup <em>Unit Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unit Definition Group</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getUnitDefinitionGroup()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EAttribute getUomTimePropertyType_UnitDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.UomTimePropertyType#getUnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Definition</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getUnitDefinition()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EReference getUomTimePropertyType_UnitDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomTimePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getActuate()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EAttribute getUomTimePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomTimePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getArcrole()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EAttribute getUomTimePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomTimePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getHref()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EAttribute getUomTimePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomTimePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getNilReason()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EAttribute getUomTimePropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomTimePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getRole()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EAttribute getUomTimePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomTimePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getShow()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EAttribute getUomTimePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomTimePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getTitle()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EAttribute getUomTimePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomTimePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getType()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EAttribute getUomTimePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomTimePropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.UomTimePropertyType#getUuidref()
	 * @see #getUomTimePropertyType()
	 * @generated
	 */
	EAttribute getUomTimePropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.UomVelocityPropertyType <em>Uom Velocity Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uom Velocity Property Type</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType
	 * @generated
	 */
	EClass getUomVelocityPropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getUnitDefinitionGroup <em>Unit Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unit Definition Group</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getUnitDefinitionGroup()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EAttribute getUomVelocityPropertyType_UnitDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getUnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Definition</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getUnitDefinition()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EReference getUomVelocityPropertyType_UnitDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getActuate()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EAttribute getUomVelocityPropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getArcrole()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EAttribute getUomVelocityPropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getHref()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EAttribute getUomVelocityPropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getNilReason()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EAttribute getUomVelocityPropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getRole()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EAttribute getUomVelocityPropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getShow()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EAttribute getUomVelocityPropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getTitle()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EAttribute getUomVelocityPropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getType()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EAttribute getUomVelocityPropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVelocityPropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.UomVelocityPropertyType#getUuidref()
	 * @see #getUomVelocityPropertyType()
	 * @generated
	 */
	EAttribute getUomVelocityPropertyType_Uuidref();

	/**
	 * Returns the meta object for class '{@link org.isotc211._2005.gco.UomVolumePropertyType <em>Uom Volume Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Uom Volume Property Type</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType
	 * @generated
	 */
	EClass getUomVolumePropertyType();

	/**
	 * Returns the meta object for the attribute list '{@link org.isotc211._2005.gco.UomVolumePropertyType#getUnitDefinitionGroup <em>Unit Definition Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unit Definition Group</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getUnitDefinitionGroup()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EAttribute getUomVolumePropertyType_UnitDefinitionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.isotc211._2005.gco.UomVolumePropertyType#getUnitDefinition <em>Unit Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unit Definition</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getUnitDefinition()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EReference getUomVolumePropertyType_UnitDefinition();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVolumePropertyType#getActuate <em>Actuate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actuate</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getActuate()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EAttribute getUomVolumePropertyType_Actuate();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVolumePropertyType#getArcrole <em>Arcrole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arcrole</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getArcrole()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EAttribute getUomVolumePropertyType_Arcrole();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVolumePropertyType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getHref()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EAttribute getUomVolumePropertyType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVolumePropertyType#getNilReason <em>Nil Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nil Reason</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getNilReason()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EAttribute getUomVolumePropertyType_NilReason();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVolumePropertyType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getRole()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EAttribute getUomVolumePropertyType_Role();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVolumePropertyType#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getShow()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EAttribute getUomVolumePropertyType_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVolumePropertyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getTitle()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EAttribute getUomVolumePropertyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVolumePropertyType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getType()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EAttribute getUomVolumePropertyType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.isotc211._2005.gco.UomVolumePropertyType#getUuidref <em>Uuidref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uuidref</em>'.
	 * @see org.isotc211._2005.gco.UomVolumePropertyType#getUuidref()
	 * @see #getUomVolumePropertyType()
	 * @generated
	 */
	EAttribute getUomVolumePropertyType_Uuidref();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date Type</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='Date_Type' memberTypes='http://www.eclipse.org/emf/2003/XMLType#date http://www.eclipse.org/emf/2003/XMLType#gYearMonth http://www.eclipse.org/emf/2003/XMLType#gYear'"
	 * @generated
	 */
	EDataType getDateType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GCOFactory getGCOFactory();

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
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.AbstractObjectTypeImpl <em>Abstract Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.AbstractObjectTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getAbstractObjectType()
		 * @generated
		 */
		EClass ABSTRACT_OBJECT_TYPE = eINSTANCE.getAbstractObjectType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_OBJECT_TYPE__ID = eINSTANCE.getAbstractObjectType_Id();

		/**
		 * The meta object literal for the '<em><b>Uuid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_OBJECT_TYPE__UUID = eINSTANCE.getAbstractObjectType_Uuid();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.AnglePropertyTypeImpl <em>Angle Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.AnglePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getAnglePropertyType()
		 * @generated
		 */
		EClass ANGLE_PROPERTY_TYPE = eINSTANCE.getAnglePropertyType();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANGLE_PROPERTY_TYPE__ANGLE = eINSTANCE.getAnglePropertyType_Angle();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getAnglePropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.BinaryPropertyTypeImpl <em>Binary Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.BinaryPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getBinaryPropertyType()
		 * @generated
		 */
		EClass BINARY_PROPERTY_TYPE = eINSTANCE.getBinaryPropertyType();

		/**
		 * The meta object literal for the '<em><b>Binary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_PROPERTY_TYPE__BINARY = eINSTANCE.getBinaryPropertyType_Binary();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getBinaryPropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.BinaryTypeImpl <em>Binary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.BinaryTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getBinaryType()
		 * @generated
		 */
		EClass BINARY_TYPE = eINSTANCE.getBinaryType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_TYPE__VALUE = eINSTANCE.getBinaryType_Value();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_TYPE__SRC = eINSTANCE.getBinaryType_Src();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.BooleanPropertyTypeImpl <em>Boolean Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.BooleanPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getBooleanPropertyType()
		 * @generated
		 */
		EClass BOOLEAN_PROPERTY_TYPE = eINSTANCE.getBooleanPropertyType();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_PROPERTY_TYPE__BOOLEAN = eINSTANCE.getBooleanPropertyType_Boolean();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getBooleanPropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.CharacterStringPropertyTypeImpl <em>Character String Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.CharacterStringPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getCharacterStringPropertyType()
		 * @generated
		 */
		EClass CHARACTER_STRING_PROPERTY_TYPE = eINSTANCE.getCharacterStringPropertyType();

		/**
		 * The meta object literal for the '<em><b>Character String Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING_GROUP = eINSTANCE.getCharacterStringPropertyType_CharacterStringGroup();

		/**
		 * The meta object literal for the '<em><b>Character String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STRING_PROPERTY_TYPE__CHARACTER_STRING = eINSTANCE.getCharacterStringPropertyType_CharacterString();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHARACTER_STRING_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getCharacterStringPropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.CodeListValueTypeImpl <em>Code List Value Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.CodeListValueTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getCodeListValueType()
		 * @generated
		 */
		EClass CODE_LIST_VALUE_TYPE = eINSTANCE.getCodeListValueType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LIST_VALUE_TYPE__VALUE = eINSTANCE.getCodeListValueType_Value();

		/**
		 * The meta object literal for the '<em><b>Code List</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LIST_VALUE_TYPE__CODE_LIST = eINSTANCE.getCodeListValueType_CodeList();

		/**
		 * The meta object literal for the '<em><b>Code List Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LIST_VALUE_TYPE__CODE_LIST_VALUE = eINSTANCE.getCodeListValueType_CodeListValue();

		/**
		 * The meta object literal for the '<em><b>Code Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_LIST_VALUE_TYPE__CODE_SPACE = eINSTANCE.getCodeListValueType_CodeSpace();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.DatePropertyTypeImpl <em>Date Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.DatePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDatePropertyType()
		 * @generated
		 */
		EClass DATE_PROPERTY_TYPE = eINSTANCE.getDatePropertyType();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PROPERTY_TYPE__DATE = eINSTANCE.getDatePropertyType_Date();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PROPERTY_TYPE__DATE_TIME = eINSTANCE.getDatePropertyType_DateTime();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getDatePropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.DateTimePropertyTypeImpl <em>Date Time Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.DateTimePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDateTimePropertyType()
		 * @generated
		 */
		EClass DATE_TIME_PROPERTY_TYPE = eINSTANCE.getDateTimePropertyType();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_PROPERTY_TYPE__DATE_TIME = eINSTANCE.getDateTimePropertyType_DateTime();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TIME_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getDateTimePropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.DecimalPropertyTypeImpl <em>Decimal Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.DecimalPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDecimalPropertyType()
		 * @generated
		 */
		EClass DECIMAL_PROPERTY_TYPE = eINSTANCE.getDecimalPropertyType();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_PROPERTY_TYPE__DECIMAL = eINSTANCE.getDecimalPropertyType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getDecimalPropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.DistancePropertyTypeImpl <em>Distance Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.DistancePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDistancePropertyType()
		 * @generated
		 */
		EClass DISTANCE_PROPERTY_TYPE = eINSTANCE.getDistancePropertyType();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE_PROPERTY_TYPE__DISTANCE = eINSTANCE.getDistancePropertyType_Distance();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getDistancePropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.GenericNamePropertyTypeImpl <em>Generic Name Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.GenericNamePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getGenericNamePropertyType()
		 * @generated
		 */
		EClass GENERIC_NAME_PROPERTY_TYPE = eINSTANCE.getGenericNamePropertyType();

		/**
		 * The meta object literal for the '<em><b>Abstract Generic Name Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME_GROUP = eINSTANCE.getGenericNamePropertyType_AbstractGenericNameGroup();

		/**
		 * The meta object literal for the '<em><b>Abstract Generic Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_NAME_PROPERTY_TYPE__ABSTRACT_GENERIC_NAME = eINSTANCE.getGenericNamePropertyType_AbstractGenericName();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_NAME_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getGenericNamePropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.IntegerPropertyTypeImpl <em>Integer Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.IntegerPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getIntegerPropertyType()
		 * @generated
		 */
		EClass INTEGER_PROPERTY_TYPE = eINSTANCE.getIntegerPropertyType();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_PROPERTY_TYPE__INTEGER = eINSTANCE.getIntegerPropertyType_Integer();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getIntegerPropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.LengthPropertyTypeImpl <em>Length Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.LengthPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getLengthPropertyType()
		 * @generated
		 */
		EClass LENGTH_PROPERTY_TYPE = eINSTANCE.getLengthPropertyType();

		/**
		 * The meta object literal for the '<em><b>Length Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH_PROPERTY_TYPE__LENGTH_GROUP = eINSTANCE.getLengthPropertyType_LengthGroup();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LENGTH_PROPERTY_TYPE__LENGTH = eINSTANCE.getLengthPropertyType_Length();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LENGTH_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getLengthPropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.LocalNamePropertyTypeImpl <em>Local Name Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.LocalNamePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getLocalNamePropertyType()
		 * @generated
		 */
		EClass LOCAL_NAME_PROPERTY_TYPE = eINSTANCE.getLocalNamePropertyType();

		/**
		 * The meta object literal for the '<em><b>Local Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_NAME_PROPERTY_TYPE__LOCAL_NAME = eINSTANCE.getLocalNamePropertyType_LocalName();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_NAME_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getLocalNamePropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.MultiplicityPropertyTypeImpl <em>Multiplicity Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.MultiplicityPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMultiplicityPropertyType()
		 * @generated
		 */
		EClass MULTIPLICITY_PROPERTY_TYPE = eINSTANCE.getMultiplicityPropertyType();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_PROPERTY_TYPE__MULTIPLICITY = eINSTANCE.getMultiplicityPropertyType_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_PROPERTY_TYPE__ACTUATE = eINSTANCE.getMultiplicityPropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_PROPERTY_TYPE__ARCROLE = eINSTANCE.getMultiplicityPropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_PROPERTY_TYPE__HREF = eINSTANCE.getMultiplicityPropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getMultiplicityPropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_PROPERTY_TYPE__ROLE = eINSTANCE.getMultiplicityPropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_PROPERTY_TYPE__SHOW = eINSTANCE.getMultiplicityPropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_PROPERTY_TYPE__TITLE = eINSTANCE.getMultiplicityPropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_PROPERTY_TYPE__TYPE = eINSTANCE.getMultiplicityPropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_PROPERTY_TYPE__UUIDREF = eINSTANCE.getMultiplicityPropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.MultiplicityRangePropertyTypeImpl <em>Multiplicity Range Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.MultiplicityRangePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMultiplicityRangePropertyType()
		 * @generated
		 */
		EClass MULTIPLICITY_RANGE_PROPERTY_TYPE = eINSTANCE.getMultiplicityRangePropertyType();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_RANGE_PROPERTY_TYPE__MULTIPLICITY_RANGE = eINSTANCE.getMultiplicityRangePropertyType_MultiplicityRange();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_PROPERTY_TYPE__ACTUATE = eINSTANCE.getMultiplicityRangePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_PROPERTY_TYPE__ARCROLE = eINSTANCE.getMultiplicityRangePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_PROPERTY_TYPE__HREF = eINSTANCE.getMultiplicityRangePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getMultiplicityRangePropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_PROPERTY_TYPE__ROLE = eINSTANCE.getMultiplicityRangePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_PROPERTY_TYPE__SHOW = eINSTANCE.getMultiplicityRangePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_PROPERTY_TYPE__TITLE = eINSTANCE.getMultiplicityRangePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_PROPERTY_TYPE__TYPE = eINSTANCE.getMultiplicityRangePropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTIPLICITY_RANGE_PROPERTY_TYPE__UUIDREF = eINSTANCE.getMultiplicityRangePropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.ObjectReferencePropertyTypeImpl <em>Object Reference Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.ObjectReferencePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getObjectReferencePropertyType()
		 * @generated
		 */
		EClass OBJECT_REFERENCE_PROPERTY_TYPE = eINSTANCE.getObjectReferencePropertyType();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REFERENCE_PROPERTY_TYPE__ACTUATE = eINSTANCE.getObjectReferencePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REFERENCE_PROPERTY_TYPE__ARCROLE = eINSTANCE.getObjectReferencePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REFERENCE_PROPERTY_TYPE__HREF = eINSTANCE.getObjectReferencePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REFERENCE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getObjectReferencePropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REFERENCE_PROPERTY_TYPE__ROLE = eINSTANCE.getObjectReferencePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REFERENCE_PROPERTY_TYPE__SHOW = eINSTANCE.getObjectReferencePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REFERENCE_PROPERTY_TYPE__TITLE = eINSTANCE.getObjectReferencePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REFERENCE_PROPERTY_TYPE__TYPE = eINSTANCE.getObjectReferencePropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_REFERENCE_PROPERTY_TYPE__UUIDREF = eINSTANCE.getObjectReferencePropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.RealPropertyTypeImpl <em>Real Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.RealPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getRealPropertyType()
		 * @generated
		 */
		EClass REAL_PROPERTY_TYPE = eINSTANCE.getRealPropertyType();

		/**
		 * The meta object literal for the '<em><b>Real</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_PROPERTY_TYPE__REAL = eINSTANCE.getRealPropertyType_Real();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getRealPropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.DocumentRootImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Abstract Generic Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT_GENERIC_NAME = eINSTANCE.getDocumentRoot_AbstractGenericName();

		/**
		 * The meta object literal for the '<em><b>Abstract Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT_OBJECT = eINSTANCE.getDocumentRoot_AbstractObject();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ANGLE = eINSTANCE.getDocumentRoot_Angle();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEASURE = eINSTANCE.getDocumentRoot_Measure();

		/**
		 * The meta object literal for the '<em><b>Binary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BINARY = eINSTANCE.getDocumentRoot_Binary();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BOOLEAN = eINSTANCE.getDocumentRoot_Boolean();

		/**
		 * The meta object literal for the '<em><b>Character String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CHARACTER_STRING = eINSTANCE.getDocumentRoot_CharacterString();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATE = eINSTANCE.getDocumentRoot_Date();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATE_TIME = eINSTANCE.getDocumentRoot_DateTime();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DECIMAL = eINSTANCE.getDocumentRoot_Decimal();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DISTANCE = eINSTANCE.getDocumentRoot_Distance();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LENGTH = eINSTANCE.getDocumentRoot_Length();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__INTEGER = eINSTANCE.getDocumentRoot_Integer();

		/**
		 * The meta object literal for the '<em><b>Local Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCAL_NAME = eINSTANCE.getDocumentRoot_LocalName();

		/**
		 * The meta object literal for the '<em><b>Member Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEMBER_NAME = eINSTANCE.getDocumentRoot_MemberName();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MULTIPLICITY = eINSTANCE.getDocumentRoot_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Multiplicity Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MULTIPLICITY_RANGE = eINSTANCE.getDocumentRoot_MultiplicityRange();

		/**
		 * The meta object literal for the '<em><b>Real</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__REAL = eINSTANCE.getDocumentRoot_Real();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RECORD = eINSTANCE.getDocumentRoot_Record();

		/**
		 * The meta object literal for the '<em><b>Record Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RECORD_TYPE = eINSTANCE.getDocumentRoot_RecordType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCALE = eINSTANCE.getDocumentRoot_Scale();

		/**
		 * The meta object literal for the '<em><b>Scoped Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SCOPED_NAME = eINSTANCE.getDocumentRoot_ScopedName();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TYPE_NAME = eINSTANCE.getDocumentRoot_TypeName();

		/**
		 * The meta object literal for the '<em><b>Unlimited Integer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UNLIMITED_INTEGER = eINSTANCE.getDocumentRoot_UnlimitedInteger();

		/**
		 * The meta object literal for the '<em><b>Iso Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__ISO_TYPE = eINSTANCE.getDocumentRoot_IsoType();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__NIL_REASON = eINSTANCE.getDocumentRoot_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.MeasurePropertyTypeImpl <em>Measure Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.MeasurePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMeasurePropertyType()
		 * @generated
		 */
		EClass MEASURE_PROPERTY_TYPE = eINSTANCE.getMeasurePropertyType();

		/**
		 * The meta object literal for the '<em><b>Measure Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_PROPERTY_TYPE__MEASURE_GROUP = eINSTANCE.getMeasurePropertyType_MeasureGroup();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE_PROPERTY_TYPE__MEASURE = eINSTANCE.getMeasurePropertyType_Measure();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getMeasurePropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.MemberNamePropertyTypeImpl <em>Member Name Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.MemberNamePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMemberNamePropertyType()
		 * @generated
		 */
		EClass MEMBER_NAME_PROPERTY_TYPE = eINSTANCE.getMemberNamePropertyType();

		/**
		 * The meta object literal for the '<em><b>Member Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_NAME_PROPERTY_TYPE__MEMBER_NAME = eINSTANCE.getMemberNamePropertyType_MemberName();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_NAME_PROPERTY_TYPE__ACTUATE = eINSTANCE.getMemberNamePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_NAME_PROPERTY_TYPE__ARCROLE = eINSTANCE.getMemberNamePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_NAME_PROPERTY_TYPE__HREF = eINSTANCE.getMemberNamePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_NAME_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getMemberNamePropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_NAME_PROPERTY_TYPE__ROLE = eINSTANCE.getMemberNamePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_NAME_PROPERTY_TYPE__SHOW = eINSTANCE.getMemberNamePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_NAME_PROPERTY_TYPE__TITLE = eINSTANCE.getMemberNamePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_NAME_PROPERTY_TYPE__TYPE = eINSTANCE.getMemberNamePropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMBER_NAME_PROPERTY_TYPE__UUIDREF = eINSTANCE.getMemberNamePropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.MemberNameTypeImpl <em>Member Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.MemberNameTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMemberNameType()
		 * @generated
		 */
		EClass MEMBER_NAME_TYPE = eINSTANCE.getMemberNameType();

		/**
		 * The meta object literal for the '<em><b>AName</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_NAME_TYPE__ANAME = eINSTANCE.getMemberNameType_AName();

		/**
		 * The meta object literal for the '<em><b>Attribute Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_NAME_TYPE__ATTRIBUTE_TYPE = eINSTANCE.getMemberNameType_AttributeType();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.MultiplicityRangeTypeImpl <em>Multiplicity Range Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.MultiplicityRangeTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMultiplicityRangeType()
		 * @generated
		 */
		EClass MULTIPLICITY_RANGE_TYPE = eINSTANCE.getMultiplicityRangeType();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_RANGE_TYPE__LOWER = eINSTANCE.getMultiplicityRangeType_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_RANGE_TYPE__UPPER = eINSTANCE.getMultiplicityRangeType_Upper();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.MultiplicityTypeImpl <em>Multiplicity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.MultiplicityTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getMultiplicityType()
		 * @generated
		 */
		EClass MULTIPLICITY_TYPE = eINSTANCE.getMultiplicityType();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTIPLICITY_TYPE__RANGE = eINSTANCE.getMultiplicityType_Range();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.NumberPropertyTypeImpl <em>Number Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.NumberPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getNumberPropertyType()
		 * @generated
		 */
		EClass NUMBER_PROPERTY_TYPE = eINSTANCE.getNumberPropertyType();

		/**
		 * The meta object literal for the '<em><b>Real</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_PROPERTY_TYPE__REAL = eINSTANCE.getNumberPropertyType_Real();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_PROPERTY_TYPE__DECIMAL = eINSTANCE.getNumberPropertyType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_PROPERTY_TYPE__INTEGER = eINSTANCE.getNumberPropertyType_Integer();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getNumberPropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.RecordPropertyTypeImpl <em>Record Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.RecordPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getRecordPropertyType()
		 * @generated
		 */
		EClass RECORD_PROPERTY_TYPE = eINSTANCE.getRecordPropertyType();

		/**
		 * The meta object literal for the '<em><b>Record</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_PROPERTY_TYPE__RECORD = eINSTANCE.getRecordPropertyType_Record();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_PROPERTY_TYPE__ACTUATE = eINSTANCE.getRecordPropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_PROPERTY_TYPE__ARCROLE = eINSTANCE.getRecordPropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_PROPERTY_TYPE__HREF = eINSTANCE.getRecordPropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getRecordPropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_PROPERTY_TYPE__ROLE = eINSTANCE.getRecordPropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_PROPERTY_TYPE__SHOW = eINSTANCE.getRecordPropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_PROPERTY_TYPE__TITLE = eINSTANCE.getRecordPropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_PROPERTY_TYPE__TYPE = eINSTANCE.getRecordPropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_PROPERTY_TYPE__UUIDREF = eINSTANCE.getRecordPropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.RecordTypePropertyTypeImpl <em>Record Type Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.RecordTypePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getRecordTypePropertyType()
		 * @generated
		 */
		EClass RECORD_TYPE_PROPERTY_TYPE = eINSTANCE.getRecordTypePropertyType();

		/**
		 * The meta object literal for the '<em><b>Record Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORD_TYPE_PROPERTY_TYPE__RECORD_TYPE = eINSTANCE.getRecordTypePropertyType_RecordType();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getRecordTypePropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.RecordTypeTypeImpl <em>Record Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.RecordTypeTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getRecordTypeType()
		 * @generated
		 */
		EClass RECORD_TYPE_TYPE = eINSTANCE.getRecordTypeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE_TYPE__VALUE = eINSTANCE.getRecordTypeType_Value();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE_TYPE__ACTUATE = eINSTANCE.getRecordTypeType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE_TYPE__ARCROLE = eINSTANCE.getRecordTypeType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE_TYPE__HREF = eINSTANCE.getRecordTypeType_Href();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE_TYPE__ROLE = eINSTANCE.getRecordTypeType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE_TYPE__SHOW = eINSTANCE.getRecordTypeType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE_TYPE__TITLE = eINSTANCE.getRecordTypeType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORD_TYPE_TYPE__TYPE = eINSTANCE.getRecordTypeType_Type();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.ScalePropertyTypeImpl <em>Scale Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.ScalePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getScalePropertyType()
		 * @generated
		 */
		EClass SCALE_PROPERTY_TYPE = eINSTANCE.getScalePropertyType();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALE_PROPERTY_TYPE__SCALE = eINSTANCE.getScalePropertyType_Scale();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getScalePropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.ScopedNamePropertyTypeImpl <em>Scoped Name Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.ScopedNamePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getScopedNamePropertyType()
		 * @generated
		 */
		EClass SCOPED_NAME_PROPERTY_TYPE = eINSTANCE.getScopedNamePropertyType();

		/**
		 * The meta object literal for the '<em><b>Scoped Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPED_NAME_PROPERTY_TYPE__SCOPED_NAME = eINSTANCE.getScopedNamePropertyType_ScopedName();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPED_NAME_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getScopedNamePropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.TypeNamePropertyTypeImpl <em>Type Name Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.TypeNamePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getTypeNamePropertyType()
		 * @generated
		 */
		EClass TYPE_NAME_PROPERTY_TYPE = eINSTANCE.getTypeNamePropertyType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_NAME_PROPERTY_TYPE__TYPE_NAME = eINSTANCE.getTypeNamePropertyType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NAME_PROPERTY_TYPE__ACTUATE = eINSTANCE.getTypeNamePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NAME_PROPERTY_TYPE__ARCROLE = eINSTANCE.getTypeNamePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NAME_PROPERTY_TYPE__HREF = eINSTANCE.getTypeNamePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NAME_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getTypeNamePropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NAME_PROPERTY_TYPE__ROLE = eINSTANCE.getTypeNamePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NAME_PROPERTY_TYPE__SHOW = eINSTANCE.getTypeNamePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NAME_PROPERTY_TYPE__TITLE = eINSTANCE.getTypeNamePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NAME_PROPERTY_TYPE__TYPE = eINSTANCE.getTypeNamePropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_NAME_PROPERTY_TYPE__UUIDREF = eINSTANCE.getTypeNamePropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.TypeNameTypeImpl <em>Type Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.TypeNameTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getTypeNameType()
		 * @generated
		 */
		EClass TYPE_NAME_TYPE = eINSTANCE.getTypeNameType();

		/**
		 * The meta object literal for the '<em><b>AName</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_NAME_TYPE__ANAME = eINSTANCE.getTypeNameType_AName();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.UnitOfMeasurePropertyTypeImpl <em>Unit Of Measure Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.UnitOfMeasurePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUnitOfMeasurePropertyType()
		 * @generated
		 */
		EClass UNIT_OF_MEASURE_PROPERTY_TYPE = eINSTANCE.getUnitOfMeasurePropertyType();

		/**
		 * The meta object literal for the '<em><b>Unit Definition Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURE_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = eINSTANCE.getUnitOfMeasurePropertyType_UnitDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Unit Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_OF_MEASURE_PROPERTY_TYPE__UNIT_DEFINITION = eINSTANCE.getUnitOfMeasurePropertyType_UnitDefinition();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURE_PROPERTY_TYPE__ACTUATE = eINSTANCE.getUnitOfMeasurePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURE_PROPERTY_TYPE__ARCROLE = eINSTANCE.getUnitOfMeasurePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURE_PROPERTY_TYPE__HREF = eINSTANCE.getUnitOfMeasurePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getUnitOfMeasurePropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURE_PROPERTY_TYPE__ROLE = eINSTANCE.getUnitOfMeasurePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURE_PROPERTY_TYPE__SHOW = eINSTANCE.getUnitOfMeasurePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURE_PROPERTY_TYPE__TITLE = eINSTANCE.getUnitOfMeasurePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURE_PROPERTY_TYPE__TYPE = eINSTANCE.getUnitOfMeasurePropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_OF_MEASURE_PROPERTY_TYPE__UUIDREF = eINSTANCE.getUnitOfMeasurePropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.UnlimitedIntegerPropertyTypeImpl <em>Unlimited Integer Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.UnlimitedIntegerPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUnlimitedIntegerPropertyType()
		 * @generated
		 */
		EClass UNLIMITED_INTEGER_PROPERTY_TYPE = eINSTANCE.getUnlimitedIntegerPropertyType();

		/**
		 * The meta object literal for the '<em><b>Unlimited Integer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNLIMITED_INTEGER_PROPERTY_TYPE__UNLIMITED_INTEGER = eINSTANCE.getUnlimitedIntegerPropertyType_UnlimitedInteger();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLIMITED_INTEGER_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getUnlimitedIntegerPropertyType_NilReason();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.UnlimitedIntegerTypeImpl <em>Unlimited Integer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.UnlimitedIntegerTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUnlimitedIntegerType()
		 * @generated
		 */
		EClass UNLIMITED_INTEGER_TYPE = eINSTANCE.getUnlimitedIntegerType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLIMITED_INTEGER_TYPE__VALUE = eINSTANCE.getUnlimitedIntegerType_Value();

		/**
		 * The meta object literal for the '<em><b>Is Infinite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLIMITED_INTEGER_TYPE__IS_INFINITE = eINSTANCE.getUnlimitedIntegerType_IsInfinite();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.UomAnglePropertyTypeImpl <em>Uom Angle Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.UomAnglePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomAnglePropertyType()
		 * @generated
		 */
		EClass UOM_ANGLE_PROPERTY_TYPE = eINSTANCE.getUomAnglePropertyType();

		/**
		 * The meta object literal for the '<em><b>Unit Definition Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_ANGLE_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = eINSTANCE.getUomAnglePropertyType_UnitDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Unit Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_ANGLE_PROPERTY_TYPE__UNIT_DEFINITION = eINSTANCE.getUomAnglePropertyType_UnitDefinition();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_ANGLE_PROPERTY_TYPE__ACTUATE = eINSTANCE.getUomAnglePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_ANGLE_PROPERTY_TYPE__ARCROLE = eINSTANCE.getUomAnglePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_ANGLE_PROPERTY_TYPE__HREF = eINSTANCE.getUomAnglePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_ANGLE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getUomAnglePropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_ANGLE_PROPERTY_TYPE__ROLE = eINSTANCE.getUomAnglePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_ANGLE_PROPERTY_TYPE__SHOW = eINSTANCE.getUomAnglePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_ANGLE_PROPERTY_TYPE__TITLE = eINSTANCE.getUomAnglePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_ANGLE_PROPERTY_TYPE__TYPE = eINSTANCE.getUomAnglePropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_ANGLE_PROPERTY_TYPE__UUIDREF = eINSTANCE.getUomAnglePropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.UomAreaPropertyTypeImpl <em>Uom Area Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.UomAreaPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomAreaPropertyType()
		 * @generated
		 */
		EClass UOM_AREA_PROPERTY_TYPE = eINSTANCE.getUomAreaPropertyType();

		/**
		 * The meta object literal for the '<em><b>Unit Definition Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_AREA_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = eINSTANCE.getUomAreaPropertyType_UnitDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Unit Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_AREA_PROPERTY_TYPE__UNIT_DEFINITION = eINSTANCE.getUomAreaPropertyType_UnitDefinition();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_AREA_PROPERTY_TYPE__ACTUATE = eINSTANCE.getUomAreaPropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_AREA_PROPERTY_TYPE__ARCROLE = eINSTANCE.getUomAreaPropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_AREA_PROPERTY_TYPE__HREF = eINSTANCE.getUomAreaPropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_AREA_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getUomAreaPropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_AREA_PROPERTY_TYPE__ROLE = eINSTANCE.getUomAreaPropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_AREA_PROPERTY_TYPE__SHOW = eINSTANCE.getUomAreaPropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_AREA_PROPERTY_TYPE__TITLE = eINSTANCE.getUomAreaPropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_AREA_PROPERTY_TYPE__TYPE = eINSTANCE.getUomAreaPropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_AREA_PROPERTY_TYPE__UUIDREF = eINSTANCE.getUomAreaPropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.UomLengthPropertyTypeImpl <em>Uom Length Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.UomLengthPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomLengthPropertyType()
		 * @generated
		 */
		EClass UOM_LENGTH_PROPERTY_TYPE = eINSTANCE.getUomLengthPropertyType();

		/**
		 * The meta object literal for the '<em><b>Unit Definition Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_LENGTH_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = eINSTANCE.getUomLengthPropertyType_UnitDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Unit Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_LENGTH_PROPERTY_TYPE__UNIT_DEFINITION = eINSTANCE.getUomLengthPropertyType_UnitDefinition();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_LENGTH_PROPERTY_TYPE__ACTUATE = eINSTANCE.getUomLengthPropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_LENGTH_PROPERTY_TYPE__ARCROLE = eINSTANCE.getUomLengthPropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_LENGTH_PROPERTY_TYPE__HREF = eINSTANCE.getUomLengthPropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_LENGTH_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getUomLengthPropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_LENGTH_PROPERTY_TYPE__ROLE = eINSTANCE.getUomLengthPropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_LENGTH_PROPERTY_TYPE__SHOW = eINSTANCE.getUomLengthPropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_LENGTH_PROPERTY_TYPE__TITLE = eINSTANCE.getUomLengthPropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_LENGTH_PROPERTY_TYPE__TYPE = eINSTANCE.getUomLengthPropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_LENGTH_PROPERTY_TYPE__UUIDREF = eINSTANCE.getUomLengthPropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.UomScalePropertyTypeImpl <em>Uom Scale Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.UomScalePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomScalePropertyType()
		 * @generated
		 */
		EClass UOM_SCALE_PROPERTY_TYPE = eINSTANCE.getUomScalePropertyType();

		/**
		 * The meta object literal for the '<em><b>Unit Definition Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_SCALE_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = eINSTANCE.getUomScalePropertyType_UnitDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Unit Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_SCALE_PROPERTY_TYPE__UNIT_DEFINITION = eINSTANCE.getUomScalePropertyType_UnitDefinition();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_SCALE_PROPERTY_TYPE__ACTUATE = eINSTANCE.getUomScalePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_SCALE_PROPERTY_TYPE__ARCROLE = eINSTANCE.getUomScalePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_SCALE_PROPERTY_TYPE__HREF = eINSTANCE.getUomScalePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_SCALE_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getUomScalePropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_SCALE_PROPERTY_TYPE__ROLE = eINSTANCE.getUomScalePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_SCALE_PROPERTY_TYPE__SHOW = eINSTANCE.getUomScalePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_SCALE_PROPERTY_TYPE__TITLE = eINSTANCE.getUomScalePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_SCALE_PROPERTY_TYPE__TYPE = eINSTANCE.getUomScalePropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_SCALE_PROPERTY_TYPE__UUIDREF = eINSTANCE.getUomScalePropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.UomTimePropertyTypeImpl <em>Uom Time Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.UomTimePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomTimePropertyType()
		 * @generated
		 */
		EClass UOM_TIME_PROPERTY_TYPE = eINSTANCE.getUomTimePropertyType();

		/**
		 * The meta object literal for the '<em><b>Unit Definition Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TIME_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = eINSTANCE.getUomTimePropertyType_UnitDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Unit Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_TIME_PROPERTY_TYPE__UNIT_DEFINITION = eINSTANCE.getUomTimePropertyType_UnitDefinition();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TIME_PROPERTY_TYPE__ACTUATE = eINSTANCE.getUomTimePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TIME_PROPERTY_TYPE__ARCROLE = eINSTANCE.getUomTimePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TIME_PROPERTY_TYPE__HREF = eINSTANCE.getUomTimePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TIME_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getUomTimePropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TIME_PROPERTY_TYPE__ROLE = eINSTANCE.getUomTimePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TIME_PROPERTY_TYPE__SHOW = eINSTANCE.getUomTimePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TIME_PROPERTY_TYPE__TITLE = eINSTANCE.getUomTimePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TIME_PROPERTY_TYPE__TYPE = eINSTANCE.getUomTimePropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_TIME_PROPERTY_TYPE__UUIDREF = eINSTANCE.getUomTimePropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.UomVelocityPropertyTypeImpl <em>Uom Velocity Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.UomVelocityPropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomVelocityPropertyType()
		 * @generated
		 */
		EClass UOM_VELOCITY_PROPERTY_TYPE = eINSTANCE.getUomVelocityPropertyType();

		/**
		 * The meta object literal for the '<em><b>Unit Definition Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VELOCITY_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = eINSTANCE.getUomVelocityPropertyType_UnitDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Unit Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_VELOCITY_PROPERTY_TYPE__UNIT_DEFINITION = eINSTANCE.getUomVelocityPropertyType_UnitDefinition();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VELOCITY_PROPERTY_TYPE__ACTUATE = eINSTANCE.getUomVelocityPropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VELOCITY_PROPERTY_TYPE__ARCROLE = eINSTANCE.getUomVelocityPropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VELOCITY_PROPERTY_TYPE__HREF = eINSTANCE.getUomVelocityPropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VELOCITY_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getUomVelocityPropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VELOCITY_PROPERTY_TYPE__ROLE = eINSTANCE.getUomVelocityPropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VELOCITY_PROPERTY_TYPE__SHOW = eINSTANCE.getUomVelocityPropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VELOCITY_PROPERTY_TYPE__TITLE = eINSTANCE.getUomVelocityPropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VELOCITY_PROPERTY_TYPE__TYPE = eINSTANCE.getUomVelocityPropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VELOCITY_PROPERTY_TYPE__UUIDREF = eINSTANCE.getUomVelocityPropertyType_Uuidref();

		/**
		 * The meta object literal for the '{@link org.isotc211._2005.gco.impl.UomVolumePropertyTypeImpl <em>Uom Volume Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.isotc211._2005.gco.impl.UomVolumePropertyTypeImpl
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getUomVolumePropertyType()
		 * @generated
		 */
		EClass UOM_VOLUME_PROPERTY_TYPE = eINSTANCE.getUomVolumePropertyType();

		/**
		 * The meta object literal for the '<em><b>Unit Definition Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VOLUME_PROPERTY_TYPE__UNIT_DEFINITION_GROUP = eINSTANCE.getUomVolumePropertyType_UnitDefinitionGroup();

		/**
		 * The meta object literal for the '<em><b>Unit Definition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UOM_VOLUME_PROPERTY_TYPE__UNIT_DEFINITION = eINSTANCE.getUomVolumePropertyType_UnitDefinition();

		/**
		 * The meta object literal for the '<em><b>Actuate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VOLUME_PROPERTY_TYPE__ACTUATE = eINSTANCE.getUomVolumePropertyType_Actuate();

		/**
		 * The meta object literal for the '<em><b>Arcrole</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VOLUME_PROPERTY_TYPE__ARCROLE = eINSTANCE.getUomVolumePropertyType_Arcrole();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VOLUME_PROPERTY_TYPE__HREF = eINSTANCE.getUomVolumePropertyType_Href();

		/**
		 * The meta object literal for the '<em><b>Nil Reason</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VOLUME_PROPERTY_TYPE__NIL_REASON = eINSTANCE.getUomVolumePropertyType_NilReason();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VOLUME_PROPERTY_TYPE__ROLE = eINSTANCE.getUomVolumePropertyType_Role();

		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VOLUME_PROPERTY_TYPE__SHOW = eINSTANCE.getUomVolumePropertyType_Show();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VOLUME_PROPERTY_TYPE__TITLE = eINSTANCE.getUomVolumePropertyType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VOLUME_PROPERTY_TYPE__TYPE = eINSTANCE.getUomVolumePropertyType_Type();

		/**
		 * The meta object literal for the '<em><b>Uuidref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UOM_VOLUME_PROPERTY_TYPE__UUIDREF = eINSTANCE.getUomVolumePropertyType_Uuidref();

		/**
		 * The meta object literal for the '<em>Date Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.isotc211._2005.gco.impl.GCOPackageImpl#getDateType()
		 * @generated
		 */
		EDataType DATE_TYPE = eINSTANCE.getDateType();

	}

} //GCOPackage
