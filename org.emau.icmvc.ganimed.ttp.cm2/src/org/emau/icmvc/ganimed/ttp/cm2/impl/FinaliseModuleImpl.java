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
import org.emau.icmvc.ganimed.ttp.cm2.FinaliseModule;
import org.emau.icmvc.ganimed.ttp.cm2.ModuleKeyDTO;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finalise Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FinaliseModuleImpl#getModuleKey <em>Module Key</em>}</li>
 *   <li>{@link org.emau.icmvc.ganimed.ttp.cm2.impl.FinaliseModuleImpl#isFinaliseRelatedEntities <em>Finalise Related Entities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FinaliseModuleImpl extends MinimalEObjectImpl.Container implements FinaliseModule {
	/**
	 * The cached value of the '{@link #getModuleKey() <em>Module Key</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModuleKey()
	 * @generated
	 * @ordered
	 */
	protected ModuleKeyDTO moduleKey;

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
	protected FinaliseModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Cm2Package.eINSTANCE.getFinaliseModule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModuleKeyDTO getModuleKey() {
		return moduleKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModuleKey(ModuleKeyDTO newModuleKey, NotificationChain msgs) {
		ModuleKeyDTO oldModuleKey = moduleKey;
		moduleKey = newModuleKey;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Cm2Package.FINALISE_MODULE__MODULE_KEY, oldModuleKey, newModuleKey);
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
	public void setModuleKey(ModuleKeyDTO newModuleKey) {
		if (newModuleKey != moduleKey) {
			NotificationChain msgs = null;
			if (moduleKey != null)
				msgs = ((InternalEObject)moduleKey).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Cm2Package.FINALISE_MODULE__MODULE_KEY, null, msgs);
			if (newModuleKey != null)
				msgs = ((InternalEObject)newModuleKey).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Cm2Package.FINALISE_MODULE__MODULE_KEY, null, msgs);
			msgs = basicSetModuleKey(newModuleKey, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FINALISE_MODULE__MODULE_KEY, newModuleKey, newModuleKey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Cm2Package.FINALISE_MODULE__FINALISE_RELATED_ENTITIES, oldFinaliseRelatedEntities, finaliseRelatedEntities, !oldFinaliseRelatedEntitiesESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Cm2Package.FINALISE_MODULE__FINALISE_RELATED_ENTITIES, oldFinaliseRelatedEntities, FINALISE_RELATED_ENTITIES_EDEFAULT, oldFinaliseRelatedEntitiesESet));
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
			case Cm2Package.FINALISE_MODULE__MODULE_KEY:
				return basicSetModuleKey(null, msgs);
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
			case Cm2Package.FINALISE_MODULE__MODULE_KEY:
				return getModuleKey();
			case Cm2Package.FINALISE_MODULE__FINALISE_RELATED_ENTITIES:
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
			case Cm2Package.FINALISE_MODULE__MODULE_KEY:
				setModuleKey((ModuleKeyDTO)newValue);
				return;
			case Cm2Package.FINALISE_MODULE__FINALISE_RELATED_ENTITIES:
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
			case Cm2Package.FINALISE_MODULE__MODULE_KEY:
				setModuleKey((ModuleKeyDTO)null);
				return;
			case Cm2Package.FINALISE_MODULE__FINALISE_RELATED_ENTITIES:
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
			case Cm2Package.FINALISE_MODULE__MODULE_KEY:
				return moduleKey != null;
			case Cm2Package.FINALISE_MODULE__FINALISE_RELATED_ENTITIES:
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

} //FinaliseModuleImpl
