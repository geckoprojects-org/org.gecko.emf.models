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
package ee.jakarta.xml.ns.persistence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceType#getPersistenceUnit <em>Persistence Unit</em>}</li>
 *   <li>{@link ee.jakarta.xml.ns.persistence.PersistenceType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceType()
 * @model extendedMetaData="name='persistence_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface PersistenceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Persistence Unit</b></em>' containment reference list.
	 * The list contents are of type {@link ee.jakarta.xml.ns.persistence.PersistenceUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistence Unit</em>' containment reference list.
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceType_PersistenceUnit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='persistence-unit' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersistenceUnitType> getPersistenceUnit();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"3.2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see ee.jakarta.xml.ns.persistence.PersistencePackage#getPersistenceType_Version()
	 * @model default="3.2" unsettable="true" dataType="ee.jakarta.xml.ns.persistence.VersionType" required="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Unsets the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link ee.jakarta.xml.ns.persistence.PersistenceType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // PersistenceType
