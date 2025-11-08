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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swid Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.SwidType#getText <em>Text</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SwidType#getUrl <em>Url</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SwidType#getAny <em>Any</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SwidType#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SwidType#isPatch <em>Patch</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SwidType#getTagId <em>Tag Id</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SwidType#getTagVersion <em>Tag Version</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.SwidType#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getSwidType()
 * @model extendedMetaData="name='swidType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SwidType extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the full content of the SWID tag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text</em>' containment reference.
	 * @see #setText(AttachedTextType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSwidType_Text()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='text' namespace='##targetNamespace'"
	 * @generated
	 */
	AttachedTextType getText();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SwidType#getText <em>Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' containment reference.
	 * @see #getText()
	 * @generated
	 */
	void setText(AttachedTextType value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL to the SWID file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSwidType_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SwidType#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

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
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSwidType_Any()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':2' processing='lax'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maps to the name of a SoftwareIdentity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSwidType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SwidType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Patch</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maps to the patch of a SoftwareIdentity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Patch</em>' attribute.
	 * @see #isSetPatch()
	 * @see #unsetPatch()
	 * @see #setPatch(boolean)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSwidType_Patch()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='patch'"
	 * @generated
	 */
	boolean isPatch();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SwidType#isPatch <em>Patch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patch</em>' attribute.
	 * @see #isSetPatch()
	 * @see #unsetPatch()
	 * @see #isPatch()
	 * @generated
	 */
	void setPatch(boolean value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.SwidType#isPatch <em>Patch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPatch()
	 * @see #isPatch()
	 * @see #setPatch(boolean)
	 * @generated
	 */
	void unsetPatch();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.SwidType#isPatch <em>Patch</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Patch</em>' attribute is set.
	 * @see #unsetPatch()
	 * @see #isPatch()
	 * @see #setPatch(boolean)
	 * @generated
	 */
	boolean isSetPatch();

	/**
	 * Returns the value of the '<em><b>Tag Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maps to the tagId of a SoftwareIdentity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag Id</em>' attribute.
	 * @see #setTagId(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSwidType_TagId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='tagId'"
	 * @generated
	 */
	String getTagId();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SwidType#getTagId <em>Tag Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Id</em>' attribute.
	 * @see #getTagId()
	 * @generated
	 */
	void setTagId(String value);

	/**
	 * Returns the value of the '<em><b>Tag Version</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maps to the tagVersion of a SoftwareIdentity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag Version</em>' attribute.
	 * @see #isSetTagVersion()
	 * @see #unsetTagVersion()
	 * @see #setTagVersion(BigInteger)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSwidType_TagVersion()
	 * @model default="0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Integer"
	 *        extendedMetaData="kind='attribute' name='tagVersion'"
	 * @generated
	 */
	BigInteger getTagVersion();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SwidType#getTagVersion <em>Tag Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag Version</em>' attribute.
	 * @see #isSetTagVersion()
	 * @see #unsetTagVersion()
	 * @see #getTagVersion()
	 * @generated
	 */
	void setTagVersion(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.SwidType#getTagVersion <em>Tag Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTagVersion()
	 * @see #getTagVersion()
	 * @see #setTagVersion(BigInteger)
	 * @generated
	 */
	void unsetTagVersion();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.SwidType#getTagVersion <em>Tag Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tag Version</em>' attribute is set.
	 * @see #unsetTagVersion()
	 * @see #getTagVersion()
	 * @see #setTagVersion(BigInteger)
	 * @generated
	 */
	boolean isSetTagVersion();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maps to the version of a SoftwareIdentity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #isSetVersion()
	 * @see #unsetVersion()
	 * @see #setVersion(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getSwidType_Version()
	 * @model default="0.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.SwidType#getVersion <em>Version</em>}' attribute.
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
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.SwidType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	void unsetVersion();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.SwidType#getVersion <em>Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Version</em>' attribute is set.
	 * @see #unsetVersion()
	 * @see #getVersion()
	 * @see #setVersion(String)
	 * @generated
	 */
	boolean isSetVersion();

} // SwidType
