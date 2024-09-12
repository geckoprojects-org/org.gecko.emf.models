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
 * A representation of the model object '<em><b>Abstract Sub Style Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleSimpleExtensionGroupGroup <em>Abstract Sub Style Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleSimpleExtensionGroup <em>Abstract Sub Style Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleObjectExtensionGroupGroup <em>Abstract Sub Style Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.AbstractSubStyleType#getAbstractSubStyleObjectExtensionGroup <em>Abstract Sub Style Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getAbstractSubStyleType()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractSubStyleType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AbstractSubStyleType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Abstract Sub Style Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Sub Style Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractSubStyleType_AbstractSubStyleSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractSubStyleSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractSubStyleSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Sub Style Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Sub Style Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractSubStyleType_AbstractSubStyleSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSubStyleSimpleExtensionGroup' namespace='##targetNamespace' group='AbstractSubStyleSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getAbstractSubStyleSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Sub Style Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Sub Style Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getAbstractSubStyleType_AbstractSubStyleObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractSubStyleObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractSubStyleObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Sub Style Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Sub Style Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getAbstractSubStyleType_AbstractSubStyleObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractSubStyleObjectExtensionGroup' namespace='##targetNamespace' group='AbstractSubStyleObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getAbstractSubStyleObjectExtensionGroup();

} // AbstractSubStyleType
