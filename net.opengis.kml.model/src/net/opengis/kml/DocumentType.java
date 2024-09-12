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
 * A representation of the model object '<em><b>Document Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.DocumentType#getSchema <em>Schema</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentType#getAbstractFeatureGroupGroup <em>Abstract Feature Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentType#getAbstractFeatureGroup <em>Abstract Feature Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentType#getDocumentSimpleExtensionGroupGroup <em>Document Simple Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentType#getDocumentSimpleExtensionGroup <em>Document Simple Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentType#getDocumentObjectExtensionGroupGroup <em>Document Object Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.DocumentType#getDocumentObjectExtensionGroup <em>Document Object Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getDocumentType()
 * @model extendedMetaData="name='DocumentType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DocumentType extends AbstractContainerType {
	/**
	 * Returns the value of the '<em><b>Schema</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.SchemaType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getDocumentType_Schema()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schema' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SchemaType> getSchema();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getDocumentType_AbstractFeatureGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='AbstractFeatureGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractFeatureGroupGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Feature Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractFeatureType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Feature Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getDocumentType_AbstractFeatureGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractFeatureGroup' namespace='##targetNamespace' group='AbstractFeatureGroup:group'"
	 * @generated
	 */
	EList<AbstractFeatureType> getAbstractFeatureGroup();

	/**
	 * Returns the value of the '<em><b>Document Simple Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Simple Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getDocumentType_DocumentSimpleExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentSimpleExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentSimpleExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Document Simple Extension Group</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Simple Extension Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getDocumentType_DocumentSimpleExtensionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentSimpleExtensionGroup' namespace='##targetNamespace' group='DocumentSimpleExtensionGroup:group'"
	 * @generated
	 */
	EList<Object> getDocumentSimpleExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Document Object Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Object Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getDocumentType_DocumentObjectExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='DocumentObjectExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getDocumentObjectExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Document Object Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.AbstractObjectType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Object Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getDocumentType_DocumentObjectExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DocumentObjectExtensionGroup' namespace='##targetNamespace' group='DocumentObjectExtensionGroup:group'"
	 * @generated
	 */
	EList<AbstractObjectType> getDocumentObjectExtensionGroup();

} // DocumentType
