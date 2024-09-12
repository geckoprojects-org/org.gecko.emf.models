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
 * A representation of the model object '<em><b>Label Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.LabelStyleType#getScale <em>Scale</em>}</li>
 *   <li>{@link net.opengis.kml.LabelStyleType#getLabelStyleSimpleExtensionGroupGroup <em>Label Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LabelStyleType#getLabelStyleSimpleExtensionGroup <em>Label Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.LabelStyleType#getLabelStyleObjectExtensionGroupGroup <em>Label Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LabelStyleType#getLabelStyleObjectExtensionGroup <em>Label Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getLabelStyleType()
 * @model extendedMetaData="name='LabelStyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LabelStyleType extends AbstractColorStyleType {
	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #setScale(double)
	 * @see net.opengis.kml.KMLPackage#getLabelStyleType_Scale()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='scale' namespace='##targetNamespace'"
	 * @generated
	 */
	double getScale();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LabelStyleType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #isSetScale()
	 * @see #unsetScale()
	 * @see #getScale()
	 * @generated
	 */
	void setScale(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LabelStyleType#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScale()
	 * @see #getScale()
	 * @see #setScale(double)
	 * @generated
	 */
	void unsetScale();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LabelStyleType#getScale <em>Scale</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scale</em>' attribute is set.
	 * @see #unsetScale()
	 * @see #getScale()
	 * @see #setScale(double)
	 * @generated
	 */
	boolean isSetScale();

	/**
	 * Returns the value of the '<em><b>Label Style Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLabelStyleType_LabelStyleSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LabelStyleSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLabelStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Label Style Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLabelStyleType_LabelStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabelStyleSimpleExtensionGroup' namespace='##targetNamespace' group='LabelStyleSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getLabelStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Label Style Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLabelStyleType_LabelStyleObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LabelStyleObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLabelStyleObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Label Style Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Style Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getLabelStyleType_LabelStyleObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LabelStyleObjectExtensionGroup' namespace='##targetNamespace' group='LabelStyleObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getLabelStyleObjectExtensionGroup();

} // LabelStyleType
