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
 * A representation of the model object '<em><b>Use Cases Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.UseCasesType#getUseCase <em>Use Case</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getUseCasesType()
 * @model extendedMetaData="name='useCases_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UseCasesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Use Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case</em>' attribute.
	 * @see #setUseCase(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getUseCasesType_UseCase()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='useCase' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseCase();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.UseCasesType#getUseCase <em>Use Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case</em>' attribute.
	 * @see #getUseCase()
	 * @generated
	 */
	void setUseCase(String value);

} // UseCasesType
