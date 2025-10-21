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
package de.online.adv.namespaces.adv.sk.xml.skadv.impl;

import de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage;
import de.online.adv.namespaces.adv.sk.xml.skadv.NeighborSelModeType;
import de.online.adv.namespaces.adv.sk.xml.skadv.NeighborhoodFilterType;
import de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relate Topology Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.RelateTopologyTypeImpl#getSelmode <em>Selmode</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.impl.RelateTopologyTypeImpl#getNeighborhoodFilter <em>Neighborhood Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelateTopologyTypeImpl extends PlacementRuleTypeImpl implements RelateTopologyType {
	/**
	 * The default value of the '{@link #getSelmode() <em>Selmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelmode()
	 * @generated
	 * @ordered
	 */
	protected static final NeighborSelModeType SELMODE_EDEFAULT = NeighborSelModeType.SELECTED;

	/**
	 * The cached value of the '{@link #getSelmode() <em>Selmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelmode()
	 * @generated
	 * @ordered
	 */
	protected NeighborSelModeType selmode = SELMODE_EDEFAULT;

	/**
	 * This is true if the Selmode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean selmodeESet;

	/**
	 * The cached value of the '{@link #getNeighborhoodFilter() <em>Neighborhood Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighborhoodFilter()
	 * @generated
	 * @ordered
	 */
	protected NeighborhoodFilterType neighborhoodFilter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelateTopologyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AAAPackage.eINSTANCE.getRelateTopologyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeighborSelModeType getSelmode() {
		return selmode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelmode(NeighborSelModeType newSelmode) {
		NeighborSelModeType oldSelmode = selmode;
		selmode = newSelmode == null ? SELMODE_EDEFAULT : newSelmode;
		boolean oldSelmodeESet = selmodeESet;
		selmodeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.RELATE_TOPOLOGY_TYPE__SELMODE, oldSelmode, selmode, !oldSelmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSelmode() {
		NeighborSelModeType oldSelmode = selmode;
		boolean oldSelmodeESet = selmodeESet;
		selmode = SELMODE_EDEFAULT;
		selmodeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AAAPackage.RELATE_TOPOLOGY_TYPE__SELMODE, oldSelmode, SELMODE_EDEFAULT, oldSelmodeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSelmode() {
		return selmodeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NeighborhoodFilterType getNeighborhoodFilter() {
		return neighborhoodFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNeighborhoodFilter(NeighborhoodFilterType newNeighborhoodFilter, NotificationChain msgs) {
		NeighborhoodFilterType oldNeighborhoodFilter = neighborhoodFilter;
		neighborhoodFilter = newNeighborhoodFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AAAPackage.RELATE_TOPOLOGY_TYPE__NEIGHBORHOOD_FILTER, oldNeighborhoodFilter, newNeighborhoodFilter);
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
	public void setNeighborhoodFilter(NeighborhoodFilterType newNeighborhoodFilter) {
		if (newNeighborhoodFilter != neighborhoodFilter) {
			NotificationChain msgs = null;
			if (neighborhoodFilter != null)
				msgs = ((InternalEObject)neighborhoodFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AAAPackage.RELATE_TOPOLOGY_TYPE__NEIGHBORHOOD_FILTER, null, msgs);
			if (newNeighborhoodFilter != null)
				msgs = ((InternalEObject)newNeighborhoodFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AAAPackage.RELATE_TOPOLOGY_TYPE__NEIGHBORHOOD_FILTER, null, msgs);
			msgs = basicSetNeighborhoodFilter(newNeighborhoodFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AAAPackage.RELATE_TOPOLOGY_TYPE__NEIGHBORHOOD_FILTER, newNeighborhoodFilter, newNeighborhoodFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AAAPackage.RELATE_TOPOLOGY_TYPE__NEIGHBORHOOD_FILTER:
				return basicSetNeighborhoodFilter(null, msgs);
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
			case AAAPackage.RELATE_TOPOLOGY_TYPE__SELMODE:
				return getSelmode();
			case AAAPackage.RELATE_TOPOLOGY_TYPE__NEIGHBORHOOD_FILTER:
				return getNeighborhoodFilter();
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
			case AAAPackage.RELATE_TOPOLOGY_TYPE__SELMODE:
				setSelmode((NeighborSelModeType)newValue);
				return;
			case AAAPackage.RELATE_TOPOLOGY_TYPE__NEIGHBORHOOD_FILTER:
				setNeighborhoodFilter((NeighborhoodFilterType)newValue);
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
			case AAAPackage.RELATE_TOPOLOGY_TYPE__SELMODE:
				unsetSelmode();
				return;
			case AAAPackage.RELATE_TOPOLOGY_TYPE__NEIGHBORHOOD_FILTER:
				setNeighborhoodFilter((NeighborhoodFilterType)null);
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
			case AAAPackage.RELATE_TOPOLOGY_TYPE__SELMODE:
				return isSetSelmode();
			case AAAPackage.RELATE_TOPOLOGY_TYPE__NEIGHBORHOOD_FILTER:
				return neighborhoodFilter != null;
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
		result.append(" (selmode: ");
		if (selmodeESet) result.append(selmode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RelateTopologyTypeImpl
