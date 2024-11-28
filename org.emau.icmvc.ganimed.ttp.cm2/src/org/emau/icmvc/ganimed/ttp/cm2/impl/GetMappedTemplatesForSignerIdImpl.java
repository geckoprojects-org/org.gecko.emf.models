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
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateType;
import org.emau.icmvc.ganimed.ttp.cm2.GetMappedTemplatesForSignerId;
import org.emau.icmvc.ganimed.ttp.cm2.SignerIdDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Mapped Templates For Signer Id</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetMappedTemplatesForSignerIdImpl#getDomainName <em>Domain Name</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetMappedTemplatesForSignerIdImpl#getCtType <em>Ct Type</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetMappedTemplatesForSignerIdImpl#getSignerId <em>Signer Id</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.GetMappedTemplatesForSignerIdImpl#isUseAliases <em>Use Aliases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetMappedTemplatesForSignerIdImpl extends MinimalEObjectImpl.Container implements GetMappedTemplatesForSignerId {
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
	 * The default value of the '{@link #getCtType() <em>Ct Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtType()
	 * @generated
	 * @ordered
	 */
	protected static final ConsentTemplateType CT_TYPE_EDEFAULT = ConsentTemplateType.CONSENT;

	/**
	 * The cached value of the '{@link #getCtType() <em>Ct Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCtType()
	 * @generated
	 * @ordered
	 */
	protected ConsentTemplateType ctType = CT_TYPE_EDEFAULT;

	/**
	 * This is true if the Ct Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ctTypeESet;

	/**
	 * The cached value of the '{@link #getSignerId() <em>Signer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignerId()
	 * @generated
	 * @ordered
	 */
	protected SignerIdDTO signerId;

	/**
	 * The default value of the '{@link #isUseAliases() <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAliases()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_ALIASES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseAliases() <em>Use Aliases</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseAliases()
	 * @generated
	 * @ordered
	 */
	protected boolean useAliases = USE_ALIASES_EDEFAULT;

	/**
	 * This is true if the Use Aliases attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useAliasesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetMappedTemplatesForSignerIdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getGetMappedTemplatesForSignerId();
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__DOMAIN_NAME, oldDomainName, domainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateType getCtType() {
		return ctType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCtType(ConsentTemplateType newCtType) {
		ConsentTemplateType oldCtType = ctType;
		ctType = newCtType == null ? CT_TYPE_EDEFAULT : newCtType;
		boolean oldCtTypeESet = ctTypeESet;
		ctTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__CT_TYPE, oldCtType, ctType, !oldCtTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetCtType() {
		ConsentTemplateType oldCtType = ctType;
		boolean oldCtTypeESet = ctTypeESet;
		ctType = CT_TYPE_EDEFAULT;
		ctTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__CT_TYPE, oldCtType, CT_TYPE_EDEFAULT, oldCtTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetCtType() {
		return ctTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignerIdDTO getSignerId() {
		return signerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSignerId(SignerIdDTO newSignerId, NotificationChain msgs) {
		SignerIdDTO oldSignerId = signerId;
		signerId = newSignerId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID, oldSignerId, newSignerId);
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
	public void setSignerId(SignerIdDTO newSignerId) {
		if (newSignerId != signerId) {
			NotificationChain msgs = null;
			if (signerId != null)
				msgs = ((InternalEObject)signerId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID, null, msgs);
			if (newSignerId != null)
				msgs = ((InternalEObject)newSignerId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID, null, msgs);
			msgs = basicSetSignerId(newSignerId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID, newSignerId, newSignerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUseAliases() {
		return useAliases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUseAliases(boolean newUseAliases) {
		boolean oldUseAliases = useAliases;
		useAliases = newUseAliases;
		boolean oldUseAliasesESet = useAliasesESet;
		useAliasesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__USE_ALIASES, oldUseAliases, useAliases, !oldUseAliasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetUseAliases() {
		boolean oldUseAliases = useAliases;
		boolean oldUseAliasesESet = useAliasesESet;
		useAliases = USE_ALIASES_EDEFAULT;
		useAliasesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__USE_ALIASES, oldUseAliases, USE_ALIASES_EDEFAULT, oldUseAliasesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetUseAliases() {
		return useAliasesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID:
				return basicSetSignerId(null, msgs);
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
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__DOMAIN_NAME:
				return getDomainName();
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__CT_TYPE:
				return getCtType();
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID:
				return getSignerId();
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__USE_ALIASES:
				return isUseAliases();
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
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__DOMAIN_NAME:
				setDomainName((String)newValue);
				return;
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__CT_TYPE:
				setCtType((ConsentTemplateType)newValue);
				return;
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID:
				setSignerId((SignerIdDTO)newValue);
				return;
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__USE_ALIASES:
				setUseAliases((Boolean)newValue);
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
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__DOMAIN_NAME:
				setDomainName(DOMAIN_NAME_EDEFAULT);
				return;
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__CT_TYPE:
				unsetCtType();
				return;
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID:
				setSignerId((SignerIdDTO)null);
				return;
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__USE_ALIASES:
				unsetUseAliases();
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
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__DOMAIN_NAME:
				return DOMAIN_NAME_EDEFAULT == null ? domainName != null : !DOMAIN_NAME_EDEFAULT.equals(domainName);
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__CT_TYPE:
				return isSetCtType();
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__SIGNER_ID:
				return signerId != null;
			case Cm2Package.GET_MAPPED_TEMPLATES_FOR_SIGNER_ID__USE_ALIASES:
				return isSetUseAliases();
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
		result.append(", ctType: ");
		if (ctTypeESet) result.append(ctType); else result.append("<unset>");
		result.append(", useAliases: ");
		if (useAliasesESet) result.append(useAliases); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GetMappedTemplatesForSignerIdImpl
