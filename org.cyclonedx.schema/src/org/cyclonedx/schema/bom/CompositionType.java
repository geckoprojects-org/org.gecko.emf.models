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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CompositionType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CompositionType#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CompositionType#getAssemblies <em>Assemblies</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CompositionType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CompositionType#getVulnerabilities <em>Vulnerabilities</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CompositionType#getBomRef <em>Bom Ref</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCompositionType()
 * @model extendedMetaData="name='compositionType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CompositionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCompositionType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Aggregate</b></em>' attribute list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.AggregateType}.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.AggregateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies an aggregate type that describe how complete a relationship is.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregate</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.AggregateType
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCompositionType_Aggregate()
	 * @model default="not_specified" unique="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='aggregate' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AggregateType> getAggregate();

	/**
	 * Returns the value of the '<em><b>Assemblies</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.AssembliesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The bom-ref identifiers of the components or services being described. Assemblies refer to
	 *                         nested relationships whereby a constituent part may include other constituent parts. References
	 *                         do not cascade to child parts. References are explicit for the specified constituent part only.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assemblies</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCompositionType_Assemblies()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='assemblies' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<AssembliesType> getAssemblies();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.DependenciesType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The bom-ref identifiers of the components or services being described. Dependencies refer to a
	 *                         relationship whereby an independent constituent part requires another independent constituent
	 *                         part. References do not cascade to transitive dependencies. References are explicit for the
	 *                         specified dependency only.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCompositionType_Dependencies()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dependencies' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DependenciesType> getDependencies();

	/**
	 * Returns the value of the '<em><b>Vulnerabilities</b></em>' containment reference list.
	 * The list contents are of type {@link org.cyclonedx.schema.bom.VulnerabilitiesType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The bom-ref identifiers of the vulnerabilities being described.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vulnerabilities</em>' containment reference list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCompositionType_Vulnerabilities()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='vulnerabilities' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<VulnerabilitiesType1> getVulnerabilities();

	/**
	 * Returns the value of the '<em><b>Bom Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     An optional identifier which can be used to reference the composition elsewhere in the BOM.
	 *                     Uniqueness is enforced within all elements and children of the root-level bom element.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bom Ref</em>' attribute.
	 * @see #setBomRef(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCompositionType_BomRef()
	 * @model dataType="org.cyclonedx.schema.bom.RefType4"
	 *        extendedMetaData="kind='attribute' name='bom-ref'"
	 * @generated
	 */
	String getBomRef();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CompositionType#getBomRef <em>Bom Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bom Ref</em>' attribute.
	 * @see #getBomRef()
	 * @generated
	 */
	void setBomRef(String value);

} // CompositionType
