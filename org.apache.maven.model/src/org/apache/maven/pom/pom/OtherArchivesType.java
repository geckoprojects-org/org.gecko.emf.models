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
package org.apache.maven.pom.pom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Other Archives Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.OtherArchivesType#getOtherArchive <em>Other Archive</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getOtherArchivesType()
 * @model extendedMetaData="name='otherArchives_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface OtherArchivesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Other Archive</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Archive</em>' attribute list.
	 * @see org.apache.maven.pom.pom.POMPackage#getOtherArchivesType_OtherArchive()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='otherArchive' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getOtherArchive();

} // OtherArchivesType
