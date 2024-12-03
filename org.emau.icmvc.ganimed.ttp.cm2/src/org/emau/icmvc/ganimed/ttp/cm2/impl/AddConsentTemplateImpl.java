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

import org.emau.icmvc.ganimed.ttp.cm2.AddConsentTemplate;
import org.emau.icmvc.ganimed.ttp.cm2.Cm2Package;
import org.emau.icmvc.ganimed.ttp.cm2.ConsentTemplateDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Consent Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddConsentTemplateImpl#getConsentTemplate <em>Consent Template</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.AddConsentTemplateImpl#isFinaliseRelatedEntities <em>Finalise Related Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddConsentTemplateImpl extends MinimalEObjectImpl.Container implements AddConsentTemplate {
	/**
	 * The cached value of the '{@link #getConsentTemplate() <em>Consent Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsentTemplate()
	 * @generated
	 * @ordered
	 */
	protected ConsentTemplateDTO consentTemplate;

	/**
	 * The default value of the '{@link #isFinaliseRelatedEntities() <em>Finalise Related Entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinaliseRelatedEntities()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINALISE_RELATED_ENTITIES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinaliseRelatedEntities() <em>Finalise Related Entities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinaliseRelatedEntities()
	 * @generated
	 * @ordered
	 */
	protected boolean finaliseRelatedEntities = FINALISE_RELATED_ENTITIES_EDEFAULT;

	/**
	 * This is true if the Finalise Related Entities attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean finaliseRelatedEntitiesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddConsentTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getAddConsentTemplate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsentTemplateDTO getConsentTemplate() {
		return consentTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConsentTemplate(ConsentTemplateDTO newConsentTemplate, NotificationChain msgs) {
		ConsentTemplateDTO oldConsentTemplate = consentTemplate;
		consentTemplate = newConsentTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_CONSENT_TEMPLATE__CONSENT_TEMPLATE, oldConsentTemplate, newConsentTemplate);
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
	public void setConsentTemplate(ConsentTemplateDTO newConsentTemplate) {
		if (newConsentTemplate != consentTemplate) {
			NotificationChain msgs = null;
			if (consentTemplate != null)
				msgs = ((InternalEObject)consentTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ADD_CONSENT_TEMPLATE__CONSENT_TEMPLATE, null, msgs);
			if (newConsentTemplate != null)
				msgs = ((InternalEObject)newConsentTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.ADD_CONSENT_TEMPLATE__CONSENT_TEMPLATE, null, msgs);
			msgs = basicSetConsentTemplate(newConsentTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_CONSENT_TEMPLATE__CONSENT_TEMPLATE, newConsentTemplate, newConsentTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFinaliseRelatedEntities() {
		return finaliseRelatedEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFinaliseRelatedEntities(boolean newFinaliseRelatedEntities) {
		boolean oldFinaliseRelatedEntities = finaliseRelatedEntities;
		finaliseRelatedEntities = newFinaliseRelatedEntities;
		boolean oldFinaliseRelatedEntitiesESet = finaliseRelatedEntitiesESet;
		finaliseRelatedEntitiesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.ADD_CONSENT_TEMPLATE__FINALISE_RELATED_ENTITIES, oldFinaliseRelatedEntities, finaliseRelatedEntities, !oldFinaliseRelatedEntitiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetFinaliseRelatedEntities() {
		boolean oldFinaliseRelatedEntities = finaliseRelatedEntities;
		boolean oldFinaliseRelatedEntitiesESet = finaliseRelatedEntitiesESet;
		finaliseRelatedEntities = FINALISE_RELATED_ENTITIES_EDEFAULT;
		finaliseRelatedEntitiesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.ADD_CONSENT_TEMPLATE__FINALISE_RELATED_ENTITIES, oldFinaliseRelatedEntities, FINALISE_RELATED_ENTITIES_EDEFAULT, oldFinaliseRelatedEntitiesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetFinaliseRelatedEntities() {
		return finaliseRelatedEntitiesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Cm2Package.ADD_CONSENT_TEMPLATE__CONSENT_TEMPLATE:
				return basicSetConsentTemplate(null, msgs);
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
			case Cm2Package.ADD_CONSENT_TEMPLATE__CONSENT_TEMPLATE:
				return getConsentTemplate();
			case Cm2Package.ADD_CONSENT_TEMPLATE__FINALISE_RELATED_ENTITIES:
				return isFinaliseRelatedEntities();
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
			case Cm2Package.ADD_CONSENT_TEMPLATE__CONSENT_TEMPLATE:
				setConsentTemplate((ConsentTemplateDTO)newValue);
				return;
			case Cm2Package.ADD_CONSENT_TEMPLATE__FINALISE_RELATED_ENTITIES:
				setFinaliseRelatedEntities((Boolean)newValue);
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
			case Cm2Package.ADD_CONSENT_TEMPLATE__CONSENT_TEMPLATE:
				setConsentTemplate((ConsentTemplateDTO)null);
				return;
			case Cm2Package.ADD_CONSENT_TEMPLATE__FINALISE_RELATED_ENTITIES:
				unsetFinaliseRelatedEntities();
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
			case Cm2Package.ADD_CONSENT_TEMPLATE__CONSENT_TEMPLATE:
				return consentTemplate != null;
			case Cm2Package.ADD_CONSENT_TEMPLATE__FINALISE_RELATED_ENTITIES:
				return isSetFinaliseRelatedEntities();
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
		result.append(" (finaliseRelatedEntities: ");
		if (finaliseRelatedEntitiesESet) result.append(finaliseRelatedEntities); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AddConsentTemplateImpl
