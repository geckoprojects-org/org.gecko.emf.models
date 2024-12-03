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
package org.emau.icmvc.ganimed.ttp.cm2;

import org.eclipse.emf.ecore.EObject;

import org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update Domain In Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getLogo <em>Logo</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateDomainInUse()
 * @model extendedMetaData="name='updateDomainInUse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface UpdateDomainInUse extends EObject {
	/**
	 * Returns the value of the '<em><b>Domain Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Name</em>' attribute.
	 * @see #setDomainName(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateDomainInUse_DomainName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='domainName'"
	 * @generated
	 */
	String getDomainName();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getDomainName <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Name</em>' attribute.
	 * @see #getDomainName()
	 * @generated
	 */
	void setDomainName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateDomainInUse_Label()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Logo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logo</em>' attribute.
	 * @see #setLogo(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateDomainInUse_Logo()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='logo'"
	 * @generated
	 */
	String getLogo();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getLogo <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logo</em>' attribute.
	 * @see #getLogo()
	 * @generated
	 */
	void setLogo(String value);

	/**
	 * Returns the value of the '<em><b>Extern Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extern Properties</em>' attribute.
	 * @see #setExternProperties(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateDomainInUse_ExternProperties()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='externProperties'"
	 * @generated
	 */
	String getExternProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getExternProperties <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extern Properties</em>' attribute.
	 * @see #getExternProperties()
	 * @generated
	 */
	void setExternProperties(String value);

	/**
	 * Returns the value of the '<em><b>Expiration Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expiration Properties</em>' containment reference.
	 * @see #setExpirationProperties(ExpirationPropertiesDTO)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateDomainInUse_ExpirationProperties()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='expirationProperties'"
	 * @generated
	 */
	ExpirationPropertiesDTO getExpirationProperties();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getExpirationProperties <em>Expiration Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expiration Properties</em>' containment reference.
	 * @see #getExpirationProperties()
	 * @generated
	 */
	void setExpirationProperties(ExpirationPropertiesDTO value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateDomainInUse_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='comment'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference.
	 * @see #setConfig(DomainConfig)
	 * @see org.emau.icmvc.ganimed.ttp.cm2.Cm2Package#getUpdateDomainInUse_Config()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='config'"
	 * @generated
	 */
	DomainConfig getConfig();

	/**
	 * Sets the value of the '{@link org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse#getConfig <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config</em>' containment reference.
	 * @see #getConfig()
	 * @generated
	 */
	void setConfig(DomainConfig value);

} // UpdateDomainInUse
