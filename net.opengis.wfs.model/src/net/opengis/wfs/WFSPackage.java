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
package net.opengis.wfs;


import net.opengis.gml.GMLPackage;

import net.opengis.ows.OWSPackage;

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
 * This XML Schema Document includes and imports, directly and indirectly, all the XML Schemas defined by the OWS Common Implemetation Specification.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document defines the GetCapabilities operation request and response XML elements and types, which are common to all OWSs. This XML Schema shall be edited by each OWS, for example, to specify a specific value for the "service" attribute.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the Exception Report response to all OWS operations.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the common "ServiceIdentification" section of the GetCapabilities operation response, known as the Capabilities XML document. This section encodes the SV_ServiceIdentification class of ISO 19119 (OGC Abstract Specification Topic 12).
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the common "ServiceProvider" section of the GetCapabilities operation response, known as the Capabilities XML document. This section encodes the SV_ServiceProvider class of ISO 19119 (OGC Abstract Specification Topic 12).
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the basic contents of the "OperationsMetadata" section of the GetCapabilities operation response, also known as the Capabilities XML document.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes various parameters and parameter types that can be used in OWS operation requests and responses.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
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
 * This XML Schema Document encodes the parts of ISO 19115 used by the common "ServiceIdentification" and "ServiceProvider" sections of the GetCapabilities operation response, known as the service metadata XML document. The parts encoded here are the MD_Keywords, CI_ResponsibleParty, and related classes. This XML Schema largely follows the current draft for ISO 19139, with the addition of documentation text extracted and edited from Annex B of ISO 19115. The UML package prefixes were omitted from XML names, and the XML element names were all capitalized, for consistency with other OWS Schemas. Also, the optional smXML:id attributes were omitted, as not being useful in a service metadata document.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
 * This XML Schema Document encodes the parts of the MD_DataIdentification class of ISO 19115 (OGC Abstract Specification Topic 11) which are expected to be used for most datasets. This Schema also encodes the parts of this class that are expected to be useful for other metadata. Both are expected to be used within the Contents section of OWS service metadata (Capabilities) documents.
 * 		
 * 		OWS is an OGC Standard.
 * 		Copyright (c) 2005,2010 Open Geospatial Consortium.
 * 		To obtain additional rights of use, visit http://www.opengeospatial.org/legal/ .
 * 		
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
 * <!-- end-model-doc -->
 * @see net.opengis.wfs.WFSFactory
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
@EPackage(uri = WFSPackage.eNS_URI, genModel = "/model/wfs.genmodel", genModelSourceLocations = {"model/wfs.genmodel","net.opengis.wfs.model/model/wfs.genmodel"}, ecore="/model/wfs.ecore", ecoreSourceLocations="/model/wfs.ecore")
public interface WFSPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wfs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.opengis.net/wfs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "wfs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WFSPackage eINSTANCE = net.opengis.wfs.impl.WFSPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.ActionTypeImpl <em>Action Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.ActionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getActionType()
	 * @generated
	 */
	int ACTION_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Locator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE__LOCATOR = 2;

	/**
	 * The number of structural features of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.BaseRequestTypeImpl <em>Base Request Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.BaseRequestTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getBaseRequestType()
	 * @generated
	 */
	int BASE_REQUEST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REQUEST_TYPE__HANDLE = 0;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REQUEST_TYPE__SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REQUEST_TYPE__VERSION = 2;

	/**
	 * The number of structural features of the '<em>Base Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REQUEST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Base Request Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_REQUEST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.DeleteElementTypeImpl <em>Delete Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.DeleteElementTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getDeleteElementType()
	 * @generated
	 */
	int DELETE_ELEMENT_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ELEMENT_TYPE__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ELEMENT_TYPE__HANDLE = 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ELEMENT_TYPE__TYPE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Delete Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ELEMENT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Delete Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELETE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.DescribeFeatureTypeTypeImpl <em>Describe Feature Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.DescribeFeatureTypeTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getDescribeFeatureTypeType()
	 * @generated
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE__TYPE_NAME = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE__OUTPUT_FORMAT = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Describe Feature Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Describe Feature Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBE_FEATURE_TYPE_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.DocumentRootImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 4;

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
	 * The feature id for the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DELETE = 3;

	/**
	 * The feature id for the '<em><b>Describe Feature Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Feature Collection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE_COLLECTION = 5;

	/**
	 * The feature id for the '<em><b>Feature Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FEATURE_TYPE_LIST = 6;

	/**
	 * The feature id for the '<em><b>Get Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_CAPABILITIES = 7;

	/**
	 * The feature id for the '<em><b>Get Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_FEATURE = 8;

	/**
	 * The feature id for the '<em><b>Get Feature With Lock</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK = 9;

	/**
	 * The feature id for the '<em><b>Get Gml Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GET_GML_OBJECT = 10;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INSERT = 11;

	/**
	 * The feature id for the '<em><b>Lock Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCK_FEATURE = 12;

	/**
	 * The feature id for the '<em><b>Lock Feature Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE = 13;

	/**
	 * The feature id for the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LOCK_ID = 14;

	/**
	 * The feature id for the '<em><b>Native</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NATIVE = 15;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY = 16;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROPERTY_NAME = 17;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__QUERY = 18;

	/**
	 * The feature id for the '<em><b>Serves GML Object Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST = 19;

	/**
	 * The feature id for the '<em><b>Supports GML Object Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST = 20;

	/**
	 * The feature id for the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION = 21;

	/**
	 * The feature id for the '<em><b>Transaction Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSACTION_RESPONSE = 22;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UPDATE = 23;

	/**
	 * The feature id for the '<em><b>WFS Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WFS_CAPABILITIES = 24;

	/**
	 * The feature id for the '<em><b>Xlink Property Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XLINK_PROPERTY_NAME = 25;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 26;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.FeatureCollectionTypeImpl <em>Feature Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.FeatureCollectionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureCollectionType()
	 * @generated
	 */
	int FEATURE_COLLECTION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Meta Data Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__META_DATA_PROPERTY = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__META_DATA_PROPERTY;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__DESCRIPTION = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__NAME_GROUP = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__NAME_GROUP;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__NAME = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__ID = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__ID;

	/**
	 * The feature id for the '<em><b>Bounded By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__BOUNDED_BY = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__BOUNDED_BY;

	/**
	 * The feature id for the '<em><b>Location Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__LOCATION_GROUP = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__LOCATION_GROUP;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__LOCATION = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__LOCATION;

	/**
	 * The feature id for the '<em><b>Feature Member</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__FEATURE_MEMBER = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBER;

	/**
	 * The feature id for the '<em><b>Feature Members</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE__FEATURE_MEMBERS;

	/**
	 * The feature id for the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__LOCK_ID = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number Of Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__NUMBER_OF_FEATURES = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Time Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE__TIME_STAMP = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Feature Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE_FEATURE_COUNT = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Feature Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_COLLECTION_TYPE_OPERATION_COUNT = GMLPackage.ABSTRACT_FEATURE_COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.FeaturesLockedTypeImpl <em>Features Locked Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.FeaturesLockedTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeaturesLockedType()
	 * @generated
	 */
	int FEATURES_LOCKED_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_LOCKED_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Feature Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_LOCKED_TYPE__FEATURE_ID = 1;

	/**
	 * The number of structural features of the '<em>Features Locked Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_LOCKED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Features Locked Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_LOCKED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.FeaturesNotLockedTypeImpl <em>Features Not Locked Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.FeaturesNotLockedTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeaturesNotLockedType()
	 * @generated
	 */
	int FEATURES_NOT_LOCKED_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_NOT_LOCKED_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Feature Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_NOT_LOCKED_TYPE__FEATURE_ID = 1;

	/**
	 * The number of structural features of the '<em>Features Not Locked Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_NOT_LOCKED_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Features Not Locked Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURES_NOT_LOCKED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.FeatureTypeListTypeImpl <em>Feature Type List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.FeatureTypeListTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureTypeListType()
	 * @generated
	 */
	int FEATURE_TYPE_LIST_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_LIST_TYPE__OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Feature Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_LIST_TYPE__FEATURE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Feature Type List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feature Type List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.FeatureTypeTypeImpl <em>Feature Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.FeatureTypeTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureTypeType()
	 * @generated
	 */
	int FEATURE_TYPE_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__KEYWORDS = 3;

	/**
	 * The feature id for the '<em><b>Default SRS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__DEFAULT_SRS = 4;

	/**
	 * The feature id for the '<em><b>Other SRS</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__OTHER_SRS = 5;

	/**
	 * The feature id for the '<em><b>No SRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__NO_SRS = 6;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__OPERATIONS = 7;

	/**
	 * The feature id for the '<em><b>Output Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__OUTPUT_FORMATS = 8;

	/**
	 * The feature id for the '<em><b>WGS84 Bounding Box</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__WGS84_BOUNDING_BOX = 9;

	/**
	 * The feature id for the '<em><b>Metadata URL</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE__METADATA_URL = 10;

	/**
	 * The number of structural features of the '<em>Feature Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Feature Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.GetCapabilitiesTypeImpl <em>Get Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.GetCapabilitiesTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetCapabilitiesType()
	 * @generated
	 */
	int GET_CAPABILITIES_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Accept Versions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__ACCEPT_VERSIONS = OWSPackage.GET_CAPABILITIES_TYPE__ACCEPT_VERSIONS;

	/**
	 * The feature id for the '<em><b>Sections</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__SECTIONS = OWSPackage.GET_CAPABILITIES_TYPE__SECTIONS;

	/**
	 * The feature id for the '<em><b>Accept Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__ACCEPT_FORMATS = OWSPackage.GET_CAPABILITIES_TYPE__ACCEPT_FORMATS;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__UPDATE_SEQUENCE = OWSPackage.GET_CAPABILITIES_TYPE__UPDATE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE__SERVICE = OWSPackage.GET_CAPABILITIES_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Get Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE_FEATURE_COUNT = OWSPackage.GET_CAPABILITIES_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Get Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_CAPABILITIES_TYPE_OPERATION_COUNT = OWSPackage.GET_CAPABILITIES_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.GetFeatureTypeImpl <em>Get Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.GetFeatureTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetFeatureType()
	 * @generated
	 */
	int GET_FEATURE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__QUERY = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__MAX_FEATURES = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__OUTPUT_FORMAT = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__RESULT_TYPE = BASE_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Traverse Xlink Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__TRAVERSE_XLINK_DEPTH = BASE_REQUEST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Traverse Xlink Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE__TRAVERSE_XLINK_EXPIRY = BASE_REQUEST_TYPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Get Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Get Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.GetFeatureWithLockTypeImpl <em>Get Feature With Lock Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.GetFeatureWithLockTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetFeatureWithLockType()
	 * @generated
	 */
	int GET_FEATURE_WITH_LOCK_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Query</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__QUERY = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__EXPIRY = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Features</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__MAX_FEATURES = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__OUTPUT_FORMAT = BASE_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Result Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__RESULT_TYPE = BASE_REQUEST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Traverse Xlink Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__TRAVERSE_XLINK_DEPTH = BASE_REQUEST_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Traverse Xlink Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE__TRAVERSE_XLINK_EXPIRY = BASE_REQUEST_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Get Feature With Lock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Get Feature With Lock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_FEATURE_WITH_LOCK_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.GetGmlObjectTypeImpl <em>Get Gml Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.GetGmlObjectTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetGmlObjectType()
	 * @generated
	 */
	int GET_GML_OBJECT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_GML_OBJECT_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_GML_OBJECT_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_GML_OBJECT_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Gml Object Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_GML_OBJECT_TYPE__GML_OBJECT_ID = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_GML_OBJECT_TYPE__OUTPUT_FORMAT = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Traverse Xlink Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_DEPTH = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Traverse Xlink Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_EXPIRY = BASE_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Get Gml Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_GML_OBJECT_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Get Gml Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_GML_OBJECT_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.GMLObjectTypeListTypeImpl <em>GML Object Type List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.GMLObjectTypeListTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getGMLObjectTypeListType()
	 * @generated
	 */
	int GML_OBJECT_TYPE_LIST_TYPE = 14;

	/**
	 * The feature id for the '<em><b>GML Object Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_TYPE_LIST_TYPE__GML_OBJECT_TYPE = 0;

	/**
	 * The number of structural features of the '<em>GML Object Type List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_TYPE_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>GML Object Type List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_TYPE_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.GMLObjectTypeTypeImpl <em>GML Object Type Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.GMLObjectTypeTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getGMLObjectTypeType()
	 * @generated
	 */
	int GML_OBJECT_TYPE_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_TYPE_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_TYPE_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_TYPE_TYPE__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Keywords</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_TYPE_TYPE__KEYWORDS = 3;

	/**
	 * The feature id for the '<em><b>Output Formats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_TYPE_TYPE__OUTPUT_FORMATS = 4;

	/**
	 * The number of structural features of the '<em>GML Object Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_TYPE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>GML Object Type Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GML_OBJECT_TYPE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.InsertedFeatureTypeImpl <em>Inserted Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.InsertedFeatureTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getInsertedFeatureType()
	 * @generated
	 */
	int INSERTED_FEATURE_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Feature Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_FEATURE_TYPE__FEATURE_ID = 0;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_FEATURE_TYPE__HANDLE = 1;

	/**
	 * The number of structural features of the '<em>Inserted Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_FEATURE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Inserted Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTED_FEATURE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.InsertElementTypeImpl <em>Insert Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.InsertElementTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getInsertElementType()
	 * @generated
	 */
	int INSERT_ELEMENT_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Feature Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_TYPE__FEATURE_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_TYPE__FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_TYPE__HANDLE = 2;

	/**
	 * The feature id for the '<em><b>Idgen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_TYPE__IDGEN = 3;

	/**
	 * The feature id for the '<em><b>Input Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_TYPE__INPUT_FORMAT = 4;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_TYPE__SRS_NAME = 5;

	/**
	 * The number of structural features of the '<em>Insert Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Insert Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.InsertResultsTypeImpl <em>Insert Results Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.InsertResultsTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getInsertResultsType()
	 * @generated
	 */
	int INSERT_RESULTS_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_RESULTS_TYPE__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Insert Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_RESULTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Insert Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_RESULTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.LockFeatureResponseTypeImpl <em>Lock Feature Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.LockFeatureResponseTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getLockFeatureResponseType()
	 * @generated
	 */
	int LOCK_FEATURE_RESPONSE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_RESPONSE_TYPE__LOCK_ID = 0;

	/**
	 * The feature id for the '<em><b>Features Locked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_RESPONSE_TYPE__FEATURES_LOCKED = 1;

	/**
	 * The feature id for the '<em><b>Features Not Locked</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_RESPONSE_TYPE__FEATURES_NOT_LOCKED = 2;

	/**
	 * The number of structural features of the '<em>Lock Feature Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_RESPONSE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lock Feature Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_RESPONSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.LockFeatureTypeImpl <em>Lock Feature Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.LockFeatureTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getLockFeatureType()
	 * @generated
	 */
	int LOCK_FEATURE_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Lock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__LOCK = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__EXPIRY = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lock Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE__LOCK_ACTION = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lock Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Lock Feature Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_FEATURE_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.LockTypeImpl <em>Lock Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.LockTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getLockType()
	 * @generated
	 */
	int LOCK_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TYPE__FILTER = 0;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TYPE__HANDLE = 1;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TYPE__TYPE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Lock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Lock Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.MetadataURLTypeImpl <em>Metadata URL Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.MetadataURLTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getMetadataURLType()
	 * @generated
	 */
	int METADATA_URL_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Metadata URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Metadata URL Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METADATA_URL_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.NativeTypeImpl <em>Native Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.NativeTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getNativeType()
	 * @generated
	 */
	int NATIVE_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Safe To Ignore</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__SAFE_TO_IGNORE = 0;

	/**
	 * The feature id for the '<em><b>Vendor Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE__VENDOR_ID = 1;

	/**
	 * The number of structural features of the '<em>Native Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Native Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NATIVE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.NoSRSTypeImpl <em>No SRS Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.NoSRSTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getNoSRSType()
	 * @generated
	 */
	int NO_SRS_TYPE = 24;

	/**
	 * The number of structural features of the '<em>No SRS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SRS_TYPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>No SRS Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_SRS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.OperationsTypeImpl <em>Operations Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.OperationsTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getOperationsType()
	 * @generated
	 */
	int OPERATIONS_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE__OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Operations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operations Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.OutputFormatListTypeImpl <em>Output Format List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.OutputFormatListTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getOutputFormatListType()
	 * @generated
	 */
	int OUTPUT_FORMAT_LIST_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT_LIST_TYPE__FORMAT = 1;

	/**
	 * The number of structural features of the '<em>Output Format List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT_LIST_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Output Format List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FORMAT_LIST_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.PropertyTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.QueryTypeImpl <em>Query Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.QueryTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getQueryType()
	 * @generated
	 */
	int QUERY_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__PROPERTY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Xlink Property Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__XLINK_PROPERTY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__FUNCTION = 3;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__FILTER = 4;

	/**
	 * The feature id for the '<em><b>Sort By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__SORT_BY = 5;

	/**
	 * The feature id for the '<em><b>Feature Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__FEATURE_VERSION = 6;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__HANDLE = 7;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__SRS_NAME = 8;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE__TYPE_NAME = 9;

	/**
	 * The number of structural features of the '<em>Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Query Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.TransactionResponseTypeImpl <em>Transaction Response Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.TransactionResponseTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionResponseType()
	 * @generated
	 */
	int TRANSACTION_RESPONSE_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Transaction Summary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY = 0;

	/**
	 * The feature id for the '<em><b>Transaction Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS = 1;

	/**
	 * The feature id for the '<em><b>Insert Results</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Transaction Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Transaction Response Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESPONSE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.TransactionResultsTypeImpl <em>Transaction Results Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.TransactionResultsTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionResultsType()
	 * @generated
	 */
	int TRANSACTION_RESULTS_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESULTS_TYPE__ACTION = 0;

	/**
	 * The number of structural features of the '<em>Transaction Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESULTS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Transaction Results Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_RESULTS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.TransactionSummaryTypeImpl <em>Transaction Summary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.TransactionSummaryTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionSummaryType()
	 * @generated
	 */
	int TRANSACTION_SUMMARY_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Total Inserted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE__TOTAL_INSERTED = 0;

	/**
	 * The feature id for the '<em><b>Total Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE__TOTAL_UPDATED = 1;

	/**
	 * The feature id for the '<em><b>Total Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE__TOTAL_DELETED = 2;

	/**
	 * The number of structural features of the '<em>Transaction Summary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transaction Summary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_SUMMARY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.TransactionTypeImpl <em>Transaction Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.TransactionTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionType()
	 * @generated
	 */
	int TRANSACTION_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__HANDLE = BASE_REQUEST_TYPE__HANDLE;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__SERVICE = BASE_REQUEST_TYPE__SERVICE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__VERSION = BASE_REQUEST_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Lock Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__LOCK_ID = BASE_REQUEST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__GROUP = BASE_REQUEST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__INSERT = BASE_REQUEST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Update</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__UPDATE = BASE_REQUEST_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__DELETE = BASE_REQUEST_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Native</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__NATIVE = BASE_REQUEST_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Release Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE__RELEASE_ACTION = BASE_REQUEST_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_FEATURE_COUNT = BASE_REQUEST_TYPE_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Transaction Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_TYPE_OPERATION_COUNT = BASE_REQUEST_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.UpdateElementTypeImpl <em>Update Element Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.UpdateElementTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getUpdateElementType()
	 * @generated
	 */
	int UPDATE_ELEMENT_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ELEMENT_TYPE__PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ELEMENT_TYPE__FILTER = 1;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ELEMENT_TYPE__HANDLE = 2;

	/**
	 * The feature id for the '<em><b>Input Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ELEMENT_TYPE__INPUT_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Srs Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ELEMENT_TYPE__SRS_NAME = 4;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ELEMENT_TYPE__TYPE_NAME = 5;

	/**
	 * The number of structural features of the '<em>Update Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ELEMENT_TYPE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Update Element Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_ELEMENT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.WFSCapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.WFSCapabilitiesTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getWFSCapabilitiesType()
	 * @generated
	 */
	int WFS_CAPABILITIES_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Service Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__SERVICE_IDENTIFICATION = OWSPackage.CAPABILITIES_BASE_TYPE__SERVICE_IDENTIFICATION;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__SERVICE_PROVIDER = OWSPackage.CAPABILITIES_BASE_TYPE__SERVICE_PROVIDER;

	/**
	 * The feature id for the '<em><b>Operations Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__OPERATIONS_METADATA = OWSPackage.CAPABILITIES_BASE_TYPE__OPERATIONS_METADATA;

	/**
	 * The feature id for the '<em><b>Update Sequence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__UPDATE_SEQUENCE = OWSPackage.CAPABILITIES_BASE_TYPE__UPDATE_SEQUENCE;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__VERSION = OWSPackage.CAPABILITIES_BASE_TYPE__VERSION;

	/**
	 * The feature id for the '<em><b>Feature Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST = OWSPackage.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Serves GML Object Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST = OWSPackage.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supports GML Object Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST = OWSPackage.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter Capabilities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES = OWSPackage.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE_FEATURE_COUNT = OWSPackage.CAPABILITIES_BASE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Capabilities Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WFS_CAPABILITIES_TYPE_OPERATION_COUNT = OWSPackage.CAPABILITIES_BASE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.impl.XlinkPropertyNameTypeImpl <em>Xlink Property Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.impl.XlinkPropertyNameTypeImpl
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getXlinkPropertyNameType()
	 * @generated
	 */
	int XLINK_PROPERTY_NAME_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_PROPERTY_NAME_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Traverse Xlink Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_PROPERTY_NAME_TYPE__TRAVERSE_XLINK_DEPTH = 1;

	/**
	 * The feature id for the '<em><b>Traverse Xlink Expiry</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_PROPERTY_NAME_TYPE__TRAVERSE_XLINK_EXPIRY = 2;

	/**
	 * The number of structural features of the '<em>Xlink Property Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_PROPERTY_NAME_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Xlink Property Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_PROPERTY_NAME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.AllSomeType <em>All Some Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.AllSomeType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getAllSomeType()
	 * @generated
	 */
	int ALL_SOME_TYPE = 36;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.FormatType <em>Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.FormatType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFormatType()
	 * @generated
	 */
	int FORMAT_TYPE = 37;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.IdentifierGenerationOptionType <em>Identifier Generation Option Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.IdentifierGenerationOptionType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getIdentifierGenerationOptionType()
	 * @generated
	 */
	int IDENTIFIER_GENERATION_OPTION_TYPE = 38;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.OperationType <em>Operation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.OperationType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getOperationType()
	 * @generated
	 */
	int OPERATION_TYPE = 39;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.ResultTypeType <em>Result Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.ResultTypeType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getResultTypeType()
	 * @generated
	 */
	int RESULT_TYPE_TYPE = 40;

	/**
	 * The meta object id for the '{@link net.opengis.wfs.TypeType <em>Type Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.TypeType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTypeType()
	 * @generated
	 */
	int TYPE_TYPE = 41;

	/**
	 * The meta object id for the '<em>All Some Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.AllSomeType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getAllSomeTypeObject()
	 * @generated
	 */
	int ALL_SOME_TYPE_OBJECT = 42;

	/**
	 * The meta object id for the '<em>Base Type Name List Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getBaseTypeNameListType()
	 * @generated
	 */
	int BASE_TYPE_NAME_LIST_TYPE = 43;

	/**
	 * The meta object id for the '<em>Format Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.FormatType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getFormatTypeObject()
	 * @generated
	 */
	int FORMAT_TYPE_OBJECT = 44;

	/**
	 * The meta object id for the '<em>Identifier Generation Option Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.IdentifierGenerationOptionType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getIdentifierGenerationOptionTypeObject()
	 * @generated
	 */
	int IDENTIFIER_GENERATION_OPTION_TYPE_OBJECT = 45;

	/**
	 * The meta object id for the '<em>Operation Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.OperationType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getOperationTypeObject()
	 * @generated
	 */
	int OPERATION_TYPE_OBJECT = 46;

	/**
	 * The meta object id for the '<em>Result Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.ResultTypeType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getResultTypeTypeObject()
	 * @generated
	 */
	int RESULT_TYPE_TYPE_OBJECT = 47;

	/**
	 * The meta object id for the '<em>Type Name List Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTypeNameListType()
	 * @generated
	 */
	int TYPE_NAME_LIST_TYPE = 48;

	/**
	 * The meta object id for the '<em>Type Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.opengis.wfs.TypeType
	 * @see net.opengis.wfs.impl.WFSPackageImpl#getTypeTypeObject()
	 * @generated
	 */
	int TYPE_TYPE_OBJECT = 49;


	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.ActionType <em>Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Type</em>'.
	 * @see net.opengis.wfs.ActionType
	 * @generated
	 */
	EClass getActionType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ActionType#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see net.opengis.wfs.ActionType#getMessage()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Message();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ActionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see net.opengis.wfs.ActionType#getCode()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Code();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.ActionType#getLocator <em>Locator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locator</em>'.
	 * @see net.opengis.wfs.ActionType#getLocator()
	 * @see #getActionType()
	 * @generated
	 */
	EAttribute getActionType_Locator();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.BaseRequestType <em>Base Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Request Type</em>'.
	 * @see net.opengis.wfs.BaseRequestType
	 * @generated
	 */
	EClass getBaseRequestType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.BaseRequestType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see net.opengis.wfs.BaseRequestType#getHandle()
	 * @see #getBaseRequestType()
	 * @generated
	 */
	EAttribute getBaseRequestType_Handle();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.BaseRequestType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see net.opengis.wfs.BaseRequestType#getService()
	 * @see #getBaseRequestType()
	 * @generated
	 */
	EAttribute getBaseRequestType_Service();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.BaseRequestType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.opengis.wfs.BaseRequestType#getVersion()
	 * @see #getBaseRequestType()
	 * @generated
	 */
	EAttribute getBaseRequestType_Version();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.DeleteElementType <em>Delete Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delete Element Type</em>'.
	 * @see net.opengis.wfs.DeleteElementType
	 * @generated
	 */
	EClass getDeleteElementType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DeleteElementType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see net.opengis.wfs.DeleteElementType#getFilter()
	 * @see #getDeleteElementType()
	 * @generated
	 */
	EReference getDeleteElementType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.DeleteElementType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see net.opengis.wfs.DeleteElementType#getHandle()
	 * @see #getDeleteElementType()
	 * @generated
	 */
	EAttribute getDeleteElementType_Handle();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.DeleteElementType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see net.opengis.wfs.DeleteElementType#getTypeName()
	 * @see #getDeleteElementType()
	 * @generated
	 */
	EAttribute getDeleteElementType_TypeName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.DescribeFeatureTypeType <em>Describe Feature Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Describe Feature Type Type</em>'.
	 * @see net.opengis.wfs.DescribeFeatureTypeType
	 * @generated
	 */
	EClass getDescribeFeatureTypeType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.DescribeFeatureTypeType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type Name</em>'.
	 * @see net.opengis.wfs.DescribeFeatureTypeType#getTypeName()
	 * @see #getDescribeFeatureTypeType()
	 * @generated
	 */
	EAttribute getDescribeFeatureTypeType_TypeName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.DescribeFeatureTypeType#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Format</em>'.
	 * @see net.opengis.wfs.DescribeFeatureTypeType#getOutputFormat()
	 * @see #getDescribeFeatureTypeType()
	 * @generated
	 */
	EAttribute getDescribeFeatureTypeType_OutputFormat();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.opengis.wfs.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.opengis.wfs.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.opengis.wfs.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Delete</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getDelete()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Delete();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getDescribeFeatureType <em>Describe Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Describe Feature Type</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getDescribeFeatureType()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_DescribeFeatureType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getFeatureCollection <em>Feature Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Collection</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getFeatureCollection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FeatureCollection();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getFeatureTypeList <em>Feature Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Type List</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getFeatureTypeList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_FeatureTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getGetCapabilities <em>Get Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Capabilities</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getGetCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getGetFeature <em>Get Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Feature</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getGetFeature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetFeature();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getGetFeatureWithLock <em>Get Feature With Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Feature With Lock</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getGetFeatureWithLock()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetFeatureWithLock();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getGetGmlObject <em>Get Gml Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Get Gml Object</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getGetGmlObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_GetGmlObject();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getInsert()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Insert();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getLockFeature <em>Lock Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lock Feature</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getLockFeature()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LockFeature();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getLockFeatureResponse <em>Lock Feature Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lock Feature Response</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getLockFeatureResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_LockFeatureResponse();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.DocumentRoot#getLockId <em>Lock Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Id</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getLockId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_LockId();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Native</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getNative()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Native();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getProperty()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Property();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.DocumentRoot#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getPropertyName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PropertyName();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Query</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getQuery()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Query();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getServesGMLObjectTypeList <em>Serves GML Object Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serves GML Object Type List</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getServesGMLObjectTypeList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_ServesGMLObjectTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getSupportsGMLObjectTypeList <em>Supports GML Object Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supports GML Object Type List</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getSupportsGMLObjectTypeList()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_SupportsGMLObjectTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getTransaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getTransaction()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transaction();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getTransactionResponse <em>Transaction Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Response</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getTransactionResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_TransactionResponse();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Update</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getUpdate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Update();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getWFSCapabilities <em>WFS Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>WFS Capabilities</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getWFSCapabilities()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_WFSCapabilities();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.DocumentRoot#getXlinkPropertyName <em>Xlink Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xlink Property Name</em>'.
	 * @see net.opengis.wfs.DocumentRoot#getXlinkPropertyName()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XlinkPropertyName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.FeatureCollectionType <em>Feature Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Collection Type</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType
	 * @generated
	 */
	EClass getFeatureCollectionType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureCollectionType#getLockId <em>Lock Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Id</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getLockId()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EAttribute getFeatureCollectionType_LockId();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureCollectionType#getNumberOfFeatures <em>Number Of Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Features</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getNumberOfFeatures()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EAttribute getFeatureCollectionType_NumberOfFeatures();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureCollectionType#getTimeStamp <em>Time Stamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Stamp</em>'.
	 * @see net.opengis.wfs.FeatureCollectionType#getTimeStamp()
	 * @see #getFeatureCollectionType()
	 * @generated
	 */
	EAttribute getFeatureCollectionType_TimeStamp();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.FeaturesLockedType <em>Features Locked Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Locked Type</em>'.
	 * @see net.opengis.wfs.FeaturesLockedType
	 * @generated
	 */
	EClass getFeaturesLockedType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.FeaturesLockedType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.FeaturesLockedType#getGroup()
	 * @see #getFeaturesLockedType()
	 * @generated
	 */
	EAttribute getFeaturesLockedType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeaturesLockedType#getFeatureId <em>Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Id</em>'.
	 * @see net.opengis.wfs.FeaturesLockedType#getFeatureId()
	 * @see #getFeaturesLockedType()
	 * @generated
	 */
	EReference getFeaturesLockedType_FeatureId();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.FeaturesNotLockedType <em>Features Not Locked Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Features Not Locked Type</em>'.
	 * @see net.opengis.wfs.FeaturesNotLockedType
	 * @generated
	 */
	EClass getFeaturesNotLockedType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.FeaturesNotLockedType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.FeaturesNotLockedType#getGroup()
	 * @see #getFeaturesNotLockedType()
	 * @generated
	 */
	EAttribute getFeaturesNotLockedType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeaturesNotLockedType#getFeatureId <em>Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Id</em>'.
	 * @see net.opengis.wfs.FeaturesNotLockedType#getFeatureId()
	 * @see #getFeaturesNotLockedType()
	 * @generated
	 */
	EReference getFeaturesNotLockedType_FeatureId();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.FeatureTypeListType <em>Feature Type List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Type List Type</em>'.
	 * @see net.opengis.wfs.FeatureTypeListType
	 * @generated
	 */
	EClass getFeatureTypeListType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.FeatureTypeListType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operations</em>'.
	 * @see net.opengis.wfs.FeatureTypeListType#getOperations()
	 * @see #getFeatureTypeListType()
	 * @generated
	 */
	EReference getFeatureTypeListType_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeatureTypeListType#getFeatureType <em>Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Type</em>'.
	 * @see net.opengis.wfs.FeatureTypeListType#getFeatureType()
	 * @see #getFeatureTypeListType()
	 * @generated
	 */
	EReference getFeatureTypeListType_FeatureType();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.FeatureTypeType <em>Feature Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Type Type</em>'.
	 * @see net.opengis.wfs.FeatureTypeType
	 * @generated
	 */
	EClass getFeatureTypeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureTypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getName()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EAttribute getFeatureTypeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureTypeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getTitle()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EAttribute getFeatureTypeType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureTypeType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getAbstract()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EAttribute getFeatureTypeType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeatureTypeType#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keywords</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getKeywords()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_Keywords();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.FeatureTypeType#getDefaultSRS <em>Default SRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default SRS</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getDefaultSRS()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EAttribute getFeatureTypeType_DefaultSRS();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.FeatureTypeType#getOtherSRS <em>Other SRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other SRS</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getOtherSRS()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EAttribute getFeatureTypeType_OtherSRS();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.FeatureTypeType#getNoSRS <em>No SRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>No SRS</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getNoSRS()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_NoSRS();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.FeatureTypeType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operations</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getOperations()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_Operations();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.FeatureTypeType#getOutputFormats <em>Output Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Formats</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getOutputFormats()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_OutputFormats();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeatureTypeType#getWGS84BoundingBox <em>WGS84 Bounding Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>WGS84 Bounding Box</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getWGS84BoundingBox()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_WGS84BoundingBox();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.FeatureTypeType#getMetadataURL <em>Metadata URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Metadata URL</em>'.
	 * @see net.opengis.wfs.FeatureTypeType#getMetadataURL()
	 * @see #getFeatureTypeType()
	 * @generated
	 */
	EReference getFeatureTypeType_MetadataURL();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.GetCapabilitiesType <em>Get Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Capabilities Type</em>'.
	 * @see net.opengis.wfs.GetCapabilitiesType
	 * @generated
	 */
	EClass getGetCapabilitiesType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetCapabilitiesType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service</em>'.
	 * @see net.opengis.wfs.GetCapabilitiesType#getService()
	 * @see #getGetCapabilitiesType()
	 * @generated
	 */
	EAttribute getGetCapabilitiesType_Service();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.GetFeatureType <em>Get Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Feature Type</em>'.
	 * @see net.opengis.wfs.GetFeatureType
	 * @generated
	 */
	EClass getGetFeatureType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.GetFeatureType#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getQuery()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EReference getGetFeatureType_Query();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getMaxFeatures <em>Max Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Features</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getMaxFeatures()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_MaxFeatures();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Format</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getOutputFormat()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_OutputFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getResultType()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_ResultType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getTraverseXlinkDepth <em>Traverse Xlink Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traverse Xlink Depth</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getTraverseXlinkDepth()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_TraverseXlinkDepth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureType#getTraverseXlinkExpiry <em>Traverse Xlink Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traverse Xlink Expiry</em>'.
	 * @see net.opengis.wfs.GetFeatureType#getTraverseXlinkExpiry()
	 * @see #getGetFeatureType()
	 * @generated
	 */
	EAttribute getGetFeatureType_TraverseXlinkExpiry();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.GetFeatureWithLockType <em>Get Feature With Lock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Feature With Lock Type</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType
	 * @generated
	 */
	EClass getGetFeatureWithLockType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.GetFeatureWithLockType#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Query</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType#getQuery()
	 * @see #getGetFeatureWithLockType()
	 * @generated
	 */
	EReference getGetFeatureWithLockType_Query();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureWithLockType#getExpiry <em>Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType#getExpiry()
	 * @see #getGetFeatureWithLockType()
	 * @generated
	 */
	EAttribute getGetFeatureWithLockType_Expiry();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureWithLockType#getMaxFeatures <em>Max Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Features</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType#getMaxFeatures()
	 * @see #getGetFeatureWithLockType()
	 * @generated
	 */
	EAttribute getGetFeatureWithLockType_MaxFeatures();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureWithLockType#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Format</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType#getOutputFormat()
	 * @see #getGetFeatureWithLockType()
	 * @generated
	 */
	EAttribute getGetFeatureWithLockType_OutputFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureWithLockType#getResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Type</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType#getResultType()
	 * @see #getGetFeatureWithLockType()
	 * @generated
	 */
	EAttribute getGetFeatureWithLockType_ResultType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureWithLockType#getTraverseXlinkDepth <em>Traverse Xlink Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traverse Xlink Depth</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType#getTraverseXlinkDepth()
	 * @see #getGetFeatureWithLockType()
	 * @generated
	 */
	EAttribute getGetFeatureWithLockType_TraverseXlinkDepth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetFeatureWithLockType#getTraverseXlinkExpiry <em>Traverse Xlink Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traverse Xlink Expiry</em>'.
	 * @see net.opengis.wfs.GetFeatureWithLockType#getTraverseXlinkExpiry()
	 * @see #getGetFeatureWithLockType()
	 * @generated
	 */
	EAttribute getGetFeatureWithLockType_TraverseXlinkExpiry();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.GetGmlObjectType <em>Get Gml Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Gml Object Type</em>'.
	 * @see net.opengis.wfs.GetGmlObjectType
	 * @generated
	 */
	EClass getGetGmlObjectType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.GetGmlObjectType#getGmlObjectId <em>Gml Object Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gml Object Id</em>'.
	 * @see net.opengis.wfs.GetGmlObjectType#getGmlObjectId()
	 * @see #getGetGmlObjectType()
	 * @generated
	 */
	EReference getGetGmlObjectType_GmlObjectId();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetGmlObjectType#getOutputFormat <em>Output Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Format</em>'.
	 * @see net.opengis.wfs.GetGmlObjectType#getOutputFormat()
	 * @see #getGetGmlObjectType()
	 * @generated
	 */
	EAttribute getGetGmlObjectType_OutputFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetGmlObjectType#getTraverseXlinkDepth <em>Traverse Xlink Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traverse Xlink Depth</em>'.
	 * @see net.opengis.wfs.GetGmlObjectType#getTraverseXlinkDepth()
	 * @see #getGetGmlObjectType()
	 * @generated
	 */
	EAttribute getGetGmlObjectType_TraverseXlinkDepth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GetGmlObjectType#getTraverseXlinkExpiry <em>Traverse Xlink Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traverse Xlink Expiry</em>'.
	 * @see net.opengis.wfs.GetGmlObjectType#getTraverseXlinkExpiry()
	 * @see #getGetGmlObjectType()
	 * @generated
	 */
	EAttribute getGetGmlObjectType_TraverseXlinkExpiry();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.GMLObjectTypeListType <em>GML Object Type List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GML Object Type List Type</em>'.
	 * @see net.opengis.wfs.GMLObjectTypeListType
	 * @generated
	 */
	EClass getGMLObjectTypeListType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.GMLObjectTypeListType#getGMLObjectType <em>GML Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>GML Object Type</em>'.
	 * @see net.opengis.wfs.GMLObjectTypeListType#getGMLObjectType()
	 * @see #getGMLObjectTypeListType()
	 * @generated
	 */
	EReference getGMLObjectTypeListType_GMLObjectType();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.GMLObjectTypeType <em>GML Object Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GML Object Type Type</em>'.
	 * @see net.opengis.wfs.GMLObjectTypeType
	 * @generated
	 */
	EClass getGMLObjectTypeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GMLObjectTypeType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wfs.GMLObjectTypeType#getName()
	 * @see #getGMLObjectTypeType()
	 * @generated
	 */
	EAttribute getGMLObjectTypeType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GMLObjectTypeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see net.opengis.wfs.GMLObjectTypeType#getTitle()
	 * @see #getGMLObjectTypeType()
	 * @generated
	 */
	EAttribute getGMLObjectTypeType_Title();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.GMLObjectTypeType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see net.opengis.wfs.GMLObjectTypeType#getAbstract()
	 * @see #getGMLObjectTypeType()
	 * @generated
	 */
	EAttribute getGMLObjectTypeType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.GMLObjectTypeType#getKeywords <em>Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keywords</em>'.
	 * @see net.opengis.wfs.GMLObjectTypeType#getKeywords()
	 * @see #getGMLObjectTypeType()
	 * @generated
	 */
	EReference getGMLObjectTypeType_Keywords();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.GMLObjectTypeType#getOutputFormats <em>Output Formats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Formats</em>'.
	 * @see net.opengis.wfs.GMLObjectTypeType#getOutputFormats()
	 * @see #getGMLObjectTypeType()
	 * @generated
	 */
	EReference getGMLObjectTypeType_OutputFormats();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.InsertedFeatureType <em>Inserted Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inserted Feature Type</em>'.
	 * @see net.opengis.wfs.InsertedFeatureType
	 * @generated
	 */
	EClass getInsertedFeatureType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.InsertedFeatureType#getFeatureId <em>Feature Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature Id</em>'.
	 * @see net.opengis.wfs.InsertedFeatureType#getFeatureId()
	 * @see #getInsertedFeatureType()
	 * @generated
	 */
	EReference getInsertedFeatureType_FeatureId();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.InsertedFeatureType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see net.opengis.wfs.InsertedFeatureType#getHandle()
	 * @see #getInsertedFeatureType()
	 * @generated
	 */
	EAttribute getInsertedFeatureType_Handle();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.InsertElementType <em>Insert Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Element Type</em>'.
	 * @see net.opengis.wfs.InsertElementType
	 * @generated
	 */
	EClass getInsertElementType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.InsertElementType#getFeatureGroup <em>Feature Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Feature Group</em>'.
	 * @see net.opengis.wfs.InsertElementType#getFeatureGroup()
	 * @see #getInsertElementType()
	 * @generated
	 */
	EAttribute getInsertElementType_FeatureGroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.InsertElementType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see net.opengis.wfs.InsertElementType#getFeature()
	 * @see #getInsertElementType()
	 * @generated
	 */
	EReference getInsertElementType_Feature();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.InsertElementType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see net.opengis.wfs.InsertElementType#getHandle()
	 * @see #getInsertElementType()
	 * @generated
	 */
	EAttribute getInsertElementType_Handle();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.InsertElementType#getIdgen <em>Idgen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idgen</em>'.
	 * @see net.opengis.wfs.InsertElementType#getIdgen()
	 * @see #getInsertElementType()
	 * @generated
	 */
	EAttribute getInsertElementType_Idgen();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.InsertElementType#getInputFormat <em>Input Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Format</em>'.
	 * @see net.opengis.wfs.InsertElementType#getInputFormat()
	 * @see #getInsertElementType()
	 * @generated
	 */
	EAttribute getInsertElementType_InputFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.InsertElementType#getSrsName <em>Srs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srs Name</em>'.
	 * @see net.opengis.wfs.InsertElementType#getSrsName()
	 * @see #getInsertElementType()
	 * @generated
	 */
	EAttribute getInsertElementType_SrsName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.InsertResultsType <em>Insert Results Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Results Type</em>'.
	 * @see net.opengis.wfs.InsertResultsType
	 * @generated
	 */
	EClass getInsertResultsType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.InsertResultsType#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Feature</em>'.
	 * @see net.opengis.wfs.InsertResultsType#getFeature()
	 * @see #getInsertResultsType()
	 * @generated
	 */
	EReference getInsertResultsType_Feature();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.LockFeatureResponseType <em>Lock Feature Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Feature Response Type</em>'.
	 * @see net.opengis.wfs.LockFeatureResponseType
	 * @generated
	 */
	EClass getLockFeatureResponseType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.LockFeatureResponseType#getLockId <em>Lock Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Id</em>'.
	 * @see net.opengis.wfs.LockFeatureResponseType#getLockId()
	 * @see #getLockFeatureResponseType()
	 * @generated
	 */
	EAttribute getLockFeatureResponseType_LockId();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.LockFeatureResponseType#getFeaturesLocked <em>Features Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features Locked</em>'.
	 * @see net.opengis.wfs.LockFeatureResponseType#getFeaturesLocked()
	 * @see #getLockFeatureResponseType()
	 * @generated
	 */
	EReference getLockFeatureResponseType_FeaturesLocked();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.LockFeatureResponseType#getFeaturesNotLocked <em>Features Not Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Features Not Locked</em>'.
	 * @see net.opengis.wfs.LockFeatureResponseType#getFeaturesNotLocked()
	 * @see #getLockFeatureResponseType()
	 * @generated
	 */
	EReference getLockFeatureResponseType_FeaturesNotLocked();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.LockFeatureType <em>Lock Feature Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Feature Type</em>'.
	 * @see net.opengis.wfs.LockFeatureType
	 * @generated
	 */
	EClass getLockFeatureType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.LockFeatureType#getLock <em>Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lock</em>'.
	 * @see net.opengis.wfs.LockFeatureType#getLock()
	 * @see #getLockFeatureType()
	 * @generated
	 */
	EReference getLockFeatureType_Lock();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.LockFeatureType#getExpiry <em>Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry</em>'.
	 * @see net.opengis.wfs.LockFeatureType#getExpiry()
	 * @see #getLockFeatureType()
	 * @generated
	 */
	EAttribute getLockFeatureType_Expiry();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.LockFeatureType#getLockAction <em>Lock Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Action</em>'.
	 * @see net.opengis.wfs.LockFeatureType#getLockAction()
	 * @see #getLockFeatureType()
	 * @generated
	 */
	EAttribute getLockFeatureType_LockAction();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.LockType <em>Lock Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lock Type</em>'.
	 * @see net.opengis.wfs.LockType
	 * @generated
	 */
	EClass getLockType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.LockType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see net.opengis.wfs.LockType#getFilter()
	 * @see #getLockType()
	 * @generated
	 */
	EReference getLockType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.LockType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see net.opengis.wfs.LockType#getHandle()
	 * @see #getLockType()
	 * @generated
	 */
	EAttribute getLockType_Handle();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.LockType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see net.opengis.wfs.LockType#getTypeName()
	 * @see #getLockType()
	 * @generated
	 */
	EAttribute getLockType_TypeName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.MetadataURLType <em>Metadata URL Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metadata URL Type</em>'.
	 * @see net.opengis.wfs.MetadataURLType
	 * @generated
	 */
	EClass getMetadataURLType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getValue()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getFormat()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Format();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.MetadataURLType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.opengis.wfs.MetadataURLType#getType()
	 * @see #getMetadataURLType()
	 * @generated
	 */
	EAttribute getMetadataURLType_Type();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.NativeType <em>Native Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Native Type</em>'.
	 * @see net.opengis.wfs.NativeType
	 * @generated
	 */
	EClass getNativeType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.NativeType#isSafeToIgnore <em>Safe To Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safe To Ignore</em>'.
	 * @see net.opengis.wfs.NativeType#isSafeToIgnore()
	 * @see #getNativeType()
	 * @generated
	 */
	EAttribute getNativeType_SafeToIgnore();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.NativeType#getVendorId <em>Vendor Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vendor Id</em>'.
	 * @see net.opengis.wfs.NativeType#getVendorId()
	 * @see #getNativeType()
	 * @generated
	 */
	EAttribute getNativeType_VendorId();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.NoSRSType <em>No SRS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No SRS Type</em>'.
	 * @see net.opengis.wfs.NoSRSType
	 * @generated
	 */
	EClass getNoSRSType();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.OperationsType <em>Operations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operations Type</em>'.
	 * @see net.opengis.wfs.OperationsType
	 * @generated
	 */
	EClass getOperationsType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.OperationsType#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operation</em>'.
	 * @see net.opengis.wfs.OperationsType#getOperation()
	 * @see #getOperationsType()
	 * @generated
	 */
	EAttribute getOperationsType_Operation();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.OutputFormatListType <em>Output Format List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Format List Type</em>'.
	 * @see net.opengis.wfs.OutputFormatListType
	 * @generated
	 */
	EClass getOutputFormatListType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.OutputFormatListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.OutputFormatListType#getGroup()
	 * @see #getOutputFormatListType()
	 * @generated
	 */
	EAttribute getOutputFormatListType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.OutputFormatListType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Format</em>'.
	 * @see net.opengis.wfs.OutputFormatListType#getFormat()
	 * @see #getOutputFormatListType()
	 * @generated
	 */
	EAttribute getOutputFormatListType_Format();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see net.opengis.wfs.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.opengis.wfs.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see net.opengis.wfs.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EReference getPropertyType_Value();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.QueryType <em>Query Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query Type</em>'.
	 * @see net.opengis.wfs.QueryType
	 * @generated
	 */
	EClass getQueryType();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.QueryType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.QueryType#getGroup()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.QueryType#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Property Name</em>'.
	 * @see net.opengis.wfs.QueryType#getPropertyName()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_PropertyName();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.QueryType#getXlinkPropertyName <em>Xlink Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xlink Property Name</em>'.
	 * @see net.opengis.wfs.QueryType#getXlinkPropertyName()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_XlinkPropertyName();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.QueryType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function</em>'.
	 * @see net.opengis.wfs.QueryType#getFunction()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_Function();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.QueryType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see net.opengis.wfs.QueryType#getFilter()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.QueryType#getSortBy <em>Sort By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort By</em>'.
	 * @see net.opengis.wfs.QueryType#getSortBy()
	 * @see #getQueryType()
	 * @generated
	 */
	EReference getQueryType_SortBy();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.QueryType#getFeatureVersion <em>Feature Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Feature Version</em>'.
	 * @see net.opengis.wfs.QueryType#getFeatureVersion()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_FeatureVersion();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.QueryType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see net.opengis.wfs.QueryType#getHandle()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_Handle();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.QueryType#getSrsName <em>Srs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srs Name</em>'.
	 * @see net.opengis.wfs.QueryType#getSrsName()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_SrsName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.QueryType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see net.opengis.wfs.QueryType#getTypeName()
	 * @see #getQueryType()
	 * @generated
	 */
	EAttribute getQueryType_TypeName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.TransactionResponseType <em>Transaction Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Response Type</em>'.
	 * @see net.opengis.wfs.TransactionResponseType
	 * @generated
	 */
	EClass getTransactionResponseType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.TransactionResponseType#getTransactionSummary <em>Transaction Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Summary</em>'.
	 * @see net.opengis.wfs.TransactionResponseType#getTransactionSummary()
	 * @see #getTransactionResponseType()
	 * @generated
	 */
	EReference getTransactionResponseType_TransactionSummary();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.TransactionResponseType#getTransactionResults <em>Transaction Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Results</em>'.
	 * @see net.opengis.wfs.TransactionResponseType#getTransactionResults()
	 * @see #getTransactionResponseType()
	 * @generated
	 */
	EReference getTransactionResponseType_TransactionResults();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.TransactionResponseType#getInsertResults <em>Insert Results</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insert Results</em>'.
	 * @see net.opengis.wfs.TransactionResponseType#getInsertResults()
	 * @see #getTransactionResponseType()
	 * @generated
	 */
	EReference getTransactionResponseType_InsertResults();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionResponseType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.opengis.wfs.TransactionResponseType#getVersion()
	 * @see #getTransactionResponseType()
	 * @generated
	 */
	EAttribute getTransactionResponseType_Version();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.TransactionResultsType <em>Transaction Results Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Results Type</em>'.
	 * @see net.opengis.wfs.TransactionResultsType
	 * @generated
	 */
	EClass getTransactionResultsType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.TransactionResultsType#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see net.opengis.wfs.TransactionResultsType#getAction()
	 * @see #getTransactionResultsType()
	 * @generated
	 */
	EReference getTransactionResultsType_Action();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.TransactionSummaryType <em>Transaction Summary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Summary Type</em>'.
	 * @see net.opengis.wfs.TransactionSummaryType
	 * @generated
	 */
	EClass getTransactionSummaryType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionSummaryType#getTotalInserted <em>Total Inserted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Inserted</em>'.
	 * @see net.opengis.wfs.TransactionSummaryType#getTotalInserted()
	 * @see #getTransactionSummaryType()
	 * @generated
	 */
	EAttribute getTransactionSummaryType_TotalInserted();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionSummaryType#getTotalUpdated <em>Total Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Updated</em>'.
	 * @see net.opengis.wfs.TransactionSummaryType#getTotalUpdated()
	 * @see #getTransactionSummaryType()
	 * @generated
	 */
	EAttribute getTransactionSummaryType_TotalUpdated();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionSummaryType#getTotalDeleted <em>Total Deleted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Deleted</em>'.
	 * @see net.opengis.wfs.TransactionSummaryType#getTotalDeleted()
	 * @see #getTransactionSummaryType()
	 * @generated
	 */
	EAttribute getTransactionSummaryType_TotalDeleted();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Type</em>'.
	 * @see net.opengis.wfs.TransactionType
	 * @generated
	 */
	EClass getTransactionType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionType#getLockId <em>Lock Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lock Id</em>'.
	 * @see net.opengis.wfs.TransactionType#getLockId()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_LockId();

	/**
	 * Returns the meta object for the attribute list '{@link net.opengis.wfs.TransactionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.opengis.wfs.TransactionType#getGroup()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.TransactionType#getInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Insert</em>'.
	 * @see net.opengis.wfs.TransactionType#getInsert()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Insert();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.TransactionType#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update</em>'.
	 * @see net.opengis.wfs.TransactionType#getUpdate()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Update();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.TransactionType#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delete</em>'.
	 * @see net.opengis.wfs.TransactionType#getDelete()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Delete();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.TransactionType#getNative <em>Native</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Native</em>'.
	 * @see net.opengis.wfs.TransactionType#getNative()
	 * @see #getTransactionType()
	 * @generated
	 */
	EReference getTransactionType_Native();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.TransactionType#getReleaseAction <em>Release Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Action</em>'.
	 * @see net.opengis.wfs.TransactionType#getReleaseAction()
	 * @see #getTransactionType()
	 * @generated
	 */
	EAttribute getTransactionType_ReleaseAction();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.UpdateElementType <em>Update Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update Element Type</em>'.
	 * @see net.opengis.wfs.UpdateElementType
	 * @generated
	 */
	EClass getUpdateElementType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.opengis.wfs.UpdateElementType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see net.opengis.wfs.UpdateElementType#getProperty()
	 * @see #getUpdateElementType()
	 * @generated
	 */
	EReference getUpdateElementType_Property();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.UpdateElementType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see net.opengis.wfs.UpdateElementType#getFilter()
	 * @see #getUpdateElementType()
	 * @generated
	 */
	EReference getUpdateElementType_Filter();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.UpdateElementType#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see net.opengis.wfs.UpdateElementType#getHandle()
	 * @see #getUpdateElementType()
	 * @generated
	 */
	EAttribute getUpdateElementType_Handle();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.UpdateElementType#getInputFormat <em>Input Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Format</em>'.
	 * @see net.opengis.wfs.UpdateElementType#getInputFormat()
	 * @see #getUpdateElementType()
	 * @generated
	 */
	EAttribute getUpdateElementType_InputFormat();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.UpdateElementType#getSrsName <em>Srs Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Srs Name</em>'.
	 * @see net.opengis.wfs.UpdateElementType#getSrsName()
	 * @see #getUpdateElementType()
	 * @generated
	 */
	EAttribute getUpdateElementType_SrsName();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.UpdateElementType#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see net.opengis.wfs.UpdateElementType#getTypeName()
	 * @see #getUpdateElementType()
	 * @generated
	 */
	EAttribute getUpdateElementType_TypeName();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.WFSCapabilitiesType <em>Capabilities Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capabilities Type</em>'.
	 * @see net.opengis.wfs.WFSCapabilitiesType
	 * @generated
	 */
	EClass getWFSCapabilitiesType();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.WFSCapabilitiesType#getFeatureTypeList <em>Feature Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Type List</em>'.
	 * @see net.opengis.wfs.WFSCapabilitiesType#getFeatureTypeList()
	 * @see #getWFSCapabilitiesType()
	 * @generated
	 */
	EReference getWFSCapabilitiesType_FeatureTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.WFSCapabilitiesType#getServesGMLObjectTypeList <em>Serves GML Object Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serves GML Object Type List</em>'.
	 * @see net.opengis.wfs.WFSCapabilitiesType#getServesGMLObjectTypeList()
	 * @see #getWFSCapabilitiesType()
	 * @generated
	 */
	EReference getWFSCapabilitiesType_ServesGMLObjectTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.WFSCapabilitiesType#getSupportsGMLObjectTypeList <em>Supports GML Object Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Supports GML Object Type List</em>'.
	 * @see net.opengis.wfs.WFSCapabilitiesType#getSupportsGMLObjectTypeList()
	 * @see #getWFSCapabilitiesType()
	 * @generated
	 */
	EReference getWFSCapabilitiesType_SupportsGMLObjectTypeList();

	/**
	 * Returns the meta object for the containment reference '{@link net.opengis.wfs.WFSCapabilitiesType#getFilterCapabilities <em>Filter Capabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter Capabilities</em>'.
	 * @see net.opengis.wfs.WFSCapabilitiesType#getFilterCapabilities()
	 * @see #getWFSCapabilitiesType()
	 * @generated
	 */
	EReference getWFSCapabilitiesType_FilterCapabilities();

	/**
	 * Returns the meta object for class '{@link net.opengis.wfs.XlinkPropertyNameType <em>Xlink Property Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xlink Property Name Type</em>'.
	 * @see net.opengis.wfs.XlinkPropertyNameType
	 * @generated
	 */
	EClass getXlinkPropertyNameType();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.XlinkPropertyNameType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.opengis.wfs.XlinkPropertyNameType#getValue()
	 * @see #getXlinkPropertyNameType()
	 * @generated
	 */
	EAttribute getXlinkPropertyNameType_Value();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.XlinkPropertyNameType#getTraverseXlinkDepth <em>Traverse Xlink Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traverse Xlink Depth</em>'.
	 * @see net.opengis.wfs.XlinkPropertyNameType#getTraverseXlinkDepth()
	 * @see #getXlinkPropertyNameType()
	 * @generated
	 */
	EAttribute getXlinkPropertyNameType_TraverseXlinkDepth();

	/**
	 * Returns the meta object for the attribute '{@link net.opengis.wfs.XlinkPropertyNameType#getTraverseXlinkExpiry <em>Traverse Xlink Expiry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Traverse Xlink Expiry</em>'.
	 * @see net.opengis.wfs.XlinkPropertyNameType#getTraverseXlinkExpiry()
	 * @see #getXlinkPropertyNameType()
	 * @generated
	 */
	EAttribute getXlinkPropertyNameType_TraverseXlinkExpiry();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.AllSomeType <em>All Some Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>All Some Type</em>'.
	 * @see net.opengis.wfs.AllSomeType
	 * @generated
	 */
	EEnum getAllSomeType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.FormatType <em>Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Format Type</em>'.
	 * @see net.opengis.wfs.FormatType
	 * @generated
	 */
	EEnum getFormatType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.IdentifierGenerationOptionType <em>Identifier Generation Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Identifier Generation Option Type</em>'.
	 * @see net.opengis.wfs.IdentifierGenerationOptionType
	 * @generated
	 */
	EEnum getIdentifierGenerationOptionType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.OperationType <em>Operation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Type</em>'.
	 * @see net.opengis.wfs.OperationType
	 * @generated
	 */
	EEnum getOperationType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.ResultTypeType <em>Result Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Result Type Type</em>'.
	 * @see net.opengis.wfs.ResultTypeType
	 * @generated
	 */
	EEnum getResultTypeType();

	/**
	 * Returns the meta object for enum '{@link net.opengis.wfs.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type Type</em>'.
	 * @see net.opengis.wfs.TypeType
	 * @generated
	 */
	EEnum getTypeType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.AllSomeType <em>All Some Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>All Some Type Object</em>'.
	 * @see net.opengis.wfs.AllSomeType
	 * @model instanceClass="net.opengis.wfs.AllSomeType"
	 *        extendedMetaData="name='AllSomeType:Object' baseType='AllSomeType'"
	 * @generated
	 */
	EDataType getAllSomeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Base Type Name List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Base Type Name List Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='Base_TypeNameListType' itemType='http://www.eclipse.org/emf/2003/XMLType#QName'"
	 * @generated
	 */
	EDataType getBaseTypeNameListType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.FormatType <em>Format Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Format Type Object</em>'.
	 * @see net.opengis.wfs.FormatType
	 * @model instanceClass="net.opengis.wfs.FormatType"
	 *        extendedMetaData="name='format_._type:Object' baseType='format_._type'"
	 * @generated
	 */
	EDataType getFormatTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.IdentifierGenerationOptionType <em>Identifier Generation Option Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Identifier Generation Option Type Object</em>'.
	 * @see net.opengis.wfs.IdentifierGenerationOptionType
	 * @model instanceClass="net.opengis.wfs.IdentifierGenerationOptionType"
	 *        extendedMetaData="name='IdentifierGenerationOptionType:Object' baseType='IdentifierGenerationOptionType'"
	 * @generated
	 */
	EDataType getIdentifierGenerationOptionTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.OperationType <em>Operation Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Operation Type Object</em>'.
	 * @see net.opengis.wfs.OperationType
	 * @model instanceClass="net.opengis.wfs.OperationType"
	 *        extendedMetaData="name='OperationType:Object' baseType='OperationType'"
	 * @generated
	 */
	EDataType getOperationTypeObject();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.ResultTypeType <em>Result Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Result Type Type Object</em>'.
	 * @see net.opengis.wfs.ResultTypeType
	 * @model instanceClass="net.opengis.wfs.ResultTypeType"
	 *        extendedMetaData="name='ResultTypeType:Object' baseType='ResultTypeType'"
	 * @generated
	 */
	EDataType getResultTypeTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Type Name List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Name List Type</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='TypeNameListType' baseType='Base_TypeNameListType' pattern='((\\w:)?\\w(=\\w)?){1,}'"
	 * @generated
	 */
	EDataType getTypeNameListType();

	/**
	 * Returns the meta object for data type '{@link net.opengis.wfs.TypeType <em>Type Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Type Type Object</em>'.
	 * @see net.opengis.wfs.TypeType
	 * @model instanceClass="net.opengis.wfs.TypeType"
	 *        extendedMetaData="name='type_._type:Object' baseType='type_._type'"
	 * @generated
	 */
	EDataType getTypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WFSFactory getWFSFactory();

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
		 * The meta object literal for the '{@link net.opengis.wfs.impl.ActionTypeImpl <em>Action Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.ActionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getActionType()
		 * @generated
		 */
		EClass ACTION_TYPE = eINSTANCE.getActionType();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__MESSAGE = eINSTANCE.getActionType_Message();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__CODE = eINSTANCE.getActionType_Code();

		/**
		 * The meta object literal for the '<em><b>Locator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_TYPE__LOCATOR = eINSTANCE.getActionType_Locator();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.BaseRequestTypeImpl <em>Base Request Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.BaseRequestTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getBaseRequestType()
		 * @generated
		 */
		EClass BASE_REQUEST_TYPE = eINSTANCE.getBaseRequestType();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_REQUEST_TYPE__HANDLE = eINSTANCE.getBaseRequestType_Handle();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_REQUEST_TYPE__SERVICE = eINSTANCE.getBaseRequestType_Service();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASE_REQUEST_TYPE__VERSION = eINSTANCE.getBaseRequestType_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.DeleteElementTypeImpl <em>Delete Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.DeleteElementTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getDeleteElementType()
		 * @generated
		 */
		EClass DELETE_ELEMENT_TYPE = eINSTANCE.getDeleteElementType();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELETE_ELEMENT_TYPE__FILTER = eINSTANCE.getDeleteElementType_Filter();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ELEMENT_TYPE__HANDLE = eINSTANCE.getDeleteElementType_Handle();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELETE_ELEMENT_TYPE__TYPE_NAME = eINSTANCE.getDeleteElementType_TypeName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.DescribeFeatureTypeTypeImpl <em>Describe Feature Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.DescribeFeatureTypeTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getDescribeFeatureTypeType()
		 * @generated
		 */
		EClass DESCRIBE_FEATURE_TYPE_TYPE = eINSTANCE.getDescribeFeatureTypeType();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBE_FEATURE_TYPE_TYPE__TYPE_NAME = eINSTANCE.getDescribeFeatureTypeType_TypeName();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBE_FEATURE_TYPE_TYPE__OUTPUT_FORMAT = eINSTANCE.getDescribeFeatureTypeType_OutputFormat();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.DocumentRootImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getDocumentRoot()
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
		 * The meta object literal for the '<em><b>Delete</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DELETE = eINSTANCE.getDocumentRoot_Delete();

		/**
		 * The meta object literal for the '<em><b>Describe Feature Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DESCRIBE_FEATURE_TYPE = eINSTANCE.getDocumentRoot_DescribeFeatureType();

		/**
		 * The meta object literal for the '<em><b>Feature Collection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE_COLLECTION = eINSTANCE.getDocumentRoot_FeatureCollection();

		/**
		 * The meta object literal for the '<em><b>Feature Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FEATURE_TYPE_LIST = eINSTANCE.getDocumentRoot_FeatureTypeList();

		/**
		 * The meta object literal for the '<em><b>Get Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_CAPABILITIES = eINSTANCE.getDocumentRoot_GetCapabilities();

		/**
		 * The meta object literal for the '<em><b>Get Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_FEATURE = eINSTANCE.getDocumentRoot_GetFeature();

		/**
		 * The meta object literal for the '<em><b>Get Feature With Lock</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_FEATURE_WITH_LOCK = eINSTANCE.getDocumentRoot_GetFeatureWithLock();

		/**
		 * The meta object literal for the '<em><b>Get Gml Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__GET_GML_OBJECT = eINSTANCE.getDocumentRoot_GetGmlObject();

		/**
		 * The meta object literal for the '<em><b>Insert</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INSERT = eINSTANCE.getDocumentRoot_Insert();

		/**
		 * The meta object literal for the '<em><b>Lock Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCK_FEATURE = eINSTANCE.getDocumentRoot_LockFeature();

		/**
		 * The meta object literal for the '<em><b>Lock Feature Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LOCK_FEATURE_RESPONSE = eINSTANCE.getDocumentRoot_LockFeatureResponse();

		/**
		 * The meta object literal for the '<em><b>Lock Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__LOCK_ID = eINSTANCE.getDocumentRoot_LockId();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NATIVE = eINSTANCE.getDocumentRoot_Native();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROPERTY = eINSTANCE.getDocumentRoot_Property();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PROPERTY_NAME = eINSTANCE.getDocumentRoot_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__QUERY = eINSTANCE.getDocumentRoot_Query();

		/**
		 * The meta object literal for the '<em><b>Serves GML Object Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SERVES_GML_OBJECT_TYPE_LIST = eINSTANCE.getDocumentRoot_ServesGMLObjectTypeList();

		/**
		 * The meta object literal for the '<em><b>Supports GML Object Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUPPORTS_GML_OBJECT_TYPE_LIST = eINSTANCE.getDocumentRoot_SupportsGMLObjectTypeList();

		/**
		 * The meta object literal for the '<em><b>Transaction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSACTION = eINSTANCE.getDocumentRoot_Transaction();

		/**
		 * The meta object literal for the '<em><b>Transaction Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSACTION_RESPONSE = eINSTANCE.getDocumentRoot_TransactionResponse();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UPDATE = eINSTANCE.getDocumentRoot_Update();

		/**
		 * The meta object literal for the '<em><b>WFS Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__WFS_CAPABILITIES = eINSTANCE.getDocumentRoot_WFSCapabilities();

		/**
		 * The meta object literal for the '<em><b>Xlink Property Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XLINK_PROPERTY_NAME = eINSTANCE.getDocumentRoot_XlinkPropertyName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.FeatureCollectionTypeImpl <em>Feature Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.FeatureCollectionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureCollectionType()
		 * @generated
		 */
		EClass FEATURE_COLLECTION_TYPE = eINSTANCE.getFeatureCollectionType();

		/**
		 * The meta object literal for the '<em><b>Lock Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION_TYPE__LOCK_ID = eINSTANCE.getFeatureCollectionType_LockId();

		/**
		 * The meta object literal for the '<em><b>Number Of Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION_TYPE__NUMBER_OF_FEATURES = eINSTANCE.getFeatureCollectionType_NumberOfFeatures();

		/**
		 * The meta object literal for the '<em><b>Time Stamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_COLLECTION_TYPE__TIME_STAMP = eINSTANCE.getFeatureCollectionType_TimeStamp();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.FeaturesLockedTypeImpl <em>Features Locked Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.FeaturesLockedTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeaturesLockedType()
		 * @generated
		 */
		EClass FEATURES_LOCKED_TYPE = eINSTANCE.getFeaturesLockedType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_LOCKED_TYPE__GROUP = eINSTANCE.getFeaturesLockedType_Group();

		/**
		 * The meta object literal for the '<em><b>Feature Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_LOCKED_TYPE__FEATURE_ID = eINSTANCE.getFeaturesLockedType_FeatureId();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.FeaturesNotLockedTypeImpl <em>Features Not Locked Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.FeaturesNotLockedTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeaturesNotLockedType()
		 * @generated
		 */
		EClass FEATURES_NOT_LOCKED_TYPE = eINSTANCE.getFeaturesNotLockedType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURES_NOT_LOCKED_TYPE__GROUP = eINSTANCE.getFeaturesNotLockedType_Group();

		/**
		 * The meta object literal for the '<em><b>Feature Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURES_NOT_LOCKED_TYPE__FEATURE_ID = eINSTANCE.getFeaturesNotLockedType_FeatureId();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.FeatureTypeListTypeImpl <em>Feature Type List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.FeatureTypeListTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureTypeListType()
		 * @generated
		 */
		EClass FEATURE_TYPE_LIST_TYPE = eINSTANCE.getFeatureTypeListType();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_LIST_TYPE__OPERATIONS = eINSTANCE.getFeatureTypeListType_Operations();

		/**
		 * The meta object literal for the '<em><b>Feature Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_LIST_TYPE__FEATURE_TYPE = eINSTANCE.getFeatureTypeListType_FeatureType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.FeatureTypeTypeImpl <em>Feature Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.FeatureTypeTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFeatureTypeType()
		 * @generated
		 */
		EClass FEATURE_TYPE_TYPE = eINSTANCE.getFeatureTypeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE_TYPE__NAME = eINSTANCE.getFeatureTypeType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE_TYPE__TITLE = eINSTANCE.getFeatureTypeType_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE_TYPE__ABSTRACT = eINSTANCE.getFeatureTypeType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__KEYWORDS = eINSTANCE.getFeatureTypeType_Keywords();

		/**
		 * The meta object literal for the '<em><b>Default SRS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE_TYPE__DEFAULT_SRS = eINSTANCE.getFeatureTypeType_DefaultSRS();

		/**
		 * The meta object literal for the '<em><b>Other SRS</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE_TYPE_TYPE__OTHER_SRS = eINSTANCE.getFeatureTypeType_OtherSRS();

		/**
		 * The meta object literal for the '<em><b>No SRS</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__NO_SRS = eINSTANCE.getFeatureTypeType_NoSRS();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__OPERATIONS = eINSTANCE.getFeatureTypeType_Operations();

		/**
		 * The meta object literal for the '<em><b>Output Formats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__OUTPUT_FORMATS = eINSTANCE.getFeatureTypeType_OutputFormats();

		/**
		 * The meta object literal for the '<em><b>WGS84 Bounding Box</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__WGS84_BOUNDING_BOX = eINSTANCE.getFeatureTypeType_WGS84BoundingBox();

		/**
		 * The meta object literal for the '<em><b>Metadata URL</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_TYPE_TYPE__METADATA_URL = eINSTANCE.getFeatureTypeType_MetadataURL();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.GetCapabilitiesTypeImpl <em>Get Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.GetCapabilitiesTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetCapabilitiesType()
		 * @generated
		 */
		EClass GET_CAPABILITIES_TYPE = eINSTANCE.getGetCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_CAPABILITIES_TYPE__SERVICE = eINSTANCE.getGetCapabilitiesType_Service();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.GetFeatureTypeImpl <em>Get Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.GetFeatureTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetFeatureType()
		 * @generated
		 */
		EClass GET_FEATURE_TYPE = eINSTANCE.getGetFeatureType();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_FEATURE_TYPE__QUERY = eINSTANCE.getGetFeatureType_Query();

		/**
		 * The meta object literal for the '<em><b>Max Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__MAX_FEATURES = eINSTANCE.getGetFeatureType_MaxFeatures();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__OUTPUT_FORMAT = eINSTANCE.getGetFeatureType_OutputFormat();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__RESULT_TYPE = eINSTANCE.getGetFeatureType_ResultType();

		/**
		 * The meta object literal for the '<em><b>Traverse Xlink Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__TRAVERSE_XLINK_DEPTH = eINSTANCE.getGetFeatureType_TraverseXlinkDepth();

		/**
		 * The meta object literal for the '<em><b>Traverse Xlink Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_TYPE__TRAVERSE_XLINK_EXPIRY = eINSTANCE.getGetFeatureType_TraverseXlinkExpiry();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.GetFeatureWithLockTypeImpl <em>Get Feature With Lock Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.GetFeatureWithLockTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetFeatureWithLockType()
		 * @generated
		 */
		EClass GET_FEATURE_WITH_LOCK_TYPE = eINSTANCE.getGetFeatureWithLockType();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_FEATURE_WITH_LOCK_TYPE__QUERY = eINSTANCE.getGetFeatureWithLockType_Query();

		/**
		 * The meta object literal for the '<em><b>Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_WITH_LOCK_TYPE__EXPIRY = eINSTANCE.getGetFeatureWithLockType_Expiry();

		/**
		 * The meta object literal for the '<em><b>Max Features</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_WITH_LOCK_TYPE__MAX_FEATURES = eINSTANCE.getGetFeatureWithLockType_MaxFeatures();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_WITH_LOCK_TYPE__OUTPUT_FORMAT = eINSTANCE.getGetFeatureWithLockType_OutputFormat();

		/**
		 * The meta object literal for the '<em><b>Result Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_WITH_LOCK_TYPE__RESULT_TYPE = eINSTANCE.getGetFeatureWithLockType_ResultType();

		/**
		 * The meta object literal for the '<em><b>Traverse Xlink Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_WITH_LOCK_TYPE__TRAVERSE_XLINK_DEPTH = eINSTANCE.getGetFeatureWithLockType_TraverseXlinkDepth();

		/**
		 * The meta object literal for the '<em><b>Traverse Xlink Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_FEATURE_WITH_LOCK_TYPE__TRAVERSE_XLINK_EXPIRY = eINSTANCE.getGetFeatureWithLockType_TraverseXlinkExpiry();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.GetGmlObjectTypeImpl <em>Get Gml Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.GetGmlObjectTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getGetGmlObjectType()
		 * @generated
		 */
		EClass GET_GML_OBJECT_TYPE = eINSTANCE.getGetGmlObjectType();

		/**
		 * The meta object literal for the '<em><b>Gml Object Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_GML_OBJECT_TYPE__GML_OBJECT_ID = eINSTANCE.getGetGmlObjectType_GmlObjectId();

		/**
		 * The meta object literal for the '<em><b>Output Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_GML_OBJECT_TYPE__OUTPUT_FORMAT = eINSTANCE.getGetGmlObjectType_OutputFormat();

		/**
		 * The meta object literal for the '<em><b>Traverse Xlink Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_DEPTH = eINSTANCE.getGetGmlObjectType_TraverseXlinkDepth();

		/**
		 * The meta object literal for the '<em><b>Traverse Xlink Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_GML_OBJECT_TYPE__TRAVERSE_XLINK_EXPIRY = eINSTANCE.getGetGmlObjectType_TraverseXlinkExpiry();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.GMLObjectTypeListTypeImpl <em>GML Object Type List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.GMLObjectTypeListTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getGMLObjectTypeListType()
		 * @generated
		 */
		EClass GML_OBJECT_TYPE_LIST_TYPE = eINSTANCE.getGMLObjectTypeListType();

		/**
		 * The meta object literal for the '<em><b>GML Object Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_OBJECT_TYPE_LIST_TYPE__GML_OBJECT_TYPE = eINSTANCE.getGMLObjectTypeListType_GMLObjectType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.GMLObjectTypeTypeImpl <em>GML Object Type Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.GMLObjectTypeTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getGMLObjectTypeType()
		 * @generated
		 */
		EClass GML_OBJECT_TYPE_TYPE = eINSTANCE.getGMLObjectTypeType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_OBJECT_TYPE_TYPE__NAME = eINSTANCE.getGMLObjectTypeType_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_OBJECT_TYPE_TYPE__TITLE = eINSTANCE.getGMLObjectTypeType_Title();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GML_OBJECT_TYPE_TYPE__ABSTRACT = eINSTANCE.getGMLObjectTypeType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Keywords</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_OBJECT_TYPE_TYPE__KEYWORDS = eINSTANCE.getGMLObjectTypeType_Keywords();

		/**
		 * The meta object literal for the '<em><b>Output Formats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GML_OBJECT_TYPE_TYPE__OUTPUT_FORMATS = eINSTANCE.getGMLObjectTypeType_OutputFormats();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.InsertedFeatureTypeImpl <em>Inserted Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.InsertedFeatureTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getInsertedFeatureType()
		 * @generated
		 */
		EClass INSERTED_FEATURE_TYPE = eINSTANCE.getInsertedFeatureType();

		/**
		 * The meta object literal for the '<em><b>Feature Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTED_FEATURE_TYPE__FEATURE_ID = eINSTANCE.getInsertedFeatureType_FeatureId();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTED_FEATURE_TYPE__HANDLE = eINSTANCE.getInsertedFeatureType_Handle();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.InsertElementTypeImpl <em>Insert Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.InsertElementTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getInsertElementType()
		 * @generated
		 */
		EClass INSERT_ELEMENT_TYPE = eINSTANCE.getInsertElementType();

		/**
		 * The meta object literal for the '<em><b>Feature Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT_TYPE__FEATURE_GROUP = eINSTANCE.getInsertElementType_FeatureGroup();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_ELEMENT_TYPE__FEATURE = eINSTANCE.getInsertElementType_Feature();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT_TYPE__HANDLE = eINSTANCE.getInsertElementType_Handle();

		/**
		 * The meta object literal for the '<em><b>Idgen</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT_TYPE__IDGEN = eINSTANCE.getInsertElementType_Idgen();

		/**
		 * The meta object literal for the '<em><b>Input Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT_TYPE__INPUT_FORMAT = eINSTANCE.getInsertElementType_InputFormat();

		/**
		 * The meta object literal for the '<em><b>Srs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT_TYPE__SRS_NAME = eINSTANCE.getInsertElementType_SrsName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.InsertResultsTypeImpl <em>Insert Results Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.InsertResultsTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getInsertResultsType()
		 * @generated
		 */
		EClass INSERT_RESULTS_TYPE = eINSTANCE.getInsertResultsType();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_RESULTS_TYPE__FEATURE = eINSTANCE.getInsertResultsType_Feature();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.LockFeatureResponseTypeImpl <em>Lock Feature Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.LockFeatureResponseTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getLockFeatureResponseType()
		 * @generated
		 */
		EClass LOCK_FEATURE_RESPONSE_TYPE = eINSTANCE.getLockFeatureResponseType();

		/**
		 * The meta object literal for the '<em><b>Lock Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_FEATURE_RESPONSE_TYPE__LOCK_ID = eINSTANCE.getLockFeatureResponseType_LockId();

		/**
		 * The meta object literal for the '<em><b>Features Locked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCK_FEATURE_RESPONSE_TYPE__FEATURES_LOCKED = eINSTANCE.getLockFeatureResponseType_FeaturesLocked();

		/**
		 * The meta object literal for the '<em><b>Features Not Locked</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCK_FEATURE_RESPONSE_TYPE__FEATURES_NOT_LOCKED = eINSTANCE.getLockFeatureResponseType_FeaturesNotLocked();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.LockFeatureTypeImpl <em>Lock Feature Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.LockFeatureTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getLockFeatureType()
		 * @generated
		 */
		EClass LOCK_FEATURE_TYPE = eINSTANCE.getLockFeatureType();

		/**
		 * The meta object literal for the '<em><b>Lock</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCK_FEATURE_TYPE__LOCK = eINSTANCE.getLockFeatureType_Lock();

		/**
		 * The meta object literal for the '<em><b>Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_FEATURE_TYPE__EXPIRY = eINSTANCE.getLockFeatureType_Expiry();

		/**
		 * The meta object literal for the '<em><b>Lock Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_FEATURE_TYPE__LOCK_ACTION = eINSTANCE.getLockFeatureType_LockAction();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.LockTypeImpl <em>Lock Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.LockTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getLockType()
		 * @generated
		 */
		EClass LOCK_TYPE = eINSTANCE.getLockType();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCK_TYPE__FILTER = eINSTANCE.getLockType_Filter();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_TYPE__HANDLE = eINSTANCE.getLockType_Handle();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCK_TYPE__TYPE_NAME = eINSTANCE.getLockType_TypeName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.MetadataURLTypeImpl <em>Metadata URL Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.MetadataURLTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getMetadataURLType()
		 * @generated
		 */
		EClass METADATA_URL_TYPE = eINSTANCE.getMetadataURLType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__VALUE = eINSTANCE.getMetadataURLType_Value();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__FORMAT = eINSTANCE.getMetadataURLType_Format();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METADATA_URL_TYPE__TYPE = eINSTANCE.getMetadataURLType_Type();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.NativeTypeImpl <em>Native Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.NativeTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getNativeType()
		 * @generated
		 */
		EClass NATIVE_TYPE = eINSTANCE.getNativeType();

		/**
		 * The meta object literal for the '<em><b>Safe To Ignore</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_TYPE__SAFE_TO_IGNORE = eINSTANCE.getNativeType_SafeToIgnore();

		/**
		 * The meta object literal for the '<em><b>Vendor Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NATIVE_TYPE__VENDOR_ID = eINSTANCE.getNativeType_VendorId();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.NoSRSTypeImpl <em>No SRS Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.NoSRSTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getNoSRSType()
		 * @generated
		 */
		EClass NO_SRS_TYPE = eINSTANCE.getNoSRSType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.OperationsTypeImpl <em>Operations Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.OperationsTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getOperationsType()
		 * @generated
		 */
		EClass OPERATIONS_TYPE = eINSTANCE.getOperationsType();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATIONS_TYPE__OPERATION = eINSTANCE.getOperationsType_Operation();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.OutputFormatListTypeImpl <em>Output Format List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.OutputFormatListTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getOutputFormatListType()
		 * @generated
		 */
		EClass OUTPUT_FORMAT_LIST_TYPE = eINSTANCE.getOutputFormatListType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FORMAT_LIST_TYPE__GROUP = eINSTANCE.getOutputFormatListType_Group();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT_FORMAT_LIST_TYPE__FORMAT = eINSTANCE.getOutputFormatListType_Format();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.PropertyTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.QueryTypeImpl <em>Query Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.QueryTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getQueryType()
		 * @generated
		 */
		EClass QUERY_TYPE = eINSTANCE.getQueryType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__GROUP = eINSTANCE.getQueryType_Group();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__PROPERTY_NAME = eINSTANCE.getQueryType_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Xlink Property Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_TYPE__XLINK_PROPERTY_NAME = eINSTANCE.getQueryType_XlinkPropertyName();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_TYPE__FUNCTION = eINSTANCE.getQueryType_Function();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_TYPE__FILTER = eINSTANCE.getQueryType_Filter();

		/**
		 * The meta object literal for the '<em><b>Sort By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY_TYPE__SORT_BY = eINSTANCE.getQueryType_SortBy();

		/**
		 * The meta object literal for the '<em><b>Feature Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__FEATURE_VERSION = eINSTANCE.getQueryType_FeatureVersion();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__HANDLE = eINSTANCE.getQueryType_Handle();

		/**
		 * The meta object literal for the '<em><b>Srs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__SRS_NAME = eINSTANCE.getQueryType_SrsName();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUERY_TYPE__TYPE_NAME = eINSTANCE.getQueryType_TypeName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.TransactionResponseTypeImpl <em>Transaction Response Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.TransactionResponseTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionResponseType()
		 * @generated
		 */
		EClass TRANSACTION_RESPONSE_TYPE = eINSTANCE.getTransactionResponseType();

		/**
		 * The meta object literal for the '<em><b>Transaction Summary</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESPONSE_TYPE__TRANSACTION_SUMMARY = eINSTANCE.getTransactionResponseType_TransactionSummary();

		/**
		 * The meta object literal for the '<em><b>Transaction Results</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESPONSE_TYPE__TRANSACTION_RESULTS = eINSTANCE.getTransactionResponseType_TransactionResults();

		/**
		 * The meta object literal for the '<em><b>Insert Results</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESPONSE_TYPE__INSERT_RESULTS = eINSTANCE.getTransactionResponseType_InsertResults();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_RESPONSE_TYPE__VERSION = eINSTANCE.getTransactionResponseType_Version();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.TransactionResultsTypeImpl <em>Transaction Results Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.TransactionResultsTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionResultsType()
		 * @generated
		 */
		EClass TRANSACTION_RESULTS_TYPE = eINSTANCE.getTransactionResultsType();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_RESULTS_TYPE__ACTION = eINSTANCE.getTransactionResultsType_Action();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.TransactionSummaryTypeImpl <em>Transaction Summary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.TransactionSummaryTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionSummaryType()
		 * @generated
		 */
		EClass TRANSACTION_SUMMARY_TYPE = eINSTANCE.getTransactionSummaryType();

		/**
		 * The meta object literal for the '<em><b>Total Inserted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_SUMMARY_TYPE__TOTAL_INSERTED = eINSTANCE.getTransactionSummaryType_TotalInserted();

		/**
		 * The meta object literal for the '<em><b>Total Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_SUMMARY_TYPE__TOTAL_UPDATED = eINSTANCE.getTransactionSummaryType_TotalUpdated();

		/**
		 * The meta object literal for the '<em><b>Total Deleted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_SUMMARY_TYPE__TOTAL_DELETED = eINSTANCE.getTransactionSummaryType_TotalDeleted();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.TransactionTypeImpl <em>Transaction Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.TransactionTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTransactionType()
		 * @generated
		 */
		EClass TRANSACTION_TYPE = eINSTANCE.getTransactionType();

		/**
		 * The meta object literal for the '<em><b>Lock Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__LOCK_ID = eINSTANCE.getTransactionType_LockId();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__GROUP = eINSTANCE.getTransactionType_Group();

		/**
		 * The meta object literal for the '<em><b>Insert</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__INSERT = eINSTANCE.getTransactionType_Insert();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__UPDATE = eINSTANCE.getTransactionType_Update();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__DELETE = eINSTANCE.getTransactionType_Delete();

		/**
		 * The meta object literal for the '<em><b>Native</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_TYPE__NATIVE = eINSTANCE.getTransactionType_Native();

		/**
		 * The meta object literal for the '<em><b>Release Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_TYPE__RELEASE_ACTION = eINSTANCE.getTransactionType_ReleaseAction();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.UpdateElementTypeImpl <em>Update Element Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.UpdateElementTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getUpdateElementType()
		 * @generated
		 */
		EClass UPDATE_ELEMENT_TYPE = eINSTANCE.getUpdateElementType();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ELEMENT_TYPE__PROPERTY = eINSTANCE.getUpdateElementType_Property();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_ELEMENT_TYPE__FILTER = eINSTANCE.getUpdateElementType_Filter();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ELEMENT_TYPE__HANDLE = eINSTANCE.getUpdateElementType_Handle();

		/**
		 * The meta object literal for the '<em><b>Input Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ELEMENT_TYPE__INPUT_FORMAT = eINSTANCE.getUpdateElementType_InputFormat();

		/**
		 * The meta object literal for the '<em><b>Srs Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ELEMENT_TYPE__SRS_NAME = eINSTANCE.getUpdateElementType_SrsName();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_ELEMENT_TYPE__TYPE_NAME = eINSTANCE.getUpdateElementType_TypeName();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.WFSCapabilitiesTypeImpl <em>Capabilities Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.WFSCapabilitiesTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getWFSCapabilitiesType()
		 * @generated
		 */
		EClass WFS_CAPABILITIES_TYPE = eINSTANCE.getWFSCapabilitiesType();

		/**
		 * The meta object literal for the '<em><b>Feature Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFS_CAPABILITIES_TYPE__FEATURE_TYPE_LIST = eINSTANCE.getWFSCapabilitiesType_FeatureTypeList();

		/**
		 * The meta object literal for the '<em><b>Serves GML Object Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFS_CAPABILITIES_TYPE__SERVES_GML_OBJECT_TYPE_LIST = eINSTANCE.getWFSCapabilitiesType_ServesGMLObjectTypeList();

		/**
		 * The meta object literal for the '<em><b>Supports GML Object Type List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFS_CAPABILITIES_TYPE__SUPPORTS_GML_OBJECT_TYPE_LIST = eINSTANCE.getWFSCapabilitiesType_SupportsGMLObjectTypeList();

		/**
		 * The meta object literal for the '<em><b>Filter Capabilities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WFS_CAPABILITIES_TYPE__FILTER_CAPABILITIES = eINSTANCE.getWFSCapabilitiesType_FilterCapabilities();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.impl.XlinkPropertyNameTypeImpl <em>Xlink Property Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.impl.XlinkPropertyNameTypeImpl
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getXlinkPropertyNameType()
		 * @generated
		 */
		EClass XLINK_PROPERTY_NAME_TYPE = eINSTANCE.getXlinkPropertyNameType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_PROPERTY_NAME_TYPE__VALUE = eINSTANCE.getXlinkPropertyNameType_Value();

		/**
		 * The meta object literal for the '<em><b>Traverse Xlink Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_PROPERTY_NAME_TYPE__TRAVERSE_XLINK_DEPTH = eINSTANCE.getXlinkPropertyNameType_TraverseXlinkDepth();

		/**
		 * The meta object literal for the '<em><b>Traverse Xlink Expiry</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLINK_PROPERTY_NAME_TYPE__TRAVERSE_XLINK_EXPIRY = eINSTANCE.getXlinkPropertyNameType_TraverseXlinkExpiry();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.AllSomeType <em>All Some Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.AllSomeType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getAllSomeType()
		 * @generated
		 */
		EEnum ALL_SOME_TYPE = eINSTANCE.getAllSomeType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.FormatType <em>Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.FormatType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFormatType()
		 * @generated
		 */
		EEnum FORMAT_TYPE = eINSTANCE.getFormatType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.IdentifierGenerationOptionType <em>Identifier Generation Option Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.IdentifierGenerationOptionType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getIdentifierGenerationOptionType()
		 * @generated
		 */
		EEnum IDENTIFIER_GENERATION_OPTION_TYPE = eINSTANCE.getIdentifierGenerationOptionType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.OperationType <em>Operation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.OperationType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getOperationType()
		 * @generated
		 */
		EEnum OPERATION_TYPE = eINSTANCE.getOperationType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.ResultTypeType <em>Result Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.ResultTypeType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getResultTypeType()
		 * @generated
		 */
		EEnum RESULT_TYPE_TYPE = eINSTANCE.getResultTypeType();

		/**
		 * The meta object literal for the '{@link net.opengis.wfs.TypeType <em>Type Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.TypeType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTypeType()
		 * @generated
		 */
		EEnum TYPE_TYPE = eINSTANCE.getTypeType();

		/**
		 * The meta object literal for the '<em>All Some Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.AllSomeType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getAllSomeTypeObject()
		 * @generated
		 */
		EDataType ALL_SOME_TYPE_OBJECT = eINSTANCE.getAllSomeTypeObject();

		/**
		 * The meta object literal for the '<em>Base Type Name List Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getBaseTypeNameListType()
		 * @generated
		 */
		EDataType BASE_TYPE_NAME_LIST_TYPE = eINSTANCE.getBaseTypeNameListType();

		/**
		 * The meta object literal for the '<em>Format Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.FormatType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getFormatTypeObject()
		 * @generated
		 */
		EDataType FORMAT_TYPE_OBJECT = eINSTANCE.getFormatTypeObject();

		/**
		 * The meta object literal for the '<em>Identifier Generation Option Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.IdentifierGenerationOptionType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getIdentifierGenerationOptionTypeObject()
		 * @generated
		 */
		EDataType IDENTIFIER_GENERATION_OPTION_TYPE_OBJECT = eINSTANCE.getIdentifierGenerationOptionTypeObject();

		/**
		 * The meta object literal for the '<em>Operation Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.OperationType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getOperationTypeObject()
		 * @generated
		 */
		EDataType OPERATION_TYPE_OBJECT = eINSTANCE.getOperationTypeObject();

		/**
		 * The meta object literal for the '<em>Result Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.ResultTypeType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getResultTypeTypeObject()
		 * @generated
		 */
		EDataType RESULT_TYPE_TYPE_OBJECT = eINSTANCE.getResultTypeTypeObject();

		/**
		 * The meta object literal for the '<em>Type Name List Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTypeNameListType()
		 * @generated
		 */
		EDataType TYPE_NAME_LIST_TYPE = eINSTANCE.getTypeNameListType();

		/**
		 * The meta object literal for the '<em>Type Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.opengis.wfs.TypeType
		 * @see net.opengis.wfs.impl.WFSPackageImpl#getTypeTypeObject()
		 * @generated
		 */
		EDataType TYPE_TYPE_OBJECT = eINSTANCE.getTypeTypeObject();

	}

} //WFSPackage
