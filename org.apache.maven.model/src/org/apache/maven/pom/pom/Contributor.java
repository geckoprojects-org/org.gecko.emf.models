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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contributor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 3.0.0+
 * Description of a person who has contributed to the project, but who does not have
 *         commit privileges. Usually, these contributions come in the form of patches submitted.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.apache.maven.pom.pom.Contributor#getName <em>Name</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Contributor#getEmail <em>Email</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Contributor#getUrl <em>Url</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Contributor#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Contributor#getOrganizationUrl <em>Organization Url</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Contributor#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Contributor#getTimezone <em>Timezone</em>}</li>
 *   <li>{@link org.apache.maven.pom.pom.Contributor#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see org.apache.maven.pom.pom.POMPackage#getContributor()
 * @model extendedMetaData="name='Contributor' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Contributor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * The full name of the contributor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getContributor_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Contributor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * The email address of the contributor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getContributor_Email()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='email' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Contributor#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * The URL for the homepage of the contributor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getContributor_Url()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='url' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Contributor#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Organization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * The organization to which the contributor belongs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' attribute.
	 * @see #setOrganization(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getContributor_Organization()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganization();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Contributor#getOrganization <em>Organization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' attribute.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(String value);

	/**
	 * Returns the value of the '<em><b>Organization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * The URL of the organization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization Url</em>' attribute.
	 * @see #setOrganizationUrl(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getContributor_OrganizationUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='organizationUrl' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOrganizationUrl();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Contributor#getOrganizationUrl <em>Organization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization Url</em>' attribute.
	 * @see #getOrganizationUrl()
	 * @generated
	 */
	void setOrganizationUrl(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *             The roles the contributor plays in the project. Each role is described by a
	 *             <code>role</code> element, the body of which is a role name. This can also be used to
	 *             describe the contribution.
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference.
	 * @see #setRoles(RolesType)
	 * @see org.apache.maven.pom.pom.POMPackage#getContributor_Roles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='roles' namespace='##targetNamespace'"
	 * @generated
	 */
	RolesType getRoles();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Contributor#getRoles <em>Roles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roles</em>' containment reference.
	 * @see #getRoles()
	 * @generated
	 */
	void setRoles(RolesType value);

	/**
	 * Returns the value of the '<em><b>Timezone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * 
	 *             
	 *               The timezone the contributor is in. Typically, this is a number in the range
	 *               <a href="http://en.wikipedia.org/wiki/UTC%E2%88%9212:00">-12</a> to <a href="http://en.wikipedia.org/wiki/UTC%2B14:00">+14</a>
	 *               or a valid time zone id like "America/Montreal" (UTC-05:00) or "Europe/Paris" (UTC+01:00).
	 *             
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timezone</em>' attribute.
	 * @see #setTimezone(String)
	 * @see org.apache.maven.pom.pom.POMPackage#getContributor_Timezone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='timezone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTimezone();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Contributor#getTimezone <em>Timezone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timezone</em>' attribute.
	 * @see #getTimezone()
	 * @generated
	 */
	void setTimezone(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 3.0.0+
	 * Properties about the contributor, such as an instant messenger handle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(PropertiesType2)
	 * @see org.apache.maven.pom.pom.POMPackage#getContributor_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesType2 getProperties();

	/**
	 * Sets the value of the '{@link org.apache.maven.pom.pom.Contributor#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(PropertiesType2 value);

} // Contributor
