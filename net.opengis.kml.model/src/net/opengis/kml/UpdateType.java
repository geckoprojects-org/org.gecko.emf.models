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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.kml.UpdateType#getTargetHref <em>Target Href</em>}</li>
 *   <li>{@link net.opengis.kml.UpdateType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.kml.UpdateType#getCreate <em>Create</em>}</li>
 *   <li>{@link net.opengis.kml.UpdateType#getDelete <em>Delete</em>}</li>
 *   <li>{@link net.opengis.kml.UpdateType#getChange <em>Change</em>}</li>
 *   <li>{@link net.opengis.kml.UpdateType#getUpdateOpExtensionGroupGroup <em>Update Op Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.UpdateType#getUpdateOpExtensionGroup <em>Update Op Extension Group</em>}</li>
 *   <li>{@link net.opengis.kml.UpdateType#getUpdateExtensionGroupGroup <em>Update Extension Group Group</em>}</li>
 *   <li>{@link net.opengis.kml.UpdateType#getUpdateExtensionGroup <em>Update Extension Group</em>}</li>
 * </ul>
 *
 * @see net.opengis.kml.KMLPackage#getUpdateType()
 * @model extendedMetaData="name='UpdateType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UpdateType extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Href</em>' attribute.
	 * @see #setTargetHref(String)
	 * @see net.opengis.kml.KMLPackage#getUpdateType_TargetHref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI" required="true"
	 *        extendedMetaData="kind='element' name='targetHref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTargetHref();

	/**
	 * Sets the value of the '{@link net.opengis.kml.UpdateType#getTargetHref <em>Target Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Href</em>' attribute.
	 * @see #getTargetHref()
	 * @generated
	 */
	void setTargetHref(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getUpdateType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Create</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.CreateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getUpdateType_Create()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Create' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CreateType> getCreate();

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.DeleteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getUpdateType_Delete()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Delete' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DeleteType> getDelete();

	/**
	 * Returns the value of the '<em><b>Change</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.kml.ChangeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getUpdateType_Change()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Change' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ChangeType> getChange();

	/**
	 * Returns the value of the '<em><b>Update Op Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Op Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getUpdateType_UpdateOpExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='UpdateOpExtensionGroup:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getUpdateOpExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Update Op Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Op Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getUpdateType_UpdateOpExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdateOpExtensionGroup' namespace='##targetNamespace' group='UpdateOpExtensionGroup:group'"
	 * @generated
	 */
	EList<EObject> getUpdateOpExtensionGroup();

	/**
	 * Returns the value of the '<em><b>Update Extension Group Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Extension Group Group</em>' attribute list.
	 * @see net.opengis.kml.KMLPackage#getUpdateType_UpdateExtensionGroupGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='UpdateExtensionGroup:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getUpdateExtensionGroupGroup();

	/**
	 * Returns the value of the '<em><b>Update Extension Group</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Extension Group</em>' containment reference list.
	 * @see net.opengis.kml.KMLPackage#getUpdateType_UpdateExtensionGroup()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='UpdateExtensionGroup' namespace='##targetNamespace' group='UpdateExtensionGroup:group'"
	 * @generated
	 */
	EList<EObject> getUpdateExtensionGroup();

} // UpdateType
