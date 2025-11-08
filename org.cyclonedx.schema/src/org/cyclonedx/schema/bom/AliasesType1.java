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
 * A representation of the model object '<em><b>Aliases Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.AliasesType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AliasesType1#getAlias <em>Alias</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getAliasesType1()
 * @model extendedMetaData="name='aliases_._1_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AliasesType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAliasesType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One or more alternate names the release may be referred to. This may
	 *                                 include unofficial terms used by development and marketing teams (e.g. code names).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alias</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAliasesType1_Alias()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.NormalizedString" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='alias' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getAlias();

} // AliasesType1
