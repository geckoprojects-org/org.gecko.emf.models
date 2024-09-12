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
package net.opengis.ogc;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * 
 *          This XML Schema defines OGC query filter capabilities documents.
 *          filter is an OGC Standard.
 * 
 *          Copyright (c) 2002,2003,2004,2010 Open Geospatial Consortium.
 * 
 *          To obtain additional rights of use, visit:
 *          http://www.opengeospatial.org/legal/ .
 * 
 *          Updated: 2012-07-21
 *       
 * 
 *          This XML Schema document includes and imports, directly or indirectly,
 *          all the XML Schema defined by the Filter Encoding Standard.
 * 
 *          Filter Encoding is an OGC Standard.
 *          Copyright (c) 2010 Open Geospatial Consortium.
 *          To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 *       
 * 
 *          This XML Schema defines OGC query filter capabilities documents.
 *          
 *          filter is an OGC Standard.
 *          Copyright (c) 2002,2003,2004,2010 Open Geospatial Consortium.
 *          To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 *          
 *          Updated: 2012-07-21
 *       
 * 
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * Top level GML schema
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * Basic support for tracking moving objects and objects with changing state.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * 
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * GML Coverage schema.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * How to encode coordinate reference system definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate reference systems, including the specific subtypes of coordinate reference systems. 
 * 		This schema encodes the Coordinate Reference System (SC_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates, with the exception of the abstract "SC_CRS" class. The "SC_CRS" class is encoded in referenceSystems.xsd, to eliminate the (circular) references from coordinateOperations.xsd to coordinateReferenceSystems.xsd. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * 		
 * 		GML is an OGC Standard.
 * 		Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * Observation schema for GML 3.1
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * 
 * 			Default Style schema for GML 3.1.1
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * The Temporal Reference Systems schema for GML 3.1 provides constructs for handling various styles of temporal reference system. 
 *     This schema reflects a partial implementation of the model described in ISO 19108:2002.
 *     
 *     GML is an OGC Standard.
 *     Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 *     To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * 
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * 
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * 
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * Extends the units.xsd and basicTypes.xsd schemas with types for recording measures using specific types of units, especially the measures and units needed for coordinate reference systems and coordinate operations. The specific unit types encoded are length, angle, scale factor, time, area, volume, speed, and grid length. This schema allows angle values to be recorded as single numbers or in degree-minute-second format. 
 * 		Parts of this schema are based on Subclause 6.5.7 of ISO/CD 19103 Geographic information - Conceptual schema language, on Subclause A.5.2.2.3 of ISO/CD 19118 Geographic information - Encoding, and on Subclause 4.7 of OpenGIS Recommendation Paper OGC 02-007r4 Units of Measure Use and Definition Recommendations.
 * 		
 * 		GML is an OGC Standard.
 * 		Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * The temporal topology schema for ISO19136 provides constructs for handling topological complexes and 
 * 		temporal feature relationships. 
 * 		Temporal geometric characteristics of features are represented as instants and periods. 
 * 		While, temporal context of features that does not relate to the position of time is described as connectivity relationships 
 * 		among instants and periods. These relationships are called temporal topology as they do not change in time, 
 * 		as long as the direction of time does not change. 
 * 		It is used effectively in the case of describing a family tree expressing evolution of species, an ecological cycle, 
 * 		a lineage of lands or buildings, or a history of separation and merger of administrative boundaries.
 * 		This schema reflects a partial yet consistent implementation of the model described in ISO 19108:2002.
 * 		
 * 		GML is an OGC Standard.
 * 		Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * 
 * 			Dictionary schema for GML 3.1.1 
 * 			Components to support the lists of definitions.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * GML base schema for GML 3
 * 			Components to support the GML encoding model.
 * 			The abstract Schematron rules can be used by any schema that includes gmlBase.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * The temporal schema for GML 3.1 provides constructs for handling time-varying spatial data. 
 *     This schema reflects a partial implementation of the model described in ISO 19108:2002.
 *     
 *     GML is an OGC Standard.
 *     Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 *     To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * Builds on gmlBase.xsd to encode units of measure (or uom), including definitions of units of measure and dictionaries of such definitions. GML 3.0 candidate schema, primary editor: Arliss Whiteside.			
 * 	Parts of this schema are based on Subclause 6.5.7 of ISO/CD 19103 Geographic information - Conceptual schema language, on Subclause A.5.2.2.3 of ISO/CD 19118 Geographic information - Encoding, and on most of OpenGIS Recommendation Paper OGC 02-007r4 Units of Measure Use and Definition Recommendations.
 * 		
 * 		GML is an OGC Standard.
 * 		Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
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
 * GML Feature schema.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This schema defines "direction" element and type.
 * 			
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * GML conformant schema for Values in which the  
 * 		    * scalar Value types and lists have their values recorded in simpleContent elements 
 * 		    * complex Value types are built recursively
 * 		    
 * 		    GML is an OGC Standard.
 * 		    Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 		    To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * How to encode coordinate system definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate systems, including the specific subtypes of coordinate systems. 
 * 		This schema encodes the Coordinate System (CS_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111.
 * 		
 * 		GML is an OGC Standard.
 * 		Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * How to encode datum definitions. Builds on referenceSystems.xsd to encode the data needed to define datums, including the specific subtypes of datums. 
 * 		This schema encodes the Datum (CD_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111.
 * 		
 * 		GML is an OGC Standard.
 * 		Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * How to encode coordinate operation definitions. Builds on referenceSystems.xsd to encode the data needed to define coordinate operations, including Transformations, Conversions, and other specific subtypes of operations. 
 * 		
 * 		This schema encodes the Coordinate Operation (CC_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111.
 * 		
 * 		GML is an OGC Standard.
 * 		Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * How to encode reference system definitions. Builds on several other parts of GML 3 to encode the data needed to define reference systems.
 * 		This schema encodes the Reference System (RS_) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. The SC_CRS class is also encoded here, to eliminate the (circular) references from coordinateOperations.xsd to coordinateReferenceSystems.xsd. The RS_SpatialReferenceSystemUsingGeographicIdentifier class is not encoded, since it is not applicable to coordinate positions. The CI_Citation class is not directly encoded, since such information can be included as metaDataProperty elements which are optionally allowed. A modified version of the EX_Extent (DataType) class from ISO 19115 is currently encoded here, using GML 3 schema types. (A more extensive version of the EX_Extent package might be XML encoded in the future, probably in a separate extent.xsd schema.)
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111.
 * 		
 * 		GML is an OGC Standard.
 * 		Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * How to encode positional data quality information. Builds on units.xsd to encode the data needed to describe the positional accuracy of coordinate operations. 
 * 		This schema encodes the Data Quality (DQ) package of the extended UML Model for OGC Abstract Specification Topic 2: Spatial Referencing by Coordinates. That UML model is adapted from ISO 19111 - Spatial referencing by coordinates, as described in Annex C of Topic 2. 
 * 		Caution: The CRS package in GML 3.1 and GML 3.1.1 is preliminary, and is expected to undergo some modifications that are not backward compatible during the development of GML 3.2 (ISO 19136). The GML 3.2 package will implement the model described in the revised version of ISO 19111. 
 * 		
 * 		GML is an OGC Standard.
 * 		Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * Grid geometries
 *     A subset of implicit geometries
 *     Designed for use with GML Coverage schema, but maybe useful elsewhere as well.
 *     
 *     GML is an OGC Standard.
 *     Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 *     To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * 
 * 			GML is an OGC Standard.
 * 			Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 * 			To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * 
 *     Generic simpleContent components for use in GML
 *     
 *     GML is an OGC Standard.
 *     Copyright (c) 2001,2005,2010 Open Geospatial Consortium.
 *     To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
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
 * <!-- end-model-doc -->
 * @see net.opengis.ogc.OGCFactory
 * @model kind="package"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryAggregates:3.1.1 appinfo='geometryAggregates.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:gml:3.1.1 appinfo='gml.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dynamicFeature:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:topology:3.1.1 appinfo='topology.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coverage:3.1.1 appinfo='coverage.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateReferenceSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:observation:3.1.1 appinfo='observation.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-defaultStyle:v3.1.0 appinfo='defaultStyle.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporalReferenceSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryPrimitives:3.1.1 appinfo='geometryPrimitives.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryBasic2d:3.1.1 appinfo='geometryBasic2d.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryBasic0d1d:v3.1.1 appinfo='geometryBasic0d1d.xsd\n\n  \t\t\t\n  &lt;sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\"&gt;Schematron validation&lt;/sch:title&gt;\n  \t\t\t\n  &lt;sch:pattern name=\"Check SRS tags\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"&gt;\n    \t\t\t\t\n    &lt;sch:rule abstract=\"true\" id=\"CRSLabels\"&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"not(@srsDimension) or @srsName\"&gt;The presence of a dimension attribute implies the presence of the srsName attribute.&lt;/sch:report&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"not(@axisLabels) or @srsName\"&gt;The presence of an axisLabels attribute implies the presence of the srsName attribute.&lt;/sch:report&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"not(@uomLabels) or @srsName\"&gt;The presence of an uomLabels attribute implies the presence of the srsName attribute.&lt;/sch:report&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"(not(@uomLabels) and not(@axisLabels)) or (@uomLabels and @axisLabels)\"&gt;The presence of an uomLabels attribute implies the presence of the axisLabels attribute and vice versa.&lt;/sch:report&gt;\n      \t\t\t\t\n    &lt;/sch:rule&gt;\n    \t\t\t\n  &lt;/sch:pattern&gt;\n  \t\t\t\n  &lt;sch:pattern name=\"Check Dimension\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"&gt;\n    \t\t\t\t\n    &lt;sch:rule abstract=\"true\" id=\"Count\"&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"not(@count) or @srsDimension\"&gt;The presence of a count attribute implies the presence of the dimension attribute.&lt;/sch:report&gt;\n      \t\t\t\t\n    &lt;/sch:rule&gt;\n    \t\t\t\n  &lt;/sch:pattern&gt;\n  \t\t\n'"
 *        annotation="urn:opengis:specification:gml:schema-measures:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporalTopology:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dictionary:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:gmlBase:3.1.1 appinfo='\n  \t\t\t\n  &lt;sch:title xmlns:sch=\"http://www.ascc.net/xml/schematron\"&gt;Schematron validation&lt;/sch:title&gt;\n  \t\t\t\n  &lt;sch:ns prefix=\"gml\" uri=\"http://www.opengis.net/gml\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/&gt;\n  \t\t\t\n  &lt;sch:ns prefix=\"xlink\" uri=\"http://www.w3.org/1999/xlink\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"/&gt;\n  \t\t\t\n  &lt;sch:pattern name=\"Check either href or content not both\" xmlns:sch=\"http://www.ascc.net/xml/schematron\"&gt;\n    \t\t\t\t\n    &lt;sch:rule abstract=\"true\" id=\"hrefOrContent\"&gt;\n      \t\t\t\t\t\n      &lt;sch:report test=\"@xlink:href and (*|text())\"&gt;Property element may not carry both a reference to an object and contain an object.&lt;/sch:report&gt;\n      \t\t\t\t\t\n      &lt;sch:assert test=\"@xlink:href | (*|text())\"&gt;Property element must either carry a reference to an object or contain an object.&lt;/sch:assert&gt;\n      \t\t\t\t\n    &lt;/sch:rule&gt;\n    \t\t\t\n  &lt;/sch:pattern&gt;\n  \t\t\n'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:temporal:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-units:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:feature:v3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:direction:3.1.1 appinfo='direction.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:valueObjects:3.1.1 appinfo='valueObjects.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:datums:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:coordinateOperations:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:referenceSystems:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:dataQuality:3.1.1 appinfo=''"
 *        annotation="urn:opengis:specification:gml:schema-xsd:grids:3.1.1 appinfo='grids.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:geometryComplexes:v3.1.1 appinfo='geometryComplexes.xsd'"
 *        annotation="urn:opengis:specification:gml:schema-xsd:basicTypes:3.1.1 appinfo='basicTypes.xsd'"
 * @generated
 */
@ProviderType
@EPackage(uri = OGCPackage.eNS_URI, genModel = "/model/wfs.genmodel", genModelSourceLocations = {"model/wfs.genmodel","net.opengis.wfs.model/model/wfs.genmodel"}, ecore="/model/ogc.ecore", ecoreSourceLocations="/model/ogc.ecore")
public interface OGCPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ogc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/ogc";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ogc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OGCPackage eINSTANCE = net.opengis.ogc.impl.OGCPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.AbstractIdTypeImpl <em>Abstract Id Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.AbstractIdTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getAbstractIdType()
	 * @generated
	 */
	int ABSTRACT_ID_TYPE = 0;

	/**
	 * The number of structural features of the '<em>Abstract Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ID_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.ArithmeticOperatorsTypeImpl <em>Arithmetic Operators Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.ArithmeticOperatorsTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getArithmeticOperatorsType()
	 * @generated
	 */
	int ARITHMETIC_OPERATORS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATORS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Simple Arithmetic</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATORS_TYPE__SIMPLE_ARITHMETIC = 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATORS_TYPE__FUNCTIONS = 2;

	/**
	 * The number of structural features of the '<em>Arithmetic Operators Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATORS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Arithmetic Operators Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OPERATORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.SpatialOpsTypeImpl <em>Spatial Ops Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.SpatialOpsTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialOpsType()
	 * @generated
	 */
	int SPATIAL_OPS_TYPE = 40;

	/**
	 * The number of structural features of the '<em>Spatial Ops Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPS_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Spatial Ops Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.BBOXTypeImpl <em>BBOX Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.BBOXTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getBBOXType()
	 * @generated
	 */
	int BBOX_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOX_TYPE__PROPERTY_NAME = SPATIAL_OPS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Envelope Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOX_TYPE__ENVELOPE_GROUP = SPATIAL_OPS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOX_TYPE__ENVELOPE = SPATIAL_OPS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BBOX Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOX_TYPE_FEATURE_COUNT = SPATIAL_OPS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BBOX Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBOX_TYPE_OPERATION_COUNT = SPATIAL_OPS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.ComparisonOpsTypeImpl <em>Comparison Ops Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.ComparisonOpsTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getComparisonOpsType()
	 * @generated
	 */
	int COMPARISON_OPS_TYPE = 8;

	/**
	 * The number of structural features of the '<em>Comparison Ops Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPS_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Comparison Ops Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.BinaryComparisonOpTypeImpl <em>Binary Comparison Op Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.BinaryComparisonOpTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getBinaryComparisonOpType()
	 * @generated
	 */
	int BINARY_COMPARISON_OP_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COMPARISON_OP_TYPE__EXPRESSION_GROUP = COMPARISON_OPS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COMPARISON_OP_TYPE__EXPRESSION = COMPARISON_OPS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Match Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COMPARISON_OP_TYPE__MATCH_CASE = COMPARISON_OPS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Comparison Op Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COMPARISON_OP_TYPE_FEATURE_COUNT = COMPARISON_OPS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Binary Comparison Op Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_COMPARISON_OP_TYPE_OPERATION_COUNT = COMPARISON_OPS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.LogicOpsTypeImpl <em>Logic Ops Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.LogicOpsTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getLogicOpsType()
	 * @generated
	 */
	int LOGIC_OPS_TYPE = 27;

	/**
	 * The number of structural features of the '<em>Logic Ops Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_OPS_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Logic Ops Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIC_OPS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.BinaryLogicOpTypeImpl <em>Binary Logic Op Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.BinaryLogicOpTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getBinaryLogicOpType()
	 * @generated
	 */
	int BINARY_LOGIC_OP_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_OP_TYPE__GROUP = LOGIC_OPS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison Ops Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP = LOGIC_OPS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparison Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_OP_TYPE__COMPARISON_OPS = LOGIC_OPS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Spatial Ops Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP = LOGIC_OPS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Spatial Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_OP_TYPE__SPATIAL_OPS = LOGIC_OPS_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Logic Ops Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP = LOGIC_OPS_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Logic Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_OP_TYPE__LOGIC_OPS = LOGIC_OPS_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_OP_TYPE__FUNCTION = LOGIC_OPS_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Binary Logic Op Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_OP_TYPE_FEATURE_COUNT = LOGIC_OPS_TYPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Binary Logic Op Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_LOGIC_OP_TYPE_OPERATION_COUNT = LOGIC_OPS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.ExpressionTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 13;

	/**
	 * The number of structural features of the '<em>Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.BinaryOperatorTypeImpl <em>Binary Operator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.BinaryOperatorTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getBinaryOperatorType()
	 * @generated
	 */
	int BINARY_OPERATOR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_TYPE__EXPRESSION_GROUP = EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_TYPE__EXPRESSION = EXPRESSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_TYPE_FEATURE_COUNT = EXPRESSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Operator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_TYPE_OPERATION_COUNT = EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.BinarySpatialOpTypeImpl <em>Binary Spatial Op Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.BinarySpatialOpTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getBinarySpatialOpType()
	 * @generated
	 */
	int BINARY_SPATIAL_OP_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME = SPATIAL_OPS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1 = SPATIAL_OPS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geometry Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SPATIAL_OP_TYPE__GEOMETRY_GROUP = SPATIAL_OPS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SPATIAL_OP_TYPE__GEOMETRY = SPATIAL_OPS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Envelope Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SPATIAL_OP_TYPE__ENVELOPE_GROUP = SPATIAL_OPS_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SPATIAL_OP_TYPE__ENVELOPE = SPATIAL_OPS_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Binary Spatial Op Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SPATIAL_OP_TYPE_FEATURE_COUNT = SPATIAL_OPS_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Binary Spatial Op Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_SPATIAL_OP_TYPE_OPERATION_COUNT = SPATIAL_OPS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.ComparisonOperatorsTypeImpl <em>Comparison Operators Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.ComparisonOperatorsTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getComparisonOperatorsType()
	 * @generated
	 */
	int COMPARISON_OPERATORS_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATORS_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Comparison Operator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATORS_TYPE__COMPARISON_OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Comparison Operators Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATORS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Comparison Operators Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.DistanceBufferTypeImpl <em>Distance Buffer Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.DistanceBufferTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getDistanceBufferType()
	 * @generated
	 */
	int DISTANCE_BUFFER_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_BUFFER_TYPE__PROPERTY_NAME = SPATIAL_OPS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Geometry Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_BUFFER_TYPE__GEOMETRY_GROUP = SPATIAL_OPS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Geometry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_BUFFER_TYPE__GEOMETRY = SPATIAL_OPS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_BUFFER_TYPE__DISTANCE = SPATIAL_OPS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Distance Buffer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_BUFFER_TYPE_FEATURE_COUNT = SPATIAL_OPS_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Distance Buffer Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_BUFFER_TYPE_OPERATION_COUNT = SPATIAL_OPS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.DistanceTypeImpl <em>Distance Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.DistanceTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getDistanceType()
	 * @generated
	 */
	int DISTANCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_TYPE__UNITS = 1;

	/**
	 * The number of structural features of the '<em>Distance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Distance Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTANCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.DocumentRootImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 11;

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
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 3;

	/**
	 * The feature id for the '<em><b>Add</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADD = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>And</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AND = 6;

	/**
	 * The feature id for the '<em><b>Logic Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOGIC_OPS = 7;

	/**
	 * The feature id for the '<em><b>BBOX</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BBOX = 8;

	/**
	 * The feature id for the '<em><b>Spatial Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPATIAL_OPS = 9;

	/**
	 * The feature id for the '<em><b>Beyond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BEYOND = 10;

	/**
	 * The feature id for the '<em><b>Comparison Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COMPARISON_OPS = 11;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONTAINS = 12;

	/**
	 * The feature id for the '<em><b>Crosses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CROSSES = 13;

	/**
	 * The feature id for the '<em><b>Disjoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DISJOINT = 14;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIV = 15;

	/**
	 * The feature id for the '<em><b>DWithin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DWITHIN = 16;

	/**
	 * The feature id for the '<em><b>EID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EID = 17;

	/**
	 * The feature id for the '<em><b>Equals</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EQUALS = 18;

	/**
	 * The feature id for the '<em><b>Feature Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE_ID = 19;

	/**
	 * The feature id for the '<em><b>FID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FID = 20;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER = 21;

	/**
	 * The feature id for the '<em><b>Filter Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FILTER_CAPABILITIES = 22;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FUNCTION = 23;

	/**
	 * The feature id for the '<em><b>Gml Object Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GML_OBJECT_ID = 24;

	/**
	 * The feature id for the '<em><b>Intersects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INTERSECTS = 25;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LITERAL = 26;

	/**
	 * The feature id for the '<em><b>Logical Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOGICAL_OPERATORS = 27;

	/**
	 * The feature id for the '<em><b>Mul</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MUL = 28;

	/**
	 * The feature id for the '<em><b>Not</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOT = 29;

	/**
	 * The feature id for the '<em><b>Or</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OR = 30;

	/**
	 * The feature id for the '<em><b>Overlaps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OVERLAPS = 31;

	/**
	 * The feature id for the '<em><b>Property Is Between</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_IS_BETWEEN = 32;

	/**
	 * The feature id for the '<em><b>Property Is Equal To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO = 33;

	/**
	 * The feature id for the '<em><b>Property Is Greater Than</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN = 34;

	/**
	 * The feature id for the '<em><b>Property Is Greater Than Or Equal To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO = 35;

	/**
	 * The feature id for the '<em><b>Property Is Less Than</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN = 36;

	/**
	 * The feature id for the '<em><b>Property Is Less Than Or Equal To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO = 37;

	/**
	 * The feature id for the '<em><b>Property Is Like</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_IS_LIKE = 38;

	/**
	 * The feature id for the '<em><b>Property Is Not Equal To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO = 39;

	/**
	 * The feature id for the '<em><b>Property Is Null</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_IS_NULL = 40;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_NAME = 41;

	/**
	 * The feature id for the '<em><b>Simple Arithmetic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SIMPLE_ARITHMETIC = 42;

	/**
	 * The feature id for the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SORT_BY = 43;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB = 44;

	/**
	 * The feature id for the '<em><b>Touches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TOUCHES = 45;

	/**
	 * The feature id for the '<em><b>Within</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WITHIN = 46;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 47;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.EIDTypeImpl <em>EID Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.EIDTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getEIDType()
	 * @generated
	 */
	int EID_TYPE = 12;

	/**
	 * The number of structural features of the '<em>EID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EID_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.FeatureIdTypeImpl <em>Feature Id Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.FeatureIdTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getFeatureIdType()
	 * @generated
	 */
	int FEATURE_ID_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Fid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TYPE__FID = ABSTRACT_ID_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TYPE_FEATURE_COUNT = ABSTRACT_ID_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Feature Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_ID_TYPE_OPERATION_COUNT = ABSTRACT_ID_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.FIDTypeImpl <em>FID Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.FIDTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getFIDType()
	 * @generated
	 */
	int FID_TYPE = 15;

	/**
	 * The number of structural features of the '<em>FID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FID_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>FID Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FID_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.FilterCapabilitiesTypeImpl <em>Filter Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.FilterCapabilitiesTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getFilterCapabilitiesType()
	 * @generated
	 */
	int FILTER_CAPABILITIES_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Spatial Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES = 0;

	/**
	 * The feature id for the '<em><b>Scalar Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES = 1;

	/**
	 * The feature id for the '<em><b>Id Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES = 2;

	/**
	 * The number of structural features of the '<em>Filter Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CAPABILITIES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Filter Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_CAPABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.FilterTypeImpl <em>Filter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.FilterTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getFilterType()
	 * @generated
	 */
	int FILTER_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Spatial Ops Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__SPATIAL_OPS_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Spatial Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__SPATIAL_OPS = 1;

	/**
	 * The feature id for the '<em><b>Comparison Ops Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__COMPARISON_OPS_GROUP = 2;

	/**
	 * The feature id for the '<em><b>Comparison Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__COMPARISON_OPS = 3;

	/**
	 * The feature id for the '<em><b>Logic Ops Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__LOGIC_OPS_GROUP = 4;

	/**
	 * The feature id for the '<em><b>Logic Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__LOGIC_OPS = 5;

	/**
	 * The feature id for the '<em><b>Id Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ID_GROUP = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE__ID = 7;

	/**
	 * The number of structural features of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Filter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.FunctionNamesTypeImpl <em>Function Names Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.FunctionNamesTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getFunctionNamesType()
	 * @generated
	 */
	int FUNCTION_NAMES_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_NAMES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Function Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_NAMES_TYPE__FUNCTION_NAME = 1;

	/**
	 * The number of structural features of the '<em>Function Names Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_NAMES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function Names Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_NAMES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.FunctionNameTypeImpl <em>Function Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.FunctionNameTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getFunctionNameType()
	 * @generated
	 */
	int FUNCTION_NAME_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>NArgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_NAME_TYPE__NARGS = 1;

	/**
	 * The number of structural features of the '<em>Function Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.FunctionsTypeImpl <em>Functions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.FunctionsTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getFunctionsType()
	 * @generated
	 */
	int FUNCTIONS_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Function Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_TYPE__FUNCTION_NAMES = 0;

	/**
	 * The number of structural features of the '<em>Functions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Functions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.FunctionTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__EXPRESSION_GROUP = EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__EXPRESSION = EXPRESSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__NAME = EXPRESSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = EXPRESSION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_OPERATION_COUNT = EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.GeometryOperandsTypeImpl <em>Geometry Operands Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.GeometryOperandsTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getGeometryOperandsType()
	 * @generated
	 */
	int GEOMETRY_OPERANDS_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Geometry Operand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERANDS_TYPE__GEOMETRY_OPERAND = 0;

	/**
	 * The number of structural features of the '<em>Geometry Operands Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERANDS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Geometry Operands Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEOMETRY_OPERANDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.GmlObjectIdTypeImpl <em>Gml Object Id Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.GmlObjectIdTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getGmlObjectIdType()
	 * @generated
	 */
	int GML_OBJECT_ID_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_ID_TYPE__ID = ABSTRACT_ID_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gml Object Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_ID_TYPE_FEATURE_COUNT = ABSTRACT_ID_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Gml Object Id Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_ID_TYPE_OPERATION_COUNT = ABSTRACT_ID_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.IdCapabilitiesTypeImpl <em>Id Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.IdCapabilitiesTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getIdCapabilitiesType()
	 * @generated
	 */
	int ID_CAPABILITIES_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CAPABILITIES_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>EID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CAPABILITIES_TYPE__EID = 1;

	/**
	 * The feature id for the '<em><b>FID</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CAPABILITIES_TYPE__FID = 2;

	/**
	 * The number of structural features of the '<em>Id Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CAPABILITIES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Id Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_CAPABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.LiteralTypeImpl <em>Literal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.LiteralTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getLiteralType()
	 * @generated
	 */
	int LITERAL_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE__MIXED = EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE__ANY = EXPRESSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Literal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_FEATURE_COUNT = EXPRESSION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Literal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_OPERATION_COUNT = EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.LogicalOperatorsTypeImpl <em>Logical Operators Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.LogicalOperatorsTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getLogicalOperatorsType()
	 * @generated
	 */
	int LOGICAL_OPERATORS_TYPE = 26;

	/**
	 * The number of structural features of the '<em>Logical Operators Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATORS_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Logical Operators Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OPERATORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.LowerBoundaryTypeImpl <em>Lower Boundary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.LowerBoundaryTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getLowerBoundaryType()
	 * @generated
	 */
	int LOWER_BOUNDARY_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUNDARY_TYPE__EXPRESSION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUNDARY_TYPE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Lower Boundary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUNDARY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Lower Boundary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_BOUNDARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.PropertyIsBetweenTypeImpl <em>Property Is Between Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.PropertyIsBetweenTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getPropertyIsBetweenType()
	 * @generated
	 */
	int PROPERTY_IS_BETWEEN_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_BETWEEN_TYPE__EXPRESSION_GROUP = COMPARISON_OPS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_BETWEEN_TYPE__EXPRESSION = COMPARISON_OPS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lower Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY = COMPARISON_OPS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Upper Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY = COMPARISON_OPS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Property Is Between Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_BETWEEN_TYPE_FEATURE_COUNT = COMPARISON_OPS_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Property Is Between Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_BETWEEN_TYPE_OPERATION_COUNT = COMPARISON_OPS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.PropertyIsLikeTypeImpl <em>Property Is Like Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.PropertyIsLikeTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getPropertyIsLikeType()
	 * @generated
	 */
	int PROPERTY_IS_LIKE_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME = COMPARISON_OPS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_LIKE_TYPE__LITERAL = COMPARISON_OPS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Escape Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR = COMPARISON_OPS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Match Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_LIKE_TYPE__MATCH_CASE = COMPARISON_OPS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Single Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR = COMPARISON_OPS_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wild Card</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_LIKE_TYPE__WILD_CARD = COMPARISON_OPS_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Property Is Like Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_LIKE_TYPE_FEATURE_COUNT = COMPARISON_OPS_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Property Is Like Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_LIKE_TYPE_OPERATION_COUNT = COMPARISON_OPS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.PropertyIsNullTypeImpl <em>Property Is Null Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.PropertyIsNullTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getPropertyIsNullType()
	 * @generated
	 */
	int PROPERTY_IS_NULL_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_NULL_TYPE__PROPERTY_NAME = COMPARISON_OPS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Is Null Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_NULL_TYPE_FEATURE_COUNT = COMPARISON_OPS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Is Null Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_IS_NULL_TYPE_OPERATION_COUNT = COMPARISON_OPS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.PropertyNameTypeImpl <em>Property Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.PropertyNameTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getPropertyNameType()
	 * @generated
	 */
	int PROPERTY_NAME_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAME_TYPE__MIXED = EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAME_TYPE_FEATURE_COUNT = EXPRESSION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_NAME_TYPE_OPERATION_COUNT = EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.ScalarCapabilitiesTypeImpl <em>Scalar Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.ScalarCapabilitiesTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getScalarCapabilitiesType()
	 * @generated
	 */
	int SCALAR_CAPABILITIES_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Logical Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS = 0;

	/**
	 * The feature id for the '<em><b>Comparison Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS = 1;

	/**
	 * The feature id for the '<em><b>Arithmetic Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS = 2;

	/**
	 * The number of structural features of the '<em>Scalar Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_CAPABILITIES_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Scalar Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALAR_CAPABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.SimpleArithmeticTypeImpl <em>Simple Arithmetic Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.SimpleArithmeticTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSimpleArithmeticType()
	 * @generated
	 */
	int SIMPLE_ARITHMETIC_TYPE = 34;

	/**
	 * The number of structural features of the '<em>Simple Arithmetic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ARITHMETIC_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Simple Arithmetic Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ARITHMETIC_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.SortByTypeImpl <em>Sort By Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.SortByTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSortByType()
	 * @generated
	 */
	int SORT_BY_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Sort Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_TYPE__SORT_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>Sort By Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sort By Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_BY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.SortPropertyTypeImpl <em>Sort Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.SortPropertyTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSortPropertyType()
	 * @generated
	 */
	int SORT_PROPERTY_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_PROPERTY_TYPE__PROPERTY_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sort Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_PROPERTY_TYPE__SORT_ORDER = 1;

	/**
	 * The number of structural features of the '<em>Sort Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Sort Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.SpatialCapabilitiesTypeImpl <em>Spatial Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.SpatialCapabilitiesTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialCapabilitiesType()
	 * @generated
	 */
	int SPATIAL_CAPABILITIES_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Geometry Operands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS = 0;

	/**
	 * The feature id for the '<em><b>Spatial Operators</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS = 1;

	/**
	 * The number of structural features of the '<em>Spatial Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CAPABILITIES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Spatial Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CAPABILITIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.SpatialOperatorsTypeImpl <em>Spatial Operators Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.SpatialOperatorsTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialOperatorsType()
	 * @generated
	 */
	int SPATIAL_OPERATORS_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Spatial Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPERATORS_TYPE__SPATIAL_OPERATOR = 0;

	/**
	 * The number of structural features of the '<em>Spatial Operators Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPERATORS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Spatial Operators Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPERATORS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.SpatialOperatorTypeImpl <em>Spatial Operator Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.SpatialOperatorTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialOperatorType()
	 * @generated
	 */
	int SPATIAL_OPERATOR_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Geometry Operands</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPERATOR_TYPE__GEOMETRY_OPERANDS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPERATOR_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Spatial Operator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPERATOR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Spatial Operator Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_OPERATOR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.UnaryLogicOpTypeImpl <em>Unary Logic Op Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.UnaryLogicOpTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getUnaryLogicOpType()
	 * @generated
	 */
	int UNARY_LOGIC_OP_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Comparison Ops Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP = LOGIC_OPS_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGIC_OP_TYPE__COMPARISON_OPS = LOGIC_OPS_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Spatial Ops Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP = LOGIC_OPS_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Spatial Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGIC_OP_TYPE__SPATIAL_OPS = LOGIC_OPS_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Logic Ops Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP = LOGIC_OPS_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Logic Ops</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGIC_OP_TYPE__LOGIC_OPS = LOGIC_OPS_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGIC_OP_TYPE__FUNCTION = LOGIC_OPS_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Unary Logic Op Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGIC_OP_TYPE_FEATURE_COUNT = LOGIC_OPS_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Unary Logic Op Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_LOGIC_OP_TYPE_OPERATION_COUNT = LOGIC_OPS_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.impl.UpperBoundaryTypeImpl <em>Upper Boundary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.impl.UpperBoundaryTypeImpl
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getUpperBoundaryType()
	 * @generated
	 */
	int UPPER_BOUNDARY_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Expression Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUNDARY_TYPE__EXPRESSION_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUNDARY_TYPE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Upper Boundary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUNDARY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Upper Boundary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUNDARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.ComparisonOperatorType <em>Comparison Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.ComparisonOperatorType
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getComparisonOperatorType()
	 * @generated
	 */
	int COMPARISON_OPERATOR_TYPE = 43;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.SortOrderType <em>Sort Order Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.SortOrderType
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSortOrderType()
	 * @generated
	 */
	int SORT_ORDER_TYPE = 44;

	/**
	 * The meta object id for the '{@link net.opengis.ogc.SpatialOperatorNameType <em>Spatial Operator Name Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.SpatialOperatorNameType
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialOperatorNameType()
	 * @generated
	 */
	int SPATIAL_OPERATOR_NAME_TYPE = 45;

	/**
	 * The meta object id for the '<em>Comparison Operator Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.ComparisonOperatorType
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getComparisonOperatorTypeObject()
	 * @generated
	 */
	int COMPARISON_OPERATOR_TYPE_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Geometry Operand Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.namespace.QName
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getGeometryOperandType()
	 * @generated
	 */
	int GEOMETRY_OPERAND_TYPE = 47;

	/**
	 * The meta object id for the '<em>Sort Order Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.SortOrderType
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSortOrderTypeObject()
	 * @generated
	 */
	int SORT_ORDER_TYPE_OBJECT = 48;

	/**
	 * The meta object id for the '<em>Spatial Operator Name Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.ogc.SpatialOperatorNameType
	 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialOperatorNameTypeObject()
	 * @generated
	 */
	int SPATIAL_OPERATOR_NAME_TYPE_OBJECT = 49;


	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.AbstractIdType <em>Abstract Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Id Type</em>'.
	 * @see net.opengis.ogc.AbstractIdType
	 * @generated
	 */
	EClass getAbstractIdType();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.ArithmeticOperatorsType <em>Arithmetic Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Operators Type</em>'.
	 * @see net.opengis.ogc.ArithmeticOperatorsType
	 * @generated
	 */
	EClass getArithmeticOperatorsType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.ArithmeticOperatorsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.ogc.ArithmeticOperatorsType#getGroup()
	 * @see #getArithmeticOperatorsType()
	 * @generated
	 */
	EAttribute getArithmeticOperatorsType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.ArithmeticOperatorsType#getSimpleArithmetic <em>Simple Arithmetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Simple Arithmetic</em>'.
	 * @see net.opengis.ogc.ArithmeticOperatorsType#getSimpleArithmetic()
	 * @see #getArithmeticOperatorsType()
	 * @generated
	 */
	EReference getArithmeticOperatorsType_SimpleArithmetic();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.ArithmeticOperatorsType#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see net.opengis.ogc.ArithmeticOperatorsType#getFunctions()
	 * @see #getArithmeticOperatorsType()
	 * @generated
	 */
	EReference getArithmeticOperatorsType_Functions();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.BBOXType <em>BBOX Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BBOX Type</em>'.
	 * @see net.opengis.ogc.BBOXType
	 * @generated
	 */
	EClass getBBOXType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.BBOXType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name</em>'.
	 * @see net.opengis.ogc.BBOXType#getPropertyName()
	 * @see #getBBOXType()
	 * @generated
	 */
	EReference getBBOXType_PropertyName();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.BBOXType#getEnvelopeGroup <em>Envelope Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Envelope Group</em>'.
	 * @see net.opengis.ogc.BBOXType#getEnvelopeGroup()
	 * @see #getBBOXType()
	 * @generated
	 */
	EAttribute getBBOXType_EnvelopeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.BBOXType#getEnvelope <em>Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Envelope</em>'.
	 * @see net.opengis.ogc.BBOXType#getEnvelope()
	 * @see #getBBOXType()
	 * @generated
	 */
	EReference getBBOXType_Envelope();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.BinaryComparisonOpType <em>Binary Comparison Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Comparison Op Type</em>'.
	 * @see net.opengis.ogc.BinaryComparisonOpType
	 * @generated
	 */
	EClass getBinaryComparisonOpType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.BinaryComparisonOpType#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see net.opengis.ogc.BinaryComparisonOpType#getExpressionGroup()
	 * @see #getBinaryComparisonOpType()
	 * @generated
	 */
	EAttribute getBinaryComparisonOpType_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.BinaryComparisonOpType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see net.opengis.ogc.BinaryComparisonOpType#getExpression()
	 * @see #getBinaryComparisonOpType()
	 * @generated
	 */
	EReference getBinaryComparisonOpType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.BinaryComparisonOpType#isMatchCase <em>Match Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Case</em>'.
	 * @see net.opengis.ogc.BinaryComparisonOpType#isMatchCase()
	 * @see #getBinaryComparisonOpType()
	 * @generated
	 */
	EAttribute getBinaryComparisonOpType_MatchCase();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.BinaryLogicOpType <em>Binary Logic Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Logic Op Type</em>'.
	 * @see net.opengis.ogc.BinaryLogicOpType
	 * @generated
	 */
	EClass getBinaryLogicOpType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.BinaryLogicOpType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.ogc.BinaryLogicOpType#getGroup()
	 * @see #getBinaryLogicOpType()
	 * @generated
	 */
	EAttribute getBinaryLogicOpType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.BinaryLogicOpType#getComparisonOpsGroup <em>Comparison Ops Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comparison Ops Group</em>'.
	 * @see net.opengis.ogc.BinaryLogicOpType#getComparisonOpsGroup()
	 * @see #getBinaryLogicOpType()
	 * @generated
	 */
	EAttribute getBinaryLogicOpType_ComparisonOpsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.BinaryLogicOpType#getComparisonOps <em>Comparison Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comparison Ops</em>'.
	 * @see net.opengis.ogc.BinaryLogicOpType#getComparisonOps()
	 * @see #getBinaryLogicOpType()
	 * @generated
	 */
	EReference getBinaryLogicOpType_ComparisonOps();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.BinaryLogicOpType#getSpatialOpsGroup <em>Spatial Ops Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Spatial Ops Group</em>'.
	 * @see net.opengis.ogc.BinaryLogicOpType#getSpatialOpsGroup()
	 * @see #getBinaryLogicOpType()
	 * @generated
	 */
	EAttribute getBinaryLogicOpType_SpatialOpsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.BinaryLogicOpType#getSpatialOps <em>Spatial Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spatial Ops</em>'.
	 * @see net.opengis.ogc.BinaryLogicOpType#getSpatialOps()
	 * @see #getBinaryLogicOpType()
	 * @generated
	 */
	EReference getBinaryLogicOpType_SpatialOps();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.BinaryLogicOpType#getLogicOpsGroup <em>Logic Ops Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Logic Ops Group</em>'.
	 * @see net.opengis.ogc.BinaryLogicOpType#getLogicOpsGroup()
	 * @see #getBinaryLogicOpType()
	 * @generated
	 */
	EAttribute getBinaryLogicOpType_LogicOpsGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.BinaryLogicOpType#getLogicOps <em>Logic Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Logic Ops</em>'.
	 * @see net.opengis.ogc.BinaryLogicOpType#getLogicOps()
	 * @see #getBinaryLogicOpType()
	 * @generated
	 */
	EReference getBinaryLogicOpType_LogicOps();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.BinaryLogicOpType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see net.opengis.ogc.BinaryLogicOpType#getFunction()
	 * @see #getBinaryLogicOpType()
	 * @generated
	 */
	EReference getBinaryLogicOpType_Function();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.BinaryOperatorType <em>Binary Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator Type</em>'.
	 * @see net.opengis.ogc.BinaryOperatorType
	 * @generated
	 */
	EClass getBinaryOperatorType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.BinaryOperatorType#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see net.opengis.ogc.BinaryOperatorType#getExpressionGroup()
	 * @see #getBinaryOperatorType()
	 * @generated
	 */
	EAttribute getBinaryOperatorType_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.BinaryOperatorType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see net.opengis.ogc.BinaryOperatorType#getExpression()
	 * @see #getBinaryOperatorType()
	 * @generated
	 */
	EReference getBinaryOperatorType_Expression();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.BinarySpatialOpType <em>Binary Spatial Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Spatial Op Type</em>'.
	 * @see net.opengis.ogc.BinarySpatialOpType
	 * @generated
	 */
	EClass getBinarySpatialOpType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.BinarySpatialOpType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name</em>'.
	 * @see net.opengis.ogc.BinarySpatialOpType#getPropertyName()
	 * @see #getBinarySpatialOpType()
	 * @generated
	 */
	EReference getBinarySpatialOpType_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.BinarySpatialOpType#getPropertyName1 <em>Property Name1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name1</em>'.
	 * @see net.opengis.ogc.BinarySpatialOpType#getPropertyName1()
	 * @see #getBinarySpatialOpType()
	 * @generated
	 */
	EReference getBinarySpatialOpType_PropertyName1();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.BinarySpatialOpType#getGeometryGroup <em>Geometry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Geometry Group</em>'.
	 * @see net.opengis.ogc.BinarySpatialOpType#getGeometryGroup()
	 * @see #getBinarySpatialOpType()
	 * @generated
	 */
	EAttribute getBinarySpatialOpType_GeometryGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.BinarySpatialOpType#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see net.opengis.ogc.BinarySpatialOpType#getGeometry()
	 * @see #getBinarySpatialOpType()
	 * @generated
	 */
	EReference getBinarySpatialOpType_Geometry();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.BinarySpatialOpType#getEnvelopeGroup <em>Envelope Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Envelope Group</em>'.
	 * @see net.opengis.ogc.BinarySpatialOpType#getEnvelopeGroup()
	 * @see #getBinarySpatialOpType()
	 * @generated
	 */
	EAttribute getBinarySpatialOpType_EnvelopeGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.BinarySpatialOpType#getEnvelope <em>Envelope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Envelope</em>'.
	 * @see net.opengis.ogc.BinarySpatialOpType#getEnvelope()
	 * @see #getBinarySpatialOpType()
	 * @generated
	 */
	EReference getBinarySpatialOpType_Envelope();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.ComparisonOperatorsType <em>Comparison Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Operators Type</em>'.
	 * @see net.opengis.ogc.ComparisonOperatorsType
	 * @generated
	 */
	EClass getComparisonOperatorsType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.ComparisonOperatorsType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.ogc.ComparisonOperatorsType#getGroup()
	 * @see #getComparisonOperatorsType()
	 * @generated
	 */
	EAttribute getComparisonOperatorsType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.ComparisonOperatorsType#getComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comparison Operator</em>'.
	 * @see net.opengis.ogc.ComparisonOperatorsType#getComparisonOperator()
	 * @see #getComparisonOperatorsType()
	 * @generated
	 */
	EAttribute getComparisonOperatorsType_ComparisonOperator();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.ComparisonOpsType <em>Comparison Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Ops Type</em>'.
	 * @see net.opengis.ogc.ComparisonOpsType
	 * @generated
	 */
	EClass getComparisonOpsType();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.DistanceBufferType <em>Distance Buffer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Buffer Type</em>'.
	 * @see net.opengis.ogc.DistanceBufferType
	 * @generated
	 */
	EClass getDistanceBufferType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DistanceBufferType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name</em>'.
	 * @see net.opengis.ogc.DistanceBufferType#getPropertyName()
	 * @see #getDistanceBufferType()
	 * @generated
	 */
	EReference getDistanceBufferType_PropertyName();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.DistanceBufferType#getGeometryGroup <em>Geometry Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Geometry Group</em>'.
	 * @see net.opengis.ogc.DistanceBufferType#getGeometryGroup()
	 * @see #getDistanceBufferType()
	 * @generated
	 */
	EAttribute getDistanceBufferType_GeometryGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DistanceBufferType#getGeometry <em>Geometry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry</em>'.
	 * @see net.opengis.ogc.DistanceBufferType#getGeometry()
	 * @see #getDistanceBufferType()
	 * @generated
	 */
	EReference getDistanceBufferType_Geometry();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DistanceBufferType#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Distance</em>'.
	 * @see net.opengis.ogc.DistanceBufferType#getDistance()
	 * @see #getDistanceBufferType()
	 * @generated
	 */
	EReference getDistanceBufferType_Distance();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.DistanceType <em>Distance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distance Type</em>'.
	 * @see net.opengis.ogc.DistanceType
	 * @generated
	 */
	EClass getDistanceType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.DistanceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.ogc.DistanceType#getValue()
	 * @see #getDistanceType()
	 * @generated
	 */
	EAttribute getDistanceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.DistanceType#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see net.opengis.ogc.DistanceType#getUnits()
	 * @see #getDistanceType()
	 * @generated
	 */
	EAttribute getDistanceType_Units();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.ogc.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.ogc.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.ogc.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Id();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getAdd <em>Add</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Add</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getAdd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Add();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getExpression()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getAnd <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>And</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getAnd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_And();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getLogicOps <em>Logic Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logic Ops</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getLogicOps()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LogicOps();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getBBOX <em>BBOX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>BBOX</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getBBOX()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_BBOX();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getSpatialOps <em>Spatial Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Ops</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getSpatialOps()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SpatialOps();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getBeyond <em>Beyond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Beyond</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getBeyond()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Beyond();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getComparisonOps <em>Comparison Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison Ops</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getComparisonOps()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ComparisonOps();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contains</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getContains()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Contains();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getCrosses <em>Crosses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Crosses</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getCrosses()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Crosses();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getDisjoint <em>Disjoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Disjoint</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getDisjoint()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Disjoint();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getDiv()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Div();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getDWithin <em>DWithin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DWithin</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getDWithin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DWithin();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getEID <em>EID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EID</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getEID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_EID();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getEquals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Equals</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getEquals()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Equals();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getFeatureId <em>Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Id</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getFeatureId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FeatureId();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getFID <em>FID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>FID</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getFID()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FID();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getFilter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getFilterCapabilities <em>Filter Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Capabilities</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getFilterCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FilterCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getFunction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Function();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getGmlObjectId <em>Gml Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gml Object Id</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getGmlObjectId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GmlObjectId();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getIntersects <em>Intersects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Intersects</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getIntersects()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Intersects();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getLiteral()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Literal();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getLogicalOperators <em>Logical Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical Operators</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getLogicalOperators()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LogicalOperators();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getMul <em>Mul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mul</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getMul()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mul();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getNot <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getNot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Not();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getOr <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Or</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getOr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Or();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getOverlaps <em>Overlaps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Overlaps</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getOverlaps()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Overlaps();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getPropertyIsBetween <em>Property Is Between</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Is Between</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getPropertyIsBetween()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyIsBetween();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getPropertyIsEqualTo <em>Property Is Equal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Is Equal To</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getPropertyIsEqualTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyIsEqualTo();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getPropertyIsGreaterThan <em>Property Is Greater Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Is Greater Than</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getPropertyIsGreaterThan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyIsGreaterThan();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getPropertyIsGreaterThanOrEqualTo <em>Property Is Greater Than Or Equal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Is Greater Than Or Equal To</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getPropertyIsGreaterThanOrEqualTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyIsGreaterThanOrEqualTo();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getPropertyIsLessThan <em>Property Is Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Is Less Than</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getPropertyIsLessThan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyIsLessThan();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getPropertyIsLessThanOrEqualTo <em>Property Is Less Than Or Equal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Is Less Than Or Equal To</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getPropertyIsLessThanOrEqualTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyIsLessThanOrEqualTo();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getPropertyIsLike <em>Property Is Like</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Is Like</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getPropertyIsLike()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyIsLike();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getPropertyIsNotEqualTo <em>Property Is Not Equal To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Is Not Equal To</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getPropertyIsNotEqualTo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyIsNotEqualTo();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getPropertyIsNull <em>Property Is Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Is Null</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getPropertyIsNull()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyIsNull();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getPropertyName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getSimpleArithmetic <em>Simple Arithmetic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Simple Arithmetic</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getSimpleArithmetic()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SimpleArithmetic();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getSortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort By</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getSortBy()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SortBy();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getSub()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sub();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getTouches <em>Touches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Touches</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getTouches()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Touches();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.DocumentRoot#getWithin <em>Within</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Within</em>'.
	 * @see net.opengis.ogc.DocumentRoot#getWithin()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Within();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.EIDType <em>EID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EID Type</em>'.
	 * @see net.opengis.ogc.EIDType
	 * @generated
	 */
	EClass getEIDType();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Type</em>'.
	 * @see net.opengis.ogc.ExpressionType
	 * @generated
	 */
	EClass getExpressionType();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.FeatureIdType <em>Feature Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Id Type</em>'.
	 * @see net.opengis.ogc.FeatureIdType
	 * @generated
	 */
	EClass getFeatureIdType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.FeatureIdType#getFid <em>Fid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fid</em>'.
	 * @see net.opengis.ogc.FeatureIdType#getFid()
	 * @see #getFeatureIdType()
	 * @generated
	 */
	EAttribute getFeatureIdType_Fid();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.FIDType <em>FID Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FID Type</em>'.
	 * @see net.opengis.ogc.FIDType
	 * @generated
	 */
	EClass getFIDType();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.FilterCapabilitiesType <em>Filter Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Capabilities Type</em>'.
	 * @see net.opengis.ogc.FilterCapabilitiesType
	 * @generated
	 */
	EClass getFilterCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.FilterCapabilitiesType#getSpatialCapabilities <em>Spatial Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Capabilities</em>'.
	 * @see net.opengis.ogc.FilterCapabilitiesType#getSpatialCapabilities()
	 * @see #getFilterCapabilitiesType()
	 * @generated
	 */
	EReference getFilterCapabilitiesType_SpatialCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.FilterCapabilitiesType#getScalarCapabilities <em>Scalar Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scalar Capabilities</em>'.
	 * @see net.opengis.ogc.FilterCapabilitiesType#getScalarCapabilities()
	 * @see #getFilterCapabilitiesType()
	 * @generated
	 */
	EReference getFilterCapabilitiesType_ScalarCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.FilterCapabilitiesType#getIdCapabilities <em>Id Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id Capabilities</em>'.
	 * @see net.opengis.ogc.FilterCapabilitiesType#getIdCapabilities()
	 * @see #getFilterCapabilitiesType()
	 * @generated
	 */
	EReference getFilterCapabilitiesType_IdCapabilities();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.FilterType <em>Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Type</em>'.
	 * @see net.opengis.ogc.FilterType
	 * @generated
	 */
	EClass getFilterType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.FilterType#getSpatialOpsGroup <em>Spatial Ops Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Spatial Ops Group</em>'.
	 * @see net.opengis.ogc.FilterType#getSpatialOpsGroup()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_SpatialOpsGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.FilterType#getSpatialOps <em>Spatial Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Ops</em>'.
	 * @see net.opengis.ogc.FilterType#getSpatialOps()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_SpatialOps();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.FilterType#getComparisonOpsGroup <em>Comparison Ops Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comparison Ops Group</em>'.
	 * @see net.opengis.ogc.FilterType#getComparisonOpsGroup()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_ComparisonOpsGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.FilterType#getComparisonOps <em>Comparison Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison Ops</em>'.
	 * @see net.opengis.ogc.FilterType#getComparisonOps()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_ComparisonOps();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.FilterType#getLogicOpsGroup <em>Logic Ops Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Logic Ops Group</em>'.
	 * @see net.opengis.ogc.FilterType#getLogicOpsGroup()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_LogicOpsGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.FilterType#getLogicOps <em>Logic Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logic Ops</em>'.
	 * @see net.opengis.ogc.FilterType#getLogicOps()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_LogicOps();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.FilterType#getIdGroup <em>Id Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Id Group</em>'.
	 * @see net.opengis.ogc.FilterType#getIdGroup()
	 * @see #getFilterType()
	 * @generated
	 */
	EAttribute getFilterType_IdGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.FilterType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Id</em>'.
	 * @see net.opengis.ogc.FilterType#getId()
	 * @see #getFilterType()
	 * @generated
	 */
	EReference getFilterType_Id();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.FunctionNamesType <em>Function Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Names Type</em>'.
	 * @see net.opengis.ogc.FunctionNamesType
	 * @generated
	 */
	EClass getFunctionNamesType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.FunctionNamesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.ogc.FunctionNamesType#getGroup()
	 * @see #getFunctionNamesType()
	 * @generated
	 */
	EAttribute getFunctionNamesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.FunctionNamesType#getFunctionName <em>Function Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Name</em>'.
	 * @see net.opengis.ogc.FunctionNamesType#getFunctionName()
	 * @see #getFunctionNamesType()
	 * @generated
	 */
	EReference getFunctionNamesType_FunctionName();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.FunctionNameType <em>Function Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Name Type</em>'.
	 * @see net.opengis.ogc.FunctionNameType
	 * @generated
	 */
	EClass getFunctionNameType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.FunctionNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.ogc.FunctionNameType#getValue()
	 * @see #getFunctionNameType()
	 * @generated
	 */
	EAttribute getFunctionNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.FunctionNameType#getNArgs <em>NArgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>NArgs</em>'.
	 * @see net.opengis.ogc.FunctionNameType#getNArgs()
	 * @see #getFunctionNameType()
	 * @generated
	 */
	EAttribute getFunctionNameType_NArgs();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.FunctionsType <em>Functions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functions Type</em>'.
	 * @see net.opengis.ogc.FunctionsType
	 * @generated
	 */
	EClass getFunctionsType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.FunctionsType#getFunctionNames <em>Function Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function Names</em>'.
	 * @see net.opengis.ogc.FunctionsType#getFunctionNames()
	 * @see #getFunctionsType()
	 * @generated
	 */
	EReference getFunctionsType_FunctionNames();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see net.opengis.ogc.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.FunctionType#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see net.opengis.ogc.FunctionType#getExpressionGroup()
	 * @see #getFunctionType()
	 * @generated
	 */
	EAttribute getFunctionType_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.FunctionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expression</em>'.
	 * @see net.opengis.ogc.FunctionType#getExpression()
	 * @see #getFunctionType()
	 * @generated
	 */
	EReference getFunctionType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.FunctionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.ogc.FunctionType#getName()
	 * @see #getFunctionType()
	 * @generated
	 */
	EAttribute getFunctionType_Name();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.GeometryOperandsType <em>Geometry Operands Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geometry Operands Type</em>'.
	 * @see net.opengis.ogc.GeometryOperandsType
	 * @generated
	 */
	EClass getGeometryOperandsType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.GeometryOperandsType#getGeometryOperand <em>Geometry Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Geometry Operand</em>'.
	 * @see net.opengis.ogc.GeometryOperandsType#getGeometryOperand()
	 * @see #getGeometryOperandsType()
	 * @generated
	 */
	EAttribute getGeometryOperandsType_GeometryOperand();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.GmlObjectIdType <em>Gml Object Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gml Object Id Type</em>'.
	 * @see net.opengis.ogc.GmlObjectIdType
	 * @generated
	 */
	EClass getGmlObjectIdType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.GmlObjectIdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.opengis.ogc.GmlObjectIdType#getId()
	 * @see #getGmlObjectIdType()
	 * @generated
	 */
	EAttribute getGmlObjectIdType_Id();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.IdCapabilitiesType <em>Id Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Capabilities Type</em>'.
	 * @see net.opengis.ogc.IdCapabilitiesType
	 * @generated
	 */
	EClass getIdCapabilitiesType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.IdCapabilitiesType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.ogc.IdCapabilitiesType#getGroup()
	 * @see #getIdCapabilitiesType()
	 * @generated
	 */
	EAttribute getIdCapabilitiesType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.IdCapabilitiesType#getEID <em>EID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EID</em>'.
	 * @see net.opengis.ogc.IdCapabilitiesType#getEID()
	 * @see #getIdCapabilitiesType()
	 * @generated
	 */
	EReference getIdCapabilitiesType_EID();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.IdCapabilitiesType#getFID <em>FID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>FID</em>'.
	 * @see net.opengis.ogc.IdCapabilitiesType#getFID()
	 * @see #getIdCapabilitiesType()
	 * @generated
	 */
	EReference getIdCapabilitiesType_FID();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Type</em>'.
	 * @see net.opengis.ogc.LiteralType
	 * @generated
	 */
	EClass getLiteralType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.LiteralType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.ogc.LiteralType#getMixed()
	 * @see #getLiteralType()
	 * @generated
	 */
	EAttribute getLiteralType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.LiteralType#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see net.opengis.ogc.LiteralType#getAny()
	 * @see #getLiteralType()
	 * @generated
	 */
	EAttribute getLiteralType_Any();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.LogicalOperatorsType <em>Logical Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Operators Type</em>'.
	 * @see net.opengis.ogc.LogicalOperatorsType
	 * @generated
	 */
	EClass getLogicalOperatorsType();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.LogicOpsType <em>Logic Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logic Ops Type</em>'.
	 * @see net.opengis.ogc.LogicOpsType
	 * @generated
	 */
	EClass getLogicOpsType();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.LowerBoundaryType <em>Lower Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Boundary Type</em>'.
	 * @see net.opengis.ogc.LowerBoundaryType
	 * @generated
	 */
	EClass getLowerBoundaryType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.LowerBoundaryType#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see net.opengis.ogc.LowerBoundaryType#getExpressionGroup()
	 * @see #getLowerBoundaryType()
	 * @generated
	 */
	EAttribute getLowerBoundaryType_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.LowerBoundaryType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.opengis.ogc.LowerBoundaryType#getExpression()
	 * @see #getLowerBoundaryType()
	 * @generated
	 */
	EReference getLowerBoundaryType_Expression();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.PropertyIsBetweenType <em>Property Is Between Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Is Between Type</em>'.
	 * @see net.opengis.ogc.PropertyIsBetweenType
	 * @generated
	 */
	EClass getPropertyIsBetweenType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.PropertyIsBetweenType#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see net.opengis.ogc.PropertyIsBetweenType#getExpressionGroup()
	 * @see #getPropertyIsBetweenType()
	 * @generated
	 */
	EAttribute getPropertyIsBetweenType_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.PropertyIsBetweenType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.opengis.ogc.PropertyIsBetweenType#getExpression()
	 * @see #getPropertyIsBetweenType()
	 * @generated
	 */
	EReference getPropertyIsBetweenType_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.PropertyIsBetweenType#getLowerBoundary <em>Lower Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lower Boundary</em>'.
	 * @see net.opengis.ogc.PropertyIsBetweenType#getLowerBoundary()
	 * @see #getPropertyIsBetweenType()
	 * @generated
	 */
	EReference getPropertyIsBetweenType_LowerBoundary();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.PropertyIsBetweenType#getUpperBoundary <em>Upper Boundary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Upper Boundary</em>'.
	 * @see net.opengis.ogc.PropertyIsBetweenType#getUpperBoundary()
	 * @see #getPropertyIsBetweenType()
	 * @generated
	 */
	EReference getPropertyIsBetweenType_UpperBoundary();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.PropertyIsLikeType <em>Property Is Like Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Is Like Type</em>'.
	 * @see net.opengis.ogc.PropertyIsLikeType
	 * @generated
	 */
	EClass getPropertyIsLikeType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.PropertyIsLikeType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name</em>'.
	 * @see net.opengis.ogc.PropertyIsLikeType#getPropertyName()
	 * @see #getPropertyIsLikeType()
	 * @generated
	 */
	EReference getPropertyIsLikeType_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.PropertyIsLikeType#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see net.opengis.ogc.PropertyIsLikeType#getLiteral()
	 * @see #getPropertyIsLikeType()
	 * @generated
	 */
	EReference getPropertyIsLikeType_Literal();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.PropertyIsLikeType#getEscapeChar <em>Escape Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Escape Char</em>'.
	 * @see net.opengis.ogc.PropertyIsLikeType#getEscapeChar()
	 * @see #getPropertyIsLikeType()
	 * @generated
	 */
	EAttribute getPropertyIsLikeType_EscapeChar();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.PropertyIsLikeType#isMatchCase <em>Match Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match Case</em>'.
	 * @see net.opengis.ogc.PropertyIsLikeType#isMatchCase()
	 * @see #getPropertyIsLikeType()
	 * @generated
	 */
	EAttribute getPropertyIsLikeType_MatchCase();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.PropertyIsLikeType#getSingleChar <em>Single Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Single Char</em>'.
	 * @see net.opengis.ogc.PropertyIsLikeType#getSingleChar()
	 * @see #getPropertyIsLikeType()
	 * @generated
	 */
	EAttribute getPropertyIsLikeType_SingleChar();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.PropertyIsLikeType#getWildCard <em>Wild Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wild Card</em>'.
	 * @see net.opengis.ogc.PropertyIsLikeType#getWildCard()
	 * @see #getPropertyIsLikeType()
	 * @generated
	 */
	EAttribute getPropertyIsLikeType_WildCard();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.PropertyIsNullType <em>Property Is Null Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Is Null Type</em>'.
	 * @see net.opengis.ogc.PropertyIsNullType
	 * @generated
	 */
	EClass getPropertyIsNullType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.PropertyIsNullType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name</em>'.
	 * @see net.opengis.ogc.PropertyIsNullType#getPropertyName()
	 * @see #getPropertyIsNullType()
	 * @generated
	 */
	EReference getPropertyIsNullType_PropertyName();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.PropertyNameType <em>Property Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Name Type</em>'.
	 * @see net.opengis.ogc.PropertyNameType
	 * @generated
	 */
	EClass getPropertyNameType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.PropertyNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.ogc.PropertyNameType#getMixed()
	 * @see #getPropertyNameType()
	 * @generated
	 */
	EAttribute getPropertyNameType_Mixed();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.ScalarCapabilitiesType <em>Scalar Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scalar Capabilities Type</em>'.
	 * @see net.opengis.ogc.ScalarCapabilitiesType
	 * @generated
	 */
	EClass getScalarCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.ScalarCapabilitiesType#getLogicalOperators <em>Logical Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logical Operators</em>'.
	 * @see net.opengis.ogc.ScalarCapabilitiesType#getLogicalOperators()
	 * @see #getScalarCapabilitiesType()
	 * @generated
	 */
	EReference getScalarCapabilitiesType_LogicalOperators();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.ScalarCapabilitiesType#getComparisonOperators <em>Comparison Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison Operators</em>'.
	 * @see net.opengis.ogc.ScalarCapabilitiesType#getComparisonOperators()
	 * @see #getScalarCapabilitiesType()
	 * @generated
	 */
	EReference getScalarCapabilitiesType_ComparisonOperators();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.ScalarCapabilitiesType#getArithmeticOperators <em>Arithmetic Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arithmetic Operators</em>'.
	 * @see net.opengis.ogc.ScalarCapabilitiesType#getArithmeticOperators()
	 * @see #getScalarCapabilitiesType()
	 * @generated
	 */
	EReference getScalarCapabilitiesType_ArithmeticOperators();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.SimpleArithmeticType <em>Simple Arithmetic Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Arithmetic Type</em>'.
	 * @see net.opengis.ogc.SimpleArithmeticType
	 * @generated
	 */
	EClass getSimpleArithmeticType();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.SortByType <em>Sort By Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort By Type</em>'.
	 * @see net.opengis.ogc.SortByType
	 * @generated
	 */
	EClass getSortByType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.SortByType#getSortProperty <em>Sort Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sort Property</em>'.
	 * @see net.opengis.ogc.SortByType#getSortProperty()
	 * @see #getSortByType()
	 * @generated
	 */
	EReference getSortByType_SortProperty();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.SortPropertyType <em>Sort Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Property Type</em>'.
	 * @see net.opengis.ogc.SortPropertyType
	 * @generated
	 */
	EClass getSortPropertyType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.SortPropertyType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Name</em>'.
	 * @see net.opengis.ogc.SortPropertyType#getPropertyName()
	 * @see #getSortPropertyType()
	 * @generated
	 */
	EReference getSortPropertyType_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.SortPropertyType#getSortOrder <em>Sort Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort Order</em>'.
	 * @see net.opengis.ogc.SortPropertyType#getSortOrder()
	 * @see #getSortPropertyType()
	 * @generated
	 */
	EAttribute getSortPropertyType_SortOrder();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.SpatialCapabilitiesType <em>Spatial Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Capabilities Type</em>'.
	 * @see net.opengis.ogc.SpatialCapabilitiesType
	 * @generated
	 */
	EClass getSpatialCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.SpatialCapabilitiesType#getGeometryOperands <em>Geometry Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry Operands</em>'.
	 * @see net.opengis.ogc.SpatialCapabilitiesType#getGeometryOperands()
	 * @see #getSpatialCapabilitiesType()
	 * @generated
	 */
	EReference getSpatialCapabilitiesType_GeometryOperands();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.SpatialCapabilitiesType#getSpatialOperators <em>Spatial Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Operators</em>'.
	 * @see net.opengis.ogc.SpatialCapabilitiesType#getSpatialOperators()
	 * @see #getSpatialCapabilitiesType()
	 * @generated
	 */
	EReference getSpatialCapabilitiesType_SpatialOperators();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.SpatialOperatorsType <em>Spatial Operators Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Operators Type</em>'.
	 * @see net.opengis.ogc.SpatialOperatorsType
	 * @generated
	 */
	EClass getSpatialOperatorsType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.ogc.SpatialOperatorsType#getSpatialOperator <em>Spatial Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spatial Operator</em>'.
	 * @see net.opengis.ogc.SpatialOperatorsType#getSpatialOperator()
	 * @see #getSpatialOperatorsType()
	 * @generated
	 */
	EReference getSpatialOperatorsType_SpatialOperator();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.SpatialOperatorType <em>Spatial Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Operator Type</em>'.
	 * @see net.opengis.ogc.SpatialOperatorType
	 * @generated
	 */
	EClass getSpatialOperatorType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.SpatialOperatorType#getGeometryOperands <em>Geometry Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Geometry Operands</em>'.
	 * @see net.opengis.ogc.SpatialOperatorType#getGeometryOperands()
	 * @see #getSpatialOperatorType()
	 * @generated
	 */
	EReference getSpatialOperatorType_GeometryOperands();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.ogc.SpatialOperatorType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.ogc.SpatialOperatorType#getName()
	 * @see #getSpatialOperatorType()
	 * @generated
	 */
	EAttribute getSpatialOperatorType_Name();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.SpatialOpsType <em>Spatial Ops Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Ops Type</em>'.
	 * @see net.opengis.ogc.SpatialOpsType
	 * @generated
	 */
	EClass getSpatialOpsType();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.UnaryLogicOpType <em>Unary Logic Op Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Logic Op Type</em>'.
	 * @see net.opengis.ogc.UnaryLogicOpType
	 * @generated
	 */
	EClass getUnaryLogicOpType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.UnaryLogicOpType#getComparisonOpsGroup <em>Comparison Ops Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Comparison Ops Group</em>'.
	 * @see net.opengis.ogc.UnaryLogicOpType#getComparisonOpsGroup()
	 * @see #getUnaryLogicOpType()
	 * @generated
	 */
	EAttribute getUnaryLogicOpType_ComparisonOpsGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.UnaryLogicOpType#getComparisonOps <em>Comparison Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparison Ops</em>'.
	 * @see net.opengis.ogc.UnaryLogicOpType#getComparisonOps()
	 * @see #getUnaryLogicOpType()
	 * @generated
	 */
	EReference getUnaryLogicOpType_ComparisonOps();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.UnaryLogicOpType#getSpatialOpsGroup <em>Spatial Ops Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Spatial Ops Group</em>'.
	 * @see net.opengis.ogc.UnaryLogicOpType#getSpatialOpsGroup()
	 * @see #getUnaryLogicOpType()
	 * @generated
	 */
	EAttribute getUnaryLogicOpType_SpatialOpsGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.UnaryLogicOpType#getSpatialOps <em>Spatial Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Spatial Ops</em>'.
	 * @see net.opengis.ogc.UnaryLogicOpType#getSpatialOps()
	 * @see #getUnaryLogicOpType()
	 * @generated
	 */
	EReference getUnaryLogicOpType_SpatialOps();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.UnaryLogicOpType#getLogicOpsGroup <em>Logic Ops Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Logic Ops Group</em>'.
	 * @see net.opengis.ogc.UnaryLogicOpType#getLogicOpsGroup()
	 * @see #getUnaryLogicOpType()
	 * @generated
	 */
	EAttribute getUnaryLogicOpType_LogicOpsGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.UnaryLogicOpType#getLogicOps <em>Logic Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Logic Ops</em>'.
	 * @see net.opengis.ogc.UnaryLogicOpType#getLogicOps()
	 * @see #getUnaryLogicOpType()
	 * @generated
	 */
	EReference getUnaryLogicOpType_LogicOps();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.UnaryLogicOpType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see net.opengis.ogc.UnaryLogicOpType#getFunction()
	 * @see #getUnaryLogicOpType()
	 * @generated
	 */
	EReference getUnaryLogicOpType_Function();

	/**
	 * Returns the meta object for class '{@link net.opengis.ogc.UpperBoundaryType <em>Upper Boundary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Boundary Type</em>'.
	 * @see net.opengis.ogc.UpperBoundaryType
	 * @generated
	 */
	EClass getUpperBoundaryType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.ogc.UpperBoundaryType#getExpressionGroup <em>Expression Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression Group</em>'.
	 * @see net.opengis.ogc.UpperBoundaryType#getExpressionGroup()
	 * @see #getUpperBoundaryType()
	 * @generated
	 */
	EAttribute getUpperBoundaryType_ExpressionGroup();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.ogc.UpperBoundaryType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see net.opengis.ogc.UpperBoundaryType#getExpression()
	 * @see #getUpperBoundaryType()
	 * @generated
	 */
	EReference getUpperBoundaryType_Expression();

	/**
	 * Returns the meta object for enum '{@link net.opengis.ogc.ComparisonOperatorType <em>Comparison Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator Type</em>'.
	 * @see net.opengis.ogc.ComparisonOperatorType
	 * @generated
	 */
	EEnum getComparisonOperatorType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.ogc.SortOrderType <em>Sort Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Sort Order Type</em>'.
	 * @see net.opengis.ogc.SortOrderType
	 * @generated
	 */
	EEnum getSortOrderType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.ogc.SpatialOperatorNameType <em>Spatial Operator Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spatial Operator Name Type</em>'.
	 * @see net.opengis.ogc.SpatialOperatorNameType
	 * @generated
	 */
	EEnum getSpatialOperatorNameType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.ogc.ComparisonOperatorType <em>Comparison Operator Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comparison Operator Type Object</em>'.
	 * @see net.opengis.ogc.ComparisonOperatorType
	 * @model instanceClass="net.opengis.ogc.ComparisonOperatorType"
	 *        extendedMetaData="name='ComparisonOperatorType:Object' baseType='ComparisonOperatorType'"
	 * @generated
	 */
	EDataType getComparisonOperatorTypeObject();

	/**
	 * Returns the meta object for data type '{@link javax.xml.namespace.QName <em>Geometry Operand Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Geometry Operand Type</em>'.
	 * @see javax.xml.namespace.QName
	 * @model instanceClass="javax.xml.namespace.QName"
	 *        extendedMetaData="name='GeometryOperandType' baseType='http://www.eclipse.org/emf/2003/XMLType#QName' enumeration='{http://www.opengis.net/gml}Envelope {http://www.opengis.net/gml}Point {http://www.opengis.net/gml}LineString {http://www.opengis.net/gml}Polygon {http://www.opengis.net/gml}ArcByCenterPoint {http://www.opengis.net/gml}CircleByCenterPoint {http://www.opengis.net/gml}Arc {http://www.opengis.net/gml}Circle {http://www.opengis.net/gml}ArcByBulge {http://www.opengis.net/gml}Bezier {http://www.opengis.net/gml}Clothoid {http://www.opengis.net/gml}CubicSpline {http://www.opengis.net/gml}Geodesic {http://www.opengis.net/gml}OffsetCurve {http://www.opengis.net/gml}Triangle {http://www.opengis.net/gml}PolyhedralSurface {http://www.opengis.net/gml}TriangulatedSurface {http://www.opengis.net/gml}Tin {http://www.opengis.net/gml}Solid'"
	 * @generated
	 */
	EDataType getGeometryOperandType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.ogc.SortOrderType <em>Sort Order Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sort Order Type Object</em>'.
	 * @see net.opengis.ogc.SortOrderType
	 * @model instanceClass="net.opengis.ogc.SortOrderType"
	 *        extendedMetaData="name='SortOrderType:Object' baseType='SortOrderType'"
	 * @generated
	 */
	EDataType getSortOrderTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.ogc.SpatialOperatorNameType <em>Spatial Operator Name Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Spatial Operator Name Type Object</em>'.
	 * @see net.opengis.ogc.SpatialOperatorNameType
	 * @model instanceClass="net.opengis.ogc.SpatialOperatorNameType"
	 *        extendedMetaData="name='SpatialOperatorNameType:Object' baseType='SpatialOperatorNameType'"
	 * @generated
	 */
	EDataType getSpatialOperatorNameTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OGCFactory getOGCFactory();

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
		 * The meta object literal for the '{@link net.opengis.ogc.impl.AbstractIdTypeImpl <em>Abstract Id Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.AbstractIdTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getAbstractIdType()
		 * @generated
		 */
		EClass ABSTRACT_ID_TYPE = eINSTANCE.getAbstractIdType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.ArithmeticOperatorsTypeImpl <em>Arithmetic Operators Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.ArithmeticOperatorsTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getArithmeticOperatorsType()
		 * @generated
		 */
		EClass ARITHMETIC_OPERATORS_TYPE = eINSTANCE.getArithmeticOperatorsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_OPERATORS_TYPE__GROUP = eINSTANCE.getArithmeticOperatorsType_Group();

		/**
		 * The meta object literal for the '<em><b>Simple Arithmetic</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_OPERATORS_TYPE__SIMPLE_ARITHMETIC = eINSTANCE.getArithmeticOperatorsType_SimpleArithmetic();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_OPERATORS_TYPE__FUNCTIONS = eINSTANCE.getArithmeticOperatorsType_Functions();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.BBOXTypeImpl <em>BBOX Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.BBOXTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getBBOXType()
		 * @generated
		 */
		EClass BBOX_TYPE = eINSTANCE.getBBOXType();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBOX_TYPE__PROPERTY_NAME = eINSTANCE.getBBOXType_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Envelope Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BBOX_TYPE__ENVELOPE_GROUP = eINSTANCE.getBBOXType_EnvelopeGroup();

		/**
		 * The meta object literal for the '<em><b>Envelope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBOX_TYPE__ENVELOPE = eINSTANCE.getBBOXType_Envelope();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.BinaryComparisonOpTypeImpl <em>Binary Comparison Op Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.BinaryComparisonOpTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getBinaryComparisonOpType()
		 * @generated
		 */
		EClass BINARY_COMPARISON_OP_TYPE = eINSTANCE.getBinaryComparisonOpType();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COMPARISON_OP_TYPE__EXPRESSION_GROUP = eINSTANCE.getBinaryComparisonOpType_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_COMPARISON_OP_TYPE__EXPRESSION = eINSTANCE.getBinaryComparisonOpType_Expression();

		/**
		 * The meta object literal for the '<em><b>Match Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_COMPARISON_OP_TYPE__MATCH_CASE = eINSTANCE.getBinaryComparisonOpType_MatchCase();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.BinaryLogicOpTypeImpl <em>Binary Logic Op Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.BinaryLogicOpTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getBinaryLogicOpType()
		 * @generated
		 */
		EClass BINARY_LOGIC_OP_TYPE = eINSTANCE.getBinaryLogicOpType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_LOGIC_OP_TYPE__GROUP = eINSTANCE.getBinaryLogicOpType_Group();

		/**
		 * The meta object literal for the '<em><b>Comparison Ops Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP = eINSTANCE.getBinaryLogicOpType_ComparisonOpsGroup();

		/**
		 * The meta object literal for the '<em><b>Comparison Ops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_LOGIC_OP_TYPE__COMPARISON_OPS = eINSTANCE.getBinaryLogicOpType_ComparisonOps();

		/**
		 * The meta object literal for the '<em><b>Spatial Ops Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP = eINSTANCE.getBinaryLogicOpType_SpatialOpsGroup();

		/**
		 * The meta object literal for the '<em><b>Spatial Ops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_LOGIC_OP_TYPE__SPATIAL_OPS = eINSTANCE.getBinaryLogicOpType_SpatialOps();

		/**
		 * The meta object literal for the '<em><b>Logic Ops Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP = eINSTANCE.getBinaryLogicOpType_LogicOpsGroup();

		/**
		 * The meta object literal for the '<em><b>Logic Ops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_LOGIC_OP_TYPE__LOGIC_OPS = eINSTANCE.getBinaryLogicOpType_LogicOps();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_LOGIC_OP_TYPE__FUNCTION = eINSTANCE.getBinaryLogicOpType_Function();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.BinaryOperatorTypeImpl <em>Binary Operator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.BinaryOperatorTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getBinaryOperatorType()
		 * @generated
		 */
		EClass BINARY_OPERATOR_TYPE = eINSTANCE.getBinaryOperatorType();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_OPERATOR_TYPE__EXPRESSION_GROUP = eINSTANCE.getBinaryOperatorType_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR_TYPE__EXPRESSION = eINSTANCE.getBinaryOperatorType_Expression();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.BinarySpatialOpTypeImpl <em>Binary Spatial Op Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.BinarySpatialOpTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getBinarySpatialOpType()
		 * @generated
		 */
		EClass BINARY_SPATIAL_OP_TYPE = eINSTANCE.getBinarySpatialOpType();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME = eINSTANCE.getBinarySpatialOpType_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Name1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_SPATIAL_OP_TYPE__PROPERTY_NAME1 = eINSTANCE.getBinarySpatialOpType_PropertyName1();

		/**
		 * The meta object literal for the '<em><b>Geometry Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_SPATIAL_OP_TYPE__GEOMETRY_GROUP = eINSTANCE.getBinarySpatialOpType_GeometryGroup();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_SPATIAL_OP_TYPE__GEOMETRY = eINSTANCE.getBinarySpatialOpType_Geometry();

		/**
		 * The meta object literal for the '<em><b>Envelope Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_SPATIAL_OP_TYPE__ENVELOPE_GROUP = eINSTANCE.getBinarySpatialOpType_EnvelopeGroup();

		/**
		 * The meta object literal for the '<em><b>Envelope</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_SPATIAL_OP_TYPE__ENVELOPE = eINSTANCE.getBinarySpatialOpType_Envelope();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.ComparisonOperatorsTypeImpl <em>Comparison Operators Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.ComparisonOperatorsTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getComparisonOperatorsType()
		 * @generated
		 */
		EClass COMPARISON_OPERATORS_TYPE = eINSTANCE.getComparisonOperatorsType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_OPERATORS_TYPE__GROUP = eINSTANCE.getComparisonOperatorsType_Group();

		/**
		 * The meta object literal for the '<em><b>Comparison Operator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_OPERATORS_TYPE__COMPARISON_OPERATOR = eINSTANCE.getComparisonOperatorsType_ComparisonOperator();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.ComparisonOpsTypeImpl <em>Comparison Ops Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.ComparisonOpsTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getComparisonOpsType()
		 * @generated
		 */
		EClass COMPARISON_OPS_TYPE = eINSTANCE.getComparisonOpsType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.DistanceBufferTypeImpl <em>Distance Buffer Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.DistanceBufferTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getDistanceBufferType()
		 * @generated
		 */
		EClass DISTANCE_BUFFER_TYPE = eINSTANCE.getDistanceBufferType();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE_BUFFER_TYPE__PROPERTY_NAME = eINSTANCE.getDistanceBufferType_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Geometry Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_BUFFER_TYPE__GEOMETRY_GROUP = eINSTANCE.getDistanceBufferType_GeometryGroup();

		/**
		 * The meta object literal for the '<em><b>Geometry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE_BUFFER_TYPE__GEOMETRY = eINSTANCE.getDistanceBufferType_Geometry();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTANCE_BUFFER_TYPE__DISTANCE = eINSTANCE.getDistanceBufferType_Distance();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.DistanceTypeImpl <em>Distance Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.DistanceTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getDistanceType()
		 * @generated
		 */
		EClass DISTANCE_TYPE = eINSTANCE.getDistanceType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_TYPE__VALUE = eINSTANCE.getDistanceType_Value();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISTANCE_TYPE__UNITS = eINSTANCE.getDistanceType_Units();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.DocumentRootImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ID = eINSTANCE.getDocumentRoot_Id();

		/**
		 * The meta object literal for the '<em><b>Add</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADD = eINSTANCE.getDocumentRoot_Add();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EXPRESSION = eINSTANCE.getDocumentRoot_Expression();

		/**
		 * The meta object literal for the '<em><b>And</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AND = eINSTANCE.getDocumentRoot_And();

		/**
		 * The meta object literal for the '<em><b>Logic Ops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOGIC_OPS = eINSTANCE.getDocumentRoot_LogicOps();

		/**
		 * The meta object literal for the '<em><b>BBOX</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BBOX = eINSTANCE.getDocumentRoot_BBOX();

		/**
		 * The meta object literal for the '<em><b>Spatial Ops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPATIAL_OPS = eINSTANCE.getDocumentRoot_SpatialOps();

		/**
		 * The meta object literal for the '<em><b>Beyond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BEYOND = eINSTANCE.getDocumentRoot_Beyond();

		/**
		 * The meta object literal for the '<em><b>Comparison Ops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COMPARISON_OPS = eINSTANCE.getDocumentRoot_ComparisonOps();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONTAINS = eINSTANCE.getDocumentRoot_Contains();

		/**
		 * The meta object literal for the '<em><b>Crosses</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CROSSES = eINSTANCE.getDocumentRoot_Crosses();

		/**
		 * The meta object literal for the '<em><b>Disjoint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DISJOINT = eINSTANCE.getDocumentRoot_Disjoint();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIV = eINSTANCE.getDocumentRoot_Div();

		/**
		 * The meta object literal for the '<em><b>DWithin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DWITHIN = eINSTANCE.getDocumentRoot_DWithin();

		/**
		 * The meta object literal for the '<em><b>EID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EID = eINSTANCE.getDocumentRoot_EID();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EQUALS = eINSTANCE.getDocumentRoot_Equals();

		/**
		 * The meta object literal for the '<em><b>Feature Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE_ID = eINSTANCE.getDocumentRoot_FeatureId();

		/**
		 * The meta object literal for the '<em><b>FID</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FID = eINSTANCE.getDocumentRoot_FID();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILTER = eINSTANCE.getDocumentRoot_Filter();

		/**
		 * The meta object literal for the '<em><b>Filter Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FILTER_CAPABILITIES = eINSTANCE.getDocumentRoot_FilterCapabilities();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FUNCTION = eINSTANCE.getDocumentRoot_Function();

		/**
		 * The meta object literal for the '<em><b>Gml Object Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GML_OBJECT_ID = eINSTANCE.getDocumentRoot_GmlObjectId();

		/**
		 * The meta object literal for the '<em><b>Intersects</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INTERSECTS = eINSTANCE.getDocumentRoot_Intersects();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LITERAL = eINSTANCE.getDocumentRoot_Literal();

		/**
		 * The meta object literal for the '<em><b>Logical Operators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOGICAL_OPERATORS = eINSTANCE.getDocumentRoot_LogicalOperators();

		/**
		 * The meta object literal for the '<em><b>Mul</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MUL = eINSTANCE.getDocumentRoot_Mul();

		/**
		 * The meta object literal for the '<em><b>Not</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOT = eINSTANCE.getDocumentRoot_Not();

		/**
		 * The meta object literal for the '<em><b>Or</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OR = eINSTANCE.getDocumentRoot_Or();

		/**
		 * The meta object literal for the '<em><b>Overlaps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OVERLAPS = eINSTANCE.getDocumentRoot_Overlaps();

		/**
		 * The meta object literal for the '<em><b>Property Is Between</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_IS_BETWEEN = eINSTANCE.getDocumentRoot_PropertyIsBetween();

		/**
		 * The meta object literal for the '<em><b>Property Is Equal To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_IS_EQUAL_TO = eINSTANCE.getDocumentRoot_PropertyIsEqualTo();

		/**
		 * The meta object literal for the '<em><b>Property Is Greater Than</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN = eINSTANCE.getDocumentRoot_PropertyIsGreaterThan();

		/**
		 * The meta object literal for the '<em><b>Property Is Greater Than Or Equal To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_IS_GREATER_THAN_OR_EQUAL_TO = eINSTANCE.getDocumentRoot_PropertyIsGreaterThanOrEqualTo();

		/**
		 * The meta object literal for the '<em><b>Property Is Less Than</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN = eINSTANCE.getDocumentRoot_PropertyIsLessThan();

		/**
		 * The meta object literal for the '<em><b>Property Is Less Than Or Equal To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_IS_LESS_THAN_OR_EQUAL_TO = eINSTANCE.getDocumentRoot_PropertyIsLessThanOrEqualTo();

		/**
		 * The meta object literal for the '<em><b>Property Is Like</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_IS_LIKE = eINSTANCE.getDocumentRoot_PropertyIsLike();

		/**
		 * The meta object literal for the '<em><b>Property Is Not Equal To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_IS_NOT_EQUAL_TO = eINSTANCE.getDocumentRoot_PropertyIsNotEqualTo();

		/**
		 * The meta object literal for the '<em><b>Property Is Null</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_IS_NULL = eINSTANCE.getDocumentRoot_PropertyIsNull();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY_NAME = eINSTANCE.getDocumentRoot_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Simple Arithmetic</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SIMPLE_ARITHMETIC = eINSTANCE.getDocumentRoot_SimpleArithmetic();

		/**
		 * The meta object literal for the '<em><b>Sort By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SORT_BY = eINSTANCE.getDocumentRoot_SortBy();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUB = eINSTANCE.getDocumentRoot_Sub();

		/**
		 * The meta object literal for the '<em><b>Touches</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TOUCHES = eINSTANCE.getDocumentRoot_Touches();

		/**
		 * The meta object literal for the '<em><b>Within</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WITHIN = eINSTANCE.getDocumentRoot_Within();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.EIDTypeImpl <em>EID Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.EIDTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getEIDType()
		 * @generated
		 */
		EClass EID_TYPE = eINSTANCE.getEIDType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.ExpressionTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getExpressionType()
		 * @generated
		 */
		EClass EXPRESSION_TYPE = eINSTANCE.getExpressionType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.FeatureIdTypeImpl <em>Feature Id Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.FeatureIdTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getFeatureIdType()
		 * @generated
		 */
		EClass FEATURE_ID_TYPE = eINSTANCE.getFeatureIdType();

		/**
		 * The meta object literal for the '<em><b>Fid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_ID_TYPE__FID = eINSTANCE.getFeatureIdType_Fid();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.FIDTypeImpl <em>FID Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.FIDTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getFIDType()
		 * @generated
		 */
		EClass FID_TYPE = eINSTANCE.getFIDType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.FilterCapabilitiesTypeImpl <em>Filter Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.FilterCapabilitiesTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getFilterCapabilitiesType()
		 * @generated
		 */
		EClass FILTER_CAPABILITIES_TYPE = eINSTANCE.getFilterCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Spatial Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_CAPABILITIES_TYPE__SPATIAL_CAPABILITIES = eINSTANCE.getFilterCapabilitiesType_SpatialCapabilities();

		/**
		 * The meta object literal for the '<em><b>Scalar Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_CAPABILITIES_TYPE__SCALAR_CAPABILITIES = eINSTANCE.getFilterCapabilitiesType_ScalarCapabilities();

		/**
		 * The meta object literal for the '<em><b>Id Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_CAPABILITIES_TYPE__ID_CAPABILITIES = eINSTANCE.getFilterCapabilitiesType_IdCapabilities();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.FilterTypeImpl <em>Filter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.FilterTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getFilterType()
		 * @generated
		 */
		EClass FILTER_TYPE = eINSTANCE.getFilterType();

		/**
		 * The meta object literal for the '<em><b>Spatial Ops Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_TYPE__SPATIAL_OPS_GROUP = eINSTANCE.getFilterType_SpatialOpsGroup();

		/**
		 * The meta object literal for the '<em><b>Spatial Ops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__SPATIAL_OPS = eINSTANCE.getFilterType_SpatialOps();

		/**
		 * The meta object literal for the '<em><b>Comparison Ops Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_TYPE__COMPARISON_OPS_GROUP = eINSTANCE.getFilterType_ComparisonOpsGroup();

		/**
		 * The meta object literal for the '<em><b>Comparison Ops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__COMPARISON_OPS = eINSTANCE.getFilterType_ComparisonOps();

		/**
		 * The meta object literal for the '<em><b>Logic Ops Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_TYPE__LOGIC_OPS_GROUP = eINSTANCE.getFilterType_LogicOpsGroup();

		/**
		 * The meta object literal for the '<em><b>Logic Ops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__LOGIC_OPS = eINSTANCE.getFilterType_LogicOps();

		/**
		 * The meta object literal for the '<em><b>Id Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER_TYPE__ID_GROUP = eINSTANCE.getFilterType_IdGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_TYPE__ID = eINSTANCE.getFilterType_Id();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.FunctionNamesTypeImpl <em>Function Names Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.FunctionNamesTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getFunctionNamesType()
		 * @generated
		 */
		EClass FUNCTION_NAMES_TYPE = eINSTANCE.getFunctionNamesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_NAMES_TYPE__GROUP = eINSTANCE.getFunctionNamesType_Group();

		/**
		 * The meta object literal for the '<em><b>Function Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_NAMES_TYPE__FUNCTION_NAME = eINSTANCE.getFunctionNamesType_FunctionName();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.FunctionNameTypeImpl <em>Function Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.FunctionNameTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getFunctionNameType()
		 * @generated
		 */
		EClass FUNCTION_NAME_TYPE = eINSTANCE.getFunctionNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_NAME_TYPE__VALUE = eINSTANCE.getFunctionNameType_Value();

		/**
		 * The meta object literal for the '<em><b>NArgs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_NAME_TYPE__NARGS = eINSTANCE.getFunctionNameType_NArgs();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.FunctionsTypeImpl <em>Functions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.FunctionsTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getFunctionsType()
		 * @generated
		 */
		EClass FUNCTIONS_TYPE = eINSTANCE.getFunctionsType();

		/**
		 * The meta object literal for the '<em><b>Function Names</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONS_TYPE__FUNCTION_NAMES = eINSTANCE.getFunctionsType_FunctionNames();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.FunctionTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_TYPE__EXPRESSION_GROUP = eINSTANCE.getFunctionType_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_TYPE__EXPRESSION = eINSTANCE.getFunctionType_Expression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_TYPE__NAME = eINSTANCE.getFunctionType_Name();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.GeometryOperandsTypeImpl <em>Geometry Operands Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.GeometryOperandsTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getGeometryOperandsType()
		 * @generated
		 */
		EClass GEOMETRY_OPERANDS_TYPE = eINSTANCE.getGeometryOperandsType();

		/**
		 * The meta object literal for the '<em><b>Geometry Operand</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEOMETRY_OPERANDS_TYPE__GEOMETRY_OPERAND = eINSTANCE.getGeometryOperandsType_GeometryOperand();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.GmlObjectIdTypeImpl <em>Gml Object Id Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.GmlObjectIdTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getGmlObjectIdType()
		 * @generated
		 */
		EClass GML_OBJECT_ID_TYPE = eINSTANCE.getGmlObjectIdType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_OBJECT_ID_TYPE__ID = eINSTANCE.getGmlObjectIdType_Id();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.IdCapabilitiesTypeImpl <em>Id Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.IdCapabilitiesTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getIdCapabilitiesType()
		 * @generated
		 */
		EClass ID_CAPABILITIES_TYPE = eINSTANCE.getIdCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_CAPABILITIES_TYPE__GROUP = eINSTANCE.getIdCapabilitiesType_Group();

		/**
		 * The meta object literal for the '<em><b>EID</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_CAPABILITIES_TYPE__EID = eINSTANCE.getIdCapabilitiesType_EID();

		/**
		 * The meta object literal for the '<em><b>FID</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_CAPABILITIES_TYPE__FID = eINSTANCE.getIdCapabilitiesType_FID();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.LiteralTypeImpl <em>Literal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.LiteralTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getLiteralType()
		 * @generated
		 */
		EClass LITERAL_TYPE = eINSTANCE.getLiteralType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_TYPE__MIXED = eINSTANCE.getLiteralType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_TYPE__ANY = eINSTANCE.getLiteralType_Any();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.LogicalOperatorsTypeImpl <em>Logical Operators Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.LogicalOperatorsTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getLogicalOperatorsType()
		 * @generated
		 */
		EClass LOGICAL_OPERATORS_TYPE = eINSTANCE.getLogicalOperatorsType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.LogicOpsTypeImpl <em>Logic Ops Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.LogicOpsTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getLogicOpsType()
		 * @generated
		 */
		EClass LOGIC_OPS_TYPE = eINSTANCE.getLogicOpsType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.LowerBoundaryTypeImpl <em>Lower Boundary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.LowerBoundaryTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getLowerBoundaryType()
		 * @generated
		 */
		EClass LOWER_BOUNDARY_TYPE = eINSTANCE.getLowerBoundaryType();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOWER_BOUNDARY_TYPE__EXPRESSION_GROUP = eINSTANCE.getLowerBoundaryType_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOWER_BOUNDARY_TYPE__EXPRESSION = eINSTANCE.getLowerBoundaryType_Expression();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.PropertyIsBetweenTypeImpl <em>Property Is Between Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.PropertyIsBetweenTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getPropertyIsBetweenType()
		 * @generated
		 */
		EClass PROPERTY_IS_BETWEEN_TYPE = eINSTANCE.getPropertyIsBetweenType();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_IS_BETWEEN_TYPE__EXPRESSION_GROUP = eINSTANCE.getPropertyIsBetweenType_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_IS_BETWEEN_TYPE__EXPRESSION = eINSTANCE.getPropertyIsBetweenType_Expression();

		/**
		 * The meta object literal for the '<em><b>Lower Boundary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_IS_BETWEEN_TYPE__LOWER_BOUNDARY = eINSTANCE.getPropertyIsBetweenType_LowerBoundary();

		/**
		 * The meta object literal for the '<em><b>Upper Boundary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_IS_BETWEEN_TYPE__UPPER_BOUNDARY = eINSTANCE.getPropertyIsBetweenType_UpperBoundary();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.PropertyIsLikeTypeImpl <em>Property Is Like Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.PropertyIsLikeTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getPropertyIsLikeType()
		 * @generated
		 */
		EClass PROPERTY_IS_LIKE_TYPE = eINSTANCE.getPropertyIsLikeType();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_IS_LIKE_TYPE__PROPERTY_NAME = eINSTANCE.getPropertyIsLikeType_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_IS_LIKE_TYPE__LITERAL = eINSTANCE.getPropertyIsLikeType_Literal();

		/**
		 * The meta object literal for the '<em><b>Escape Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_IS_LIKE_TYPE__ESCAPE_CHAR = eINSTANCE.getPropertyIsLikeType_EscapeChar();

		/**
		 * The meta object literal for the '<em><b>Match Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_IS_LIKE_TYPE__MATCH_CASE = eINSTANCE.getPropertyIsLikeType_MatchCase();

		/**
		 * The meta object literal for the '<em><b>Single Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_IS_LIKE_TYPE__SINGLE_CHAR = eINSTANCE.getPropertyIsLikeType_SingleChar();

		/**
		 * The meta object literal for the '<em><b>Wild Card</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_IS_LIKE_TYPE__WILD_CARD = eINSTANCE.getPropertyIsLikeType_WildCard();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.PropertyIsNullTypeImpl <em>Property Is Null Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.PropertyIsNullTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getPropertyIsNullType()
		 * @generated
		 */
		EClass PROPERTY_IS_NULL_TYPE = eINSTANCE.getPropertyIsNullType();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_IS_NULL_TYPE__PROPERTY_NAME = eINSTANCE.getPropertyIsNullType_PropertyName();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.PropertyNameTypeImpl <em>Property Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.PropertyNameTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getPropertyNameType()
		 * @generated
		 */
		EClass PROPERTY_NAME_TYPE = eINSTANCE.getPropertyNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_NAME_TYPE__MIXED = eINSTANCE.getPropertyNameType_Mixed();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.ScalarCapabilitiesTypeImpl <em>Scalar Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.ScalarCapabilitiesTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getScalarCapabilitiesType()
		 * @generated
		 */
		EClass SCALAR_CAPABILITIES_TYPE = eINSTANCE.getScalarCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Logical Operators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR_CAPABILITIES_TYPE__LOGICAL_OPERATORS = eINSTANCE.getScalarCapabilitiesType_LogicalOperators();

		/**
		 * The meta object literal for the '<em><b>Comparison Operators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR_CAPABILITIES_TYPE__COMPARISON_OPERATORS = eINSTANCE.getScalarCapabilitiesType_ComparisonOperators();

		/**
		 * The meta object literal for the '<em><b>Arithmetic Operators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCALAR_CAPABILITIES_TYPE__ARITHMETIC_OPERATORS = eINSTANCE.getScalarCapabilitiesType_ArithmeticOperators();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.SimpleArithmeticTypeImpl <em>Simple Arithmetic Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.SimpleArithmeticTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSimpleArithmeticType()
		 * @generated
		 */
		EClass SIMPLE_ARITHMETIC_TYPE = eINSTANCE.getSimpleArithmeticType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.SortByTypeImpl <em>Sort By Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.SortByTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSortByType()
		 * @generated
		 */
		EClass SORT_BY_TYPE = eINSTANCE.getSortByType();

		/**
		 * The meta object literal for the '<em><b>Sort Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT_BY_TYPE__SORT_PROPERTY = eINSTANCE.getSortByType_SortProperty();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.SortPropertyTypeImpl <em>Sort Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.SortPropertyTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSortPropertyType()
		 * @generated
		 */
		EClass SORT_PROPERTY_TYPE = eINSTANCE.getSortPropertyType();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT_PROPERTY_TYPE__PROPERTY_NAME = eINSTANCE.getSortPropertyType_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Sort Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_PROPERTY_TYPE__SORT_ORDER = eINSTANCE.getSortPropertyType_SortOrder();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.SpatialCapabilitiesTypeImpl <em>Spatial Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.SpatialCapabilitiesTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialCapabilitiesType()
		 * @generated
		 */
		EClass SPATIAL_CAPABILITIES_TYPE = eINSTANCE.getSpatialCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Geometry Operands</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_CAPABILITIES_TYPE__GEOMETRY_OPERANDS = eINSTANCE.getSpatialCapabilitiesType_GeometryOperands();

		/**
		 * The meta object literal for the '<em><b>Spatial Operators</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_CAPABILITIES_TYPE__SPATIAL_OPERATORS = eINSTANCE.getSpatialCapabilitiesType_SpatialOperators();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.SpatialOperatorsTypeImpl <em>Spatial Operators Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.SpatialOperatorsTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialOperatorsType()
		 * @generated
		 */
		EClass SPATIAL_OPERATORS_TYPE = eINSTANCE.getSpatialOperatorsType();

		/**
		 * The meta object literal for the '<em><b>Spatial Operator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_OPERATORS_TYPE__SPATIAL_OPERATOR = eINSTANCE.getSpatialOperatorsType_SpatialOperator();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.SpatialOperatorTypeImpl <em>Spatial Operator Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.SpatialOperatorTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialOperatorType()
		 * @generated
		 */
		EClass SPATIAL_OPERATOR_TYPE = eINSTANCE.getSpatialOperatorType();

		/**
		 * The meta object literal for the '<em><b>Geometry Operands</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPATIAL_OPERATOR_TYPE__GEOMETRY_OPERANDS = eINSTANCE.getSpatialOperatorType_GeometryOperands();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_OPERATOR_TYPE__NAME = eINSTANCE.getSpatialOperatorType_Name();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.SpatialOpsTypeImpl <em>Spatial Ops Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.SpatialOpsTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialOpsType()
		 * @generated
		 */
		EClass SPATIAL_OPS_TYPE = eINSTANCE.getSpatialOpsType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.UnaryLogicOpTypeImpl <em>Unary Logic Op Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.UnaryLogicOpTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getUnaryLogicOpType()
		 * @generated
		 */
		EClass UNARY_LOGIC_OP_TYPE = eINSTANCE.getUnaryLogicOpType();

		/**
		 * The meta object literal for the '<em><b>Comparison Ops Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_LOGIC_OP_TYPE__COMPARISON_OPS_GROUP = eINSTANCE.getUnaryLogicOpType_ComparisonOpsGroup();

		/**
		 * The meta object literal for the '<em><b>Comparison Ops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_LOGIC_OP_TYPE__COMPARISON_OPS = eINSTANCE.getUnaryLogicOpType_ComparisonOps();

		/**
		 * The meta object literal for the '<em><b>Spatial Ops Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_LOGIC_OP_TYPE__SPATIAL_OPS_GROUP = eINSTANCE.getUnaryLogicOpType_SpatialOpsGroup();

		/**
		 * The meta object literal for the '<em><b>Spatial Ops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_LOGIC_OP_TYPE__SPATIAL_OPS = eINSTANCE.getUnaryLogicOpType_SpatialOps();

		/**
		 * The meta object literal for the '<em><b>Logic Ops Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_LOGIC_OP_TYPE__LOGIC_OPS_GROUP = eINSTANCE.getUnaryLogicOpType_LogicOpsGroup();

		/**
		 * The meta object literal for the '<em><b>Logic Ops</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_LOGIC_OP_TYPE__LOGIC_OPS = eINSTANCE.getUnaryLogicOpType_LogicOps();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_LOGIC_OP_TYPE__FUNCTION = eINSTANCE.getUnaryLogicOpType_Function();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.impl.UpperBoundaryTypeImpl <em>Upper Boundary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.impl.UpperBoundaryTypeImpl
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getUpperBoundaryType()
		 * @generated
		 */
		EClass UPPER_BOUNDARY_TYPE = eINSTANCE.getUpperBoundaryType();

		/**
		 * The meta object literal for the '<em><b>Expression Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPPER_BOUNDARY_TYPE__EXPRESSION_GROUP = eINSTANCE.getUpperBoundaryType_ExpressionGroup();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPPER_BOUNDARY_TYPE__EXPRESSION = eINSTANCE.getUpperBoundaryType_Expression();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.ComparisonOperatorType <em>Comparison Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.ComparisonOperatorType
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getComparisonOperatorType()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR_TYPE = eINSTANCE.getComparisonOperatorType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.SortOrderType <em>Sort Order Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.SortOrderType
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSortOrderType()
		 * @generated
		 */
		EEnum SORT_ORDER_TYPE = eINSTANCE.getSortOrderType();

		/**
		 * The meta object literal for the '{@link net.opengis.ogc.SpatialOperatorNameType <em>Spatial Operator Name Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.SpatialOperatorNameType
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialOperatorNameType()
		 * @generated
		 */
		EEnum SPATIAL_OPERATOR_NAME_TYPE = eINSTANCE.getSpatialOperatorNameType();

		/**
		 * The meta object literal for the '<em>Comparison Operator Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.ComparisonOperatorType
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getComparisonOperatorTypeObject()
		 * @generated
		 */
		EDataType COMPARISON_OPERATOR_TYPE_OBJECT = eINSTANCE.getComparisonOperatorTypeObject();

		/**
		 * The meta object literal for the '<em>Geometry Operand Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.namespace.QName
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getGeometryOperandType()
		 * @generated
		 */
		EDataType GEOMETRY_OPERAND_TYPE = eINSTANCE.getGeometryOperandType();

		/**
		 * The meta object literal for the '<em>Sort Order Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.SortOrderType
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSortOrderTypeObject()
		 * @generated
		 */
		EDataType SORT_ORDER_TYPE_OBJECT = eINSTANCE.getSortOrderTypeObject();

		/**
		 * The meta object literal for the '<em>Spatial Operator Name Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.ogc.SpatialOperatorNameType
		 * @see net.opengis.ogc.impl.OGCPackageImpl#getSpatialOperatorNameTypeObject()
		 * @generated
		 */
		EDataType SPATIAL_OPERATOR_NAME_TYPE_OBJECT = eINSTANCE.getSpatialOperatorNameTypeObject();

	}

} //OGCPackage
