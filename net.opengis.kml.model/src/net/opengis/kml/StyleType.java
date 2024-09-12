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
package net.opengis.kml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

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
 *   <li>{@link net.opengis.kml.StyleType#getIconStyle <em>Icon Style</em>}</li>
 *   <li>{@link net.opengis.kml.StyleType#getLabelStyle <em>Label Style</em>}</li>
 *   <li>{@link net.opengis.kml.StyleType#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link net.opengis.kml.StyleType#getPolyStyle <em>Poly Style</em>}</li>
 *   <li>{@link net.opengis.kml.StyleType#getBalloonStyle <em>Balloon Style</em>}</li>
 *   <li>{@link net.opengis.kml.StyleType#getListStyle <em>List Style</em>}</li>
 *   <li>{@link net.opengis.kml.StyleType#getStyleSimpleExtensionGroupGroup <em>Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.StyleType#getStyleSimpleExtensionGroup <em>Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.StyleType#getStyleObjectExtensionGroupGroup <em>Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.StyleType#getStyleObjectExtensionGroup <em>Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getStyleType()
 * @model extendedMetaData="name='StyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface StyleType extends AbstractStyleSelectorType {
	/**
	 * Returns the value of the '<em><b>Icon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Icon Style</em>' containment reference.
	 * @see #setIconStyle(IconStyleType)
	 * @see net.opengis.kml.KMLPackage#getStyleType_IconStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IconStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	IconStyleType getIconStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.StyleType#getIconStyle <em>Icon Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Icon Style</em>' containment reference.
	 * @see #getIconStyle()
	 * @generated
	 */
	void setIconStyle(IconStyleType value);

	/**
	 * Returns the value of the '<em><b>Label Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style</em>' containment reference.
	 * @see #setLabelStyle(LabelStyleType)
	 * @see net.opengis.kml.KMLPackage#getStyleType_LabelStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LabelStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	LabelStyleType getLabelStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.StyleType#getLabelStyle <em>Label Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Style</em>' containment reference.
	 * @see #getLabelStyle()
	 * @generated
	 */
	void setLabelStyle(LabelStyleType value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' containment reference.
	 * @see #setLineStyle(LineStyleType)
	 * @see net.opengis.kml.KMLPackage#getStyleType_LineStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LineStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	LineStyleType getLineStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.StyleType#getLineStyle <em>Line Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' containment reference.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyleType value);

	/**
	 * Returns the value of the '<em><b>Poly Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poly Style</em>' containment reference.
	 * @see #setPolyStyle(PolyStyleType)
	 * @see net.opengis.kml.KMLPackage#getStyleType_PolyStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PolyStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	PolyStyleType getPolyStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.StyleType#getPolyStyle <em>Poly Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Poly Style</em>' containment reference.
	 * @see #getPolyStyle()
	 * @generated
	 */
	void setPolyStyle(PolyStyleType value);

	/**
	 * Returns the value of the '<em><b>Balloon Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balloon Style</em>' containment reference.
	 * @see #setBalloonStyle(BalloonStyleType)
	 * @see net.opengis.kml.KMLPackage#getStyleType_BalloonStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BalloonStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	BalloonStyleType getBalloonStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.StyleType#getBalloonStyle <em>Balloon Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balloon Style</em>' containment reference.
	 * @see #getBalloonStyle()
	 * @generated
	 */
	void setBalloonStyle(BalloonStyleType value);

	/**
	 * Returns the value of the '<em><b>List Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Style</em>' containment reference.
	 * @see #setListStyle(ListStyleType)
	 * @see net.opengis.kml.KMLPackage#getStyleType_ListStyle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ListStyle' namespace='##targetNamespace'"
	 * @generated
	 */
	ListStyleType getListStyle();

	/**
	 * Sets the value of the '{@link net.opengis.kml.StyleType#getListStyle <em>List Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Style</em>' containment reference.
	 * @see #getListStyle()
	 * @generated
	 */
	void setListStyle(ListStyleType value);

	/**
	 * Returns the value of the '<em><b>Style Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getStyleType_StyleSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='StyleSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Style Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getStyleType_StyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleSimpleExtensionGroup' namespace='##targetNamespace' group='StyleSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Style Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getStyleType_StyleObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='StyleObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getStyleObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Style Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getStyleType_StyleObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='StyleObjectExtensionGroup' namespace='##targetNamespace' group='StyleObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getStyleObjectExtensionGroup();

} // StyleType
