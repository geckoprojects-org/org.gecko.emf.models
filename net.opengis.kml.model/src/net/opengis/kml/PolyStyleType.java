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
 * A representation of the model object '<em><b>Poly Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.PolyStyleType#isFill <em>Fill</em>}</li>
 *   <li>{@link net.opengis.kml.PolyStyleType#isOutline <em>Outline</em>}</li>
 *   <li>{@link net.opengis.kml.PolyStyleType#getPolyStyleSimpleExtensionGroupGroup <em>Poly Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PolyStyleType#getPolyStyleSimpleExtensionGroup <em>Poly Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.PolyStyleType#getPolyStyleObjectExtensionGroupGroup <em>Poly Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.PolyStyleType#getPolyStyleObjectExtensionGroup <em>Poly Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getPolyStyleType()
 * @model extendedMetaData="name='PolyStyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PolyStyleType extends AbstractColorStyleType {
	/**
	 * Returns the value of the '<em><b>Fill</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' attribute.
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #setFill(boolean)
	 * @see net.opengis.kml.KMLPackage#getPolyStyleType_Fill()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='fill' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isFill();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PolyStyleType#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' attribute.
	 * @see #isSetFill()
	 * @see #unsetFill()
	 * @see #isFill()
	 * @generated
	 */
	void setFill(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.PolyStyleType#isFill <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFill()
	 * @see #isFill()
	 * @see #setFill(boolean)
	 * @generated
	 */
	void unsetFill();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.PolyStyleType#isFill <em>Fill</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fill</em>' attribute is set.
	 * @see #unsetFill()
	 * @see #isFill()
	 * @see #setFill(boolean)
	 * @generated
	 */
	boolean isSetFill();

	/**
	 * Returns the value of the '<em><b>Outline</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outline</em>' attribute.
	 * @see #isSetOutline()
	 * @see #unsetOutline()
	 * @see #setOutline(boolean)
	 * @see net.opengis.kml.KMLPackage#getPolyStyleType_Outline()
	 * @model default="1" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='outline' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isOutline();

	/**
	 * Sets the value of the '{@link net.opengis.kml.PolyStyleType#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outline</em>' attribute.
	 * @see #isSetOutline()
	 * @see #unsetOutline()
	 * @see #isOutline()
	 * @generated
	 */
	void setOutline(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.PolyStyleType#isOutline <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOutline()
	 * @see #isOutline()
	 * @see #setOutline(boolean)
	 * @generated
	 */
	void unsetOutline();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.PolyStyleType#isOutline <em>Outline</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Outline</em>' attribute is set.
	 * @see #unsetOutline()
	 * @see #isOutline()
	 * @see #setOutline(boolean)
	 * @generated
	 */
	boolean isSetOutline();

	/**
	 * Returns the value of the '<em><b>Poly Style Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poly Style Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPolyStyleType_PolyStyleSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PolyStyleSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPolyStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Poly Style Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poly Style Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPolyStyleType_PolyStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolyStyleSimpleExtensionGroup' namespace='##targetNamespace' group='PolyStyleSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getPolyStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Poly Style Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poly Style Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getPolyStyleType_PolyStyleObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='PolyStyleObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getPolyStyleObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Poly Style Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Poly Style Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getPolyStyleType_PolyStyleObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='PolyStyleObjectExtensionGroup' namespace='##targetNamespace' group='PolyStyleObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getPolyStyleObjectExtensionGroup();

} // PolyStyleType
