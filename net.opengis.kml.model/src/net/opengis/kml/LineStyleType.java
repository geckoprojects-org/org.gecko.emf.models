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
 * A representation of the model object '<em><b>Line Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.LineStyleType#getWidth <em>Width</em>}</li>
 *   <li>{@link net.opengis.kml.LineStyleType#getLineStyleSimpleExtensionGroupGroup <em>Line Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LineStyleType#getLineStyleSimpleExtensionGroup <em>Line Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.LineStyleType#getLineStyleObjectExtensionGroupGroup <em>Line Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.LineStyleType#getLineStyleObjectExtensionGroup <em>Line Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getLineStyleType()
 * @model extendedMetaData="name='LineStyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LineStyleType extends AbstractColorStyleType {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(double)
	 * @see net.opengis.kml.KMLPackage#getLineStyleType_Width()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link net.opengis.kml.LineStyleType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Unsets the value of the '{@link net.opengis.kml.LineStyleType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(double)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link net.opengis.kml.LineStyleType#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(double)
	 * @generated
	 */
	boolean isSetWidth();

	/**
	 * Returns the value of the '<em><b>Line Style Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLineStyleType_LineStyleSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LineStyleSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLineStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Line Style Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLineStyleType_LineStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStyleSimpleExtensionGroup' namespace='##targetNamespace' group='LineStyleSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getLineStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Line Style Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getLineStyleType_LineStyleObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='LineStyleObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getLineStyleObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Line Style Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getLineStyleType_LineStyleObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='LineStyleObjectExtensionGroup' namespace='##targetNamespace' group='LineStyleObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getLineStyleObjectExtensionGroup();

} // LineStyleType
