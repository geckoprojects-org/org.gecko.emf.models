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
package org.emau.icmvc.ganimed.ttp.cm2.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ExpirationPropertiesDTO;
import org.emau.icmvc.ganimed.ttp.cm2.UpdateDomainInUse;

import org.emau.icmvc.ganimed.ttp.cm2.config.DomainConfig;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Update Domain In Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateDomainInUseImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateDomainInUseImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateDomainInUseImpl#getLogo <em>Logo</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateDomainInUseImpl#getExternProperties <em>Extern Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateDomainInUseImpl#getExpirationProperties <em>Expiration Properties</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateDomainInUseImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.UpdateDomainInUseImpl#getConfig <em>Config</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UpdateDomainInUseImpl extends MinimalEObjectImpl.Container implements UpdateDomainInUse {
	/**
	 * The default value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected static final String DOMAIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDomainName() <em>Domain Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainName()
	 * @generated
	 * @ordered
	 */
	protected String domainName = DOMAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected static final String LOGO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLogo() <em>Logo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogo()
	 * @generated
	 * @ordered
	 */
	protected String logo = LOGO_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternProperties() <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternProperties()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERN_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternProperties() <em>Extern Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternProperties()
	 * @generated
	 * @ordered
	 */
	protected String externProperties = EXTERN_PROPERTIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExpirationProperties() <em>Expiration Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpirationProperties()
	 * @generated
	 * @ordered
	 */
	protected ExpirationPropertiesDTO expirationProperties;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected DomainConfig config;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UpdateDomainInUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getUpdateDomainInUse();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDomainName() {
		return domainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainName(String newDomainName) {
		String oldDomainName = domainName;
		domainName = newDomainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_DOMAIN_IN_USE__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_DOMAIN_IN_USE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLogo() {
		return logo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLogo(String newLogo) {
		String oldLogo = logo;
		logo = newLogo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_DOMAIN_IN_USE__LOGO, oldLogo, logo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternProperties() {
		return externProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternProperties(String newExternProperties) {
		String oldExternProperties = externProperties;
		externProperties = newExternProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_DOMAIN_IN_USE__EXTERN_PROPERTIES, oldExternProperties, externProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpirationPropertiesDTO getExpirationProperties() {
		return expirationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpirationProperties(ExpirationPropertiesDTO newExpirationProperties, NotificationChain msgs) {
		ExpirationPropertiesDTO oldExpirationProperties = expirationProperties;
		expirationProperties = newExpirationProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_DOMAIN_IN_USE__EXPIRATION_PROPERTIES, oldExpirationProperties, newExpirationProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpirationProperties(ExpirationPropertiesDTO newExpirationProperties) {
		if (newExpirationProperties != expirationProperties) {
			NotificationChain msgs = null;
			if (expirationProperties != null)
				msgs = ((InternalEObject)expirationProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.UPDATE_DOMAIN_IN_USE__EXPIRATION_PROPERTIES, null, msgs);
			if (newExpirationProperties != null)
				msgs = ((InternalEObject)newExpirationProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.UPDATE_DOMAIN_IN_USE__EXPIRATION_PROPERTIES, null, msgs);
			msgs = basicSetExpirationProperties(newExpirationProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_DOMAIN_IN_USE__EXPIRATION_PROPERTIES, newExpirationProperties, newExpirationProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_DOMAIN_IN_USE__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainConfig getConfig() {
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfig(DomainConfig newConfig, NotificationChain msgs) {
		DomainConfig oldConfig = config;
		config = newConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_DOMAIN_IN_USE__CONFIG, oldConfig, newConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfig(DomainConfig newConfig) {
		if (newConfig != config) {
			NotificationChain msgs = null;
			if (config != null)
				msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.UPDATE_DOMAIN_IN_USE__CONFIG, null, msgs);
			if (newConfig != null)
				msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.UPDATE_DOMAIN_IN_USE__CONFIG, null, msgs);
			msgs = basicSetConfig(newConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.UPDATE_DOMAIN_IN_USE__CONFIG, newConfig, newConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.UPDATE_DOMAIN_IN_USE__EXPIRATION_PROPERTIES:
				return basicSetExpirationProperties(null, msgs);
			case Cm2Package.UPDATE_DOMAIN_IN_USE__CONFIG:
				return basicSetConfig(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Cm2Package.UPDATE_DOMAIN_IN_USE__DOMAIN_NAME:
				return getDomainName();
			case Cm2Package.UPDATE_DOMAIN_IN_USE__LABEL:
				return getLabel();
			case Cm2Package.UPDATE_DOMAIN_IN_USE__LOGO:
				return getLogo();
			case Cm2Package.UPDATE_DOMAIN_IN_USE__EXTERN_PROPERTIES:
				return getExternProperties();
			case Cm2Package.UPDATE_DOMAIN_IN_USE__EXPIRATION_PROPERTIES:
				return getExpirationProperties();
			case Cm2Package.UPDATE_DOMAIN_IN_USE__COMMENT:
				return getComment();
			case Cm2Package.UPDATE_DOMAIN_IN_USE__CONFIG:
				return getConfig();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Cm2Package.UPDATE_DOMAIN_IN_USE__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__LABEL:
				setLabel((String)newValue);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__LOGO:
				setLogo((String)newValue);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__EXTERN_PROPERTIES:
				setExternProperties((String)newValue);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)newValue);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__COMMENT:
				setComment((String)newValue);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__CONFIG:
				setConfig((DomainConfig)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Cm2Package.UPDATE_DOMAIN_IN_USE__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__LOGO:
				setLogo(LOGO_EDEFAULT);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__EXTERN_PROPERTIES:
				setExternProperties(EXTERN_PROPERTIES_EDEFAULT);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__EXPIRATION_PROPERTIES:
				setExpirationProperties((ExpirationPropertiesDTO)null);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__CONFIG:
				setConfig((DomainConfig)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Cm2Package.UPDATE_DOMAIN_IN_USE__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case Cm2Package.UPDATE_DOMAIN_IN_USE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case Cm2Package.UPDATE_DOMAIN_IN_USE__LOGO:
				return LOGO_EDEFAULT == null ? logo != null : !LOGO_EDEFAULT.equals(logo);
			case Cm2Package.UPDATE_DOMAIN_IN_USE__EXTERN_PROPERTIES:
				return EXTERN_PROPERTIES_EDEFAULT == null ? externProperties != null : !EXTERN_PROPERTIES_EDEFAULT.equals(externProperties);
			case Cm2Package.UPDATE_DOMAIN_IN_USE__EXPIRATION_PROPERTIES:
				return expirationProperties != null;
			case Cm2Package.UPDATE_DOMAIN_IN_USE__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case Cm2Package.UPDATE_DOMAIN_IN_USE__CONFIG:
				return config != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (domainName: ");
		result.append(domainName);
		result.append(", label: ");
		result.append(label);
		result.append(", logo: ");
		result.append(logo);
		result.append(", externProperties: ");
		result.append(externProperties);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //UpdateDomainInUseImpl
