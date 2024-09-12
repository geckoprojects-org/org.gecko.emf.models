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
package net.opengis.wfs.configuration;

import java.util.HashMap;
import java.util.Map;

import net.opengis.wfs.WFSPackage;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.gecko.emf.osgi.constants.EMFNamespaces;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
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
 * @see EPackageConfigurator
 * @generated
 */
public class WFSEPackageConfigurator implements EPackageConfigurator {
	
	private WFSPackage ePackage;

	protected WFSEPackageConfigurator(WFSPackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(WFSPackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(WFSPackage.eNS_URI);
	}
	
	/**
	 * A method providing the Properties the services around this Model should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, WFSPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, WFSPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_REGISTRATION, EMFNamespaces.MODEL_REGISTRATION_PROVIDED);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "wfs");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		return properties;
	}
}