/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Version Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.VersionType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.VersionType#getRange <em>Range</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.VersionType#getStatus <em>Status</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getVersionType()
 * @model extendedMetaData="name='version_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface VersionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A single version of a component or service.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVersionType_Version()
	 * @model dataType="org.cyclonedx.schema.bom.VersionType1"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VersionType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A version range specified in Package URL Version Range syntax (vers) which is defined at https://github.com/package-url/purl-spec/VERSION-RANGE-SPEC.rst
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Range</em>' attribute.
	 * @see #setRange(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVersionType_Range()
	 * @model dataType="org.cyclonedx.schema.bom.VersionRangeType"
	 *        extendedMetaData="kind='element' name='range' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRange();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VersionType#getRange <em>Range</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' attribute.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The default value is <code>"affected"</code>.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                                                         The vulnerability status for the version or range of versions.
	 *                                                                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #setStatus(ImpactAnalysisAffectedStatusType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getVersionType_Status()
	 * @model default="affected" unsettable="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	ImpactAnalysisAffectedStatusType getStatus();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.VersionType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisAffectedStatusType
	 * @see #isSetStatus()
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ImpactAnalysisAffectedStatusType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.VersionType#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetStatus()
	 * @see #getStatus()
	 * @see #setStatus(ImpactAnalysisAffectedStatusType)
	 * @generated
	 */
	void unsetStatus();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.VersionType#getStatus <em>Status</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Status</em>' attribute is set.
	 * @see #unsetStatus()
	 * @see #getStatus()
	 * @see #setStatus(ImpactAnalysisAffectedStatusType)
	 * @generated
	 */
	boolean isSetStatus();

} // VersionType
