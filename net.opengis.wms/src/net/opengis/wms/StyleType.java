/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package net.opengis.wms;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wms.StyleType#getName <em>Name</em>}</li>
 *   <li>{@link net.opengis.wms.StyleType#getTitle <em>Title</em>}</li>
 *   <li>{@link net.opengis.wms.StyleType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link net.opengis.wms.StyleType#getLegendURL <em>Legend URL</em>}</li>
 *   <li>{@link net.opengis.wms.StyleType#getStyleSheetURL <em>Style Sheet URL</em>}</li>
 *   <li>{@link net.opengis.wms.StyleType#getStyleURL <em>Style URL</em>}</li>
 * </ul>
 *
 * @see net.opengis.wms.WMSPackage#getStyleType()
 * @model extendedMetaData="name='Style_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StyleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Name is typically for machine-to-machine communication.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.opengis.wms.WMSPackage#getStyleType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.opengis.wms.StyleType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The Title is for informative display to a human.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see net.opengis.wms.WMSPackage#getStyleType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Title' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link net.opengis.wms.StyleType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         The abstract is a longer narrative description of an object.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see net.opengis.wms.WMSPackage#getStyleType_Abstract()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link net.opengis.wms.StyleType#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Legend URL</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.wms.LegendURLType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use zero or more LegendURL elements to provide an
	 *         image(s) of a legend relevant to each Style of a Layer.  The Format
	 *         element indicates the MIME type of the legend. Width and height
	 *         attributes may be provided to assist client applications in laying out
	 *         space to display the legend.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Legend URL</em>' containment reference list.
	 * @see net.opengis.wms.WMSPackage#getStyleType_LegendURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LegendURL' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<LegendURLType> getLegendURL();

	/**
	 * Returns the value of the '<em><b>Style Sheet URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         StyleSheeetURL provides symbology information for each Style of a Layer.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style Sheet URL</em>' containment reference.
	 * @see #setStyleSheetURL(StyleSheetURLType)
	 * @see net.opengis.wms.WMSPackage#getStyleType_StyleSheetURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StyleSheetURL' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleSheetURLType getStyleSheetURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.StyleType#getStyleSheetURL <em>Style Sheet URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style Sheet URL</em>' containment reference.
	 * @see #getStyleSheetURL()
	 * @generated
	 */
	void setStyleSheetURL(StyleSheetURLType value);

	/**
	 * Returns the value of the '<em><b>Style URL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *         A Map Server may use StyleURL to offer more information about the
	 *         data or symbology underlying a particular Style. While the semantics
	 *         are not well-defined, as long as the results of an HTTP GET request
	 *         against the StyleURL are properly MIME-typed, Viewer Clients and
	 *         Cascading Map Servers can make use of this. A possible use could be
	 *         to allow a Map Server to provide legend information.
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style URL</em>' containment reference.
	 * @see #setStyleURL(StyleURLType)
	 * @see net.opengis.wms.WMSPackage#getStyleType_StyleURL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='StyleURL' namespace='##targetNamespace'"
	 * @generated
	 */
	StyleURLType getStyleURL();

	/**
	 * Sets the value of the '{@link net.opengis.wms.StyleType#getStyleURL <em>Style URL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style URL</em>' containment reference.
	 * @see #getStyleURL()
	 * @generated
	 */
	void setStyleURL(StyleURLType value);

} // StyleType
