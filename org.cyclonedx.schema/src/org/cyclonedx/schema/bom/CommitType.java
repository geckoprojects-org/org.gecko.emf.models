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

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commit Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.CommitType#getUid <em>Uid</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CommitType#getUrl <em>Url</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CommitType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CommitType#getCommitter <em>Committer</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CommitType#getMessage <em>Message</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.CommitType#getAny <em>Any</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitType()
 * @model extendedMetaData="name='commitType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CommitType extends EObject {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A unique identifier of the commit. This may be version control
	 *                         specific. For example, Subversion uses revision numbers whereas git uses commit hashes.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' attribute.
	 * @see #setUid(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitType_Uid()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='uid' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CommitType#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL to the commit. This URL will typically point to a commit
	 *                         in a version control system.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitType_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CommitType#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The author who created the changes in the commit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(IdentifiableActionType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitType_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifiableActionType getAuthor();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CommitType#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(IdentifiableActionType value);

	/**
	 * Returns the value of the '<em><b>Committer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person who committed or pushed the commit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Committer</em>' containment reference.
	 * @see #setCommitter(IdentifiableActionType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitType_Committer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='committer' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifiableActionType getCommitter();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CommitType#getCommitter <em>Committer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Committer</em>' containment reference.
	 * @see #getCommitter()
	 * @generated
	 */
	void setCommitter(IdentifiableActionType value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text description of the contents of the commit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitType_Message()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NormalizedString"
	 *        extendedMetaData="kind='element' name='message' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.CommitType#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Allows any undeclared elements as long as the elements are placed in a different namespace.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.cyclonedx.schema.bom.BOMPackage#getCommitType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':5' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

} // CommitType
