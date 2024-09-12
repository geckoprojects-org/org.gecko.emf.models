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
package org.w3.xhtml.configuration;

import java.util.HashMap;
import java.util.Map;

import org.gecko.emf.osgi.configurator.EPackageConfigurator;

import org.gecko.emf.osgi.constants.EMFNamespaces;

import org.w3.xhtml.XhtmlPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *     XHTML 1.0 (Second Edition) Strict in XML Schema
 * 
 *     This is the same as HTML 4 Strict except for
 *     changes due to the differences between XML and SGML.
 * 
 *     Namespace = http://www.w3.org/1999/xhtml
 * 
 *     For further information, see: http://www.w3.org/TR/xhtml1
 * 
 *     Copyright (c) 1998-2002 W3C (MIT, INRIA, Keio),
 *     All Rights Reserved. 
 * 
 *     The DTD version is identified by the PUBLIC and SYSTEM identifiers:
 * 
 *     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd"
 * 
 *     _id: xhtml1-strict.xsd,v 1.2 2002/08/28 08:05:44 mimasa Exp $
 *     
 * 
 *     ================ Character mnemonic entities =========================
 * 
 *     XHTML entity sets are identified by the PUBLIC and SYSTEM identifiers:
 *   
 *     PUBLIC "-//W3C//ENTITIES Latin 1 for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-lat1.ent"
 * 
 *     PUBLIC "-//W3C//ENTITIES Special for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-special.ent"
 * 
 *     PUBLIC "-//W3C//ENTITIES Symbols for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-symbol.ent"
 *     
 * 
 *     ================== Imported Names ====================================
 *     
 * 
 *     these are used for image maps
 *     
 * 
 *     =================== Generic Attributes ===============================
 *     
 * 
 *     =================== Text Elements ====================================
 *     
 * 
 *     ================== Block level elements ==============================
 *     
 * 
 *     ================== Content models for exclusions =====================
 *     
 * 
 *     ================ Document Structure ==================================
 *     
 * 
 *     =================== Paragraphs =======================================
 *     
 * 
 *     =================== Headings =========================================
 * 
 *     There are six levels of headings from h1 (the most important)
 *     to h6 (the least important).
 *     
 * 
 *     =================== Lists ============================================
 *     
 * 
 *     definition lists - dt for term, dd for its definition
 *     
 * 
 *     =================== Address ==========================================
 *     
 * 
 *     =================== Horizontal Rule ==================================
 *     
 * 
 *     =================== Preformatted Text ================================
 *     
 * 
 *     =================== Block-like Quotes ================================
 *     
 * 
 *     ================== The Anchor Element ================================
 *     
 * 
 *     ===================== Inline Elements ================================
 *     
 * 
 *     =================== Images ===========================================
 * 
 *     To avoid accessibility problems for people who aren't
 *     able to see the image, you should provide a text
 *     description using the alt and longdesc attributes.
 *     In addition, avoid the use of server-side image maps.
 *     Note that in this DTD there is no name attribute. That
 *     is only available in the transitional and frameset DTD.
 *     
 * 
 *     ================== Client-side image maps ============================
 * 
 *     These can be placed in the same document or grouped in a
 *     separate document although this isn't yet widely supported
 *     
 * 
 *     ======================= Tables =======================================
 * 
 *     Derived from IETF HTML table standard, see [RFC1942]
 *     
 * 
 *     Use thead to duplicate headers when breaking table
 *     across page boundaries, or for static headers when
 *     tbody sections are rendered in scrolling panel.
 * 
 *     Use tfoot to duplicate footers when breaking table
 *     across page boundaries, or for static footers when
 *     tbody sections are rendered in scrolling panel.
 * 
 *     Use multiple tbody sections when rules are needed
 *     between groups of table rows.
 *     
 * 
 *     th is for headers, td for data and for cells acting as both
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
 *     <h3>Father (in any context at all)</h3>
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
 *                 
 *       <a name="usage">About this schema document</a>
 *               
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
 *                 
 *       <a name="nsversioning">Versioning policy for this schema document</a>
 *               
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
 *                         
 *           <a href="http://www.w3.org/2009/01/xml.xsd">
 * 	http://www.w3.org/2009/01/xml.xsd</a>
 *                       
 *         </li>
 *                     
 *         <li>
 *                         
 *           <a href="http://www.w3.org/2007/08/xml.xsd">
 * 	http://www.w3.org/2007/08/xml.xsd</a>
 *                       
 *         </li>
 *                     
 *         <li>
 *                         
 *           <a href="http://www.w3.org/2004/10/xml.xsd">
 * 	http://www.w3.org/2004/10/xml.xsd</a>
 *                       
 *         </li>
 *                     
 *         <li>
 *                         
 *           <a href="http://www.w3.org/2001/03/xml.xsd">
 * 	http://www.w3.org/2001/03/xml.xsd</a>
 *                       
 *         </li>
 *                   
 *       </ul>
 *               
 *     </div>
 *           
 *   </div>
 *       
 * 
 * <!-- end-model-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class XhtmlEPackageConfigurator implements EPackageConfigurator {
	
	private XhtmlPackage ePackage;

	protected XhtmlEPackageConfigurator(XhtmlPackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(XhtmlPackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.gecko.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(XhtmlPackage.eNS_URI);
	}
	
	/**
	 * A method providing the Properties the services around this Model should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_MODEL_NAME, XhtmlPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, XhtmlPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_REGISTRATION, EMFNamespaces.MODEL_REGISTRATION_PROVIDED);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "xhtml");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		return properties;
	}
}