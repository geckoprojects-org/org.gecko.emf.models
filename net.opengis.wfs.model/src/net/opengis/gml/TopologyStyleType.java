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
package net.opengis.gml;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topology Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * [complexType of] The style descriptor for topologies of a feature. Describes individual topology elements styles.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.TopologyStyleType#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link net.opengis.gml.TopologyStyleType#getStyle <em>Style</em>}</li>
 *   <li>{@link net.opengis.gml.TopologyStyleType#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link net.opengis.gml.TopologyStyleType#getTopologyProperty <em>Topology Property</em>}</li>
 *   <li>{@link net.opengis.gml.TopologyStyleType#getTopologyType <em>Topology Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml.GMLPackage#getTopologyStyleType()
 * @model extendedMetaData="name='TopologyStyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TopologyStyleType extends BaseStyleDescriptorType {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The symbol property. Extends the gml:AssociationType to allow for remote referencing of symbols.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol</em>' containment reference.
	 * @see #setSymbol(SymbolType)
	 * @see net.opengis.gml.GMLPackage#getTopologyStyleType_Symbol()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='symbol' namespace='##targetNamespace'"
	 * @generated
	 */
	SymbolType getSymbol();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopologyStyleType#getSymbol <em>Symbol</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' containment reference.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(SymbolType value);

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deprecated in GML version 3.1.0. Use symbol with inline content instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see net.opengis.gml.GMLPackage#getTopologyStyleType_Style()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='style' namespace='##targetNamespace'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopologyStyleType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label Style</em>' containment reference.
	 * @see #setLabelStyle(LabelStylePropertyType)
	 * @see net.opengis.gml.GMLPackage#getTopologyStyleType_LabelStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='labelStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelStylePropertyType getLabelStyle();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopologyStyleType#getLabelStyle <em>Label Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Style</em>' containment reference.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(LabelStylePropertyType value);

	/**
	 * Returns the value of the '<em><b>Topology Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Property</em>' attribute.
	 * @see #setTopologyProperty(String)
	 * @see net.opengis.gml.GMLPackage#getTopologyStyleType_TopologyProperty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='topologyProperty'"
	 * @generated
	 */
	String getTopologyProperty();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopologyStyleType#getTopologyProperty <em>Topology Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Property</em>' attribute.
	 * @see #getTopologyProperty()
	 * @generated
	 */
	void setTopologyProperty(String value);

	/**
	 * Returns the value of the '<em><b>Topology Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Type</em>' attribute.
	 * @see #setTopologyType(String)
	 * @see net.opengis.gml.GMLPackage#getTopologyStyleType_TopologyType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='topologyType'"
	 * @generated
	 */
	String getTopologyType();

	/**
	 * Sets the value of the '{@link net.opengis.gml.TopologyStyleType#getTopologyType <em>Topology Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Type</em>' attribute.
	 * @see #getTopologyType()
	 * @generated
	 */
	void setTopologyType(String value);

} // TopologyStyleType
