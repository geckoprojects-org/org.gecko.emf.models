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
 * A representation of the model object '<em><b>Abstract Style Selector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorSimpleExtensionGroupGroup <em>Abstract Style Selector Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorSimpleExtensionGroup <em>Abstract Style Selector Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorObjectExtensionGroupGroup <em>Abstract Style Selector Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractStyleSelectorType#getAbstractStyleSelectorObjectExtensionGroup <em>Abstract Style Selector Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAbstractStyleSelectorType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractStyleSelectorType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractStyleSelectorType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractStyleSelectorType_AbstractStyleSelectorSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractStyleSelectorSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractStyleSelectorSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractStyleSelectorType_AbstractStyleSelectorSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractStyleSelectorSimpleExtensionGroup' namespace='##targetNamespace' group='AbstractStyleSelectorSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getAbstractStyleSelectorSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractStyleSelectorType_AbstractStyleSelectorObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractStyleSelectorObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractStyleSelectorObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Style Selector Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Style Selector Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAbstractStyleSelectorType_AbstractStyleSelectorObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractStyleSelectorObjectExtensionGroup' namespace='##targetNamespace' group='AbstractStyleSelectorObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAbstractStyleSelectorObjectExtensionGroup();

} // AbstractStyleSelectorType
