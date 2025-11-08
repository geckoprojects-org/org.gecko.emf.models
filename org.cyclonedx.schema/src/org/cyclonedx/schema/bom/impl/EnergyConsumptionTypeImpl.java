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
package org.cyclonedx.schema.bom.impl;

import java.util.Collection;

import org.cyclonedx.schema.bom.ActivityType;
import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.Co2MeasureType;
import org.cyclonedx.schema.bom.EnergyConsumptionType;
import org.cyclonedx.schema.bom.EnergyMeasureType;
import org.cyclonedx.schema.bom.EnergyProviderType;
import org.cyclonedx.schema.bom.PropertiesType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Consumption Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyConsumptionTypeImpl#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyConsumptionTypeImpl#getEnergyProviders <em>Energy Providers</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyConsumptionTypeImpl#getActivityEnergyCost <em>Activity Energy Cost</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyConsumptionTypeImpl#getCo2CostEquivalent <em>Co2 Cost Equivalent</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyConsumptionTypeImpl#getCo2CostOffset <em>Co2 Cost Offset</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.EnergyConsumptionTypeImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyConsumptionTypeImpl extends MinimalEObjectImpl.Container implements EnergyConsumptionType {
	/**
	 * The default value of the '{@link #getActivity() <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected static final ActivityType ACTIVITY_EDEFAULT = ActivityType.DESIGN;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected ActivityType activity = ACTIVITY_EDEFAULT;

	/**
	 * This is true if the Activity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean activityESet;

	/**
	 * The cached value of the '{@link #getEnergyProviders() <em>Energy Providers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergyProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<EnergyProviderType> energyProviders;

	/**
	 * The cached value of the '{@link #getActivityEnergyCost() <em>Activity Energy Cost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityEnergyCost()
	 * @generated
	 * @ordered
	 */
	protected EnergyMeasureType activityEnergyCost;

	/**
	 * The cached value of the '{@link #getCo2CostEquivalent() <em>Co2 Cost Equivalent</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCo2CostEquivalent()
	 * @generated
	 * @ordered
	 */
	protected Co2MeasureType co2CostEquivalent;

	/**
	 * The cached value of the '{@link #getCo2CostOffset() <em>Co2 Cost Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCo2CostOffset()
	 * @generated
	 * @ordered
	 */
	protected Co2MeasureType co2CostOffset;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected PropertiesType properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumptionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getEnergyConsumptionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActivityType getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivity(ActivityType newActivity) {
		ActivityType oldActivity = activity;
		activity = newActivity == null ? ACTIVITY_EDEFAULT : newActivity;
		boolean oldActivityESet = activityESet;
		activityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY, oldActivity, activity, !oldActivityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetActivity() {
		ActivityType oldActivity = activity;
		boolean oldActivityESet = activityESet;
		activity = ACTIVITY_EDEFAULT;
		activityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY, oldActivity, ACTIVITY_EDEFAULT, oldActivityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetActivity() {
		return activityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnergyProviderType> getEnergyProviders() {
		if (energyProviders == null) {
			energyProviders = new EObjectContainmentEList<EnergyProviderType>(EnergyProviderType.class, this, BOMPackage.ENERGY_CONSUMPTION_TYPE__ENERGY_PROVIDERS);
		}
		return energyProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnergyMeasureType getActivityEnergyCost() {
		return activityEnergyCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityEnergyCost(EnergyMeasureType newActivityEnergyCost, NotificationChain msgs) {
		EnergyMeasureType oldActivityEnergyCost = activityEnergyCost;
		activityEnergyCost = newActivityEnergyCost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY_ENERGY_COST, oldActivityEnergyCost, newActivityEnergyCost);
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
	public void setActivityEnergyCost(EnergyMeasureType newActivityEnergyCost) {
		if (newActivityEnergyCost != activityEnergyCost) {
			NotificationChain msgs = null;
			if (activityEnergyCost != null)
				msgs = ((InternalEObject)activityEnergyCost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY_ENERGY_COST, null, msgs);
			if (newActivityEnergyCost != null)
				msgs = ((InternalEObject)newActivityEnergyCost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY_ENERGY_COST, null, msgs);
			msgs = basicSetActivityEnergyCost(newActivityEnergyCost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY_ENERGY_COST, newActivityEnergyCost, newActivityEnergyCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Co2MeasureType getCo2CostEquivalent() {
		return co2CostEquivalent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCo2CostEquivalent(Co2MeasureType newCo2CostEquivalent, NotificationChain msgs) {
		Co2MeasureType oldCo2CostEquivalent = co2CostEquivalent;
		co2CostEquivalent = newCo2CostEquivalent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_EQUIVALENT, oldCo2CostEquivalent, newCo2CostEquivalent);
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
	public void setCo2CostEquivalent(Co2MeasureType newCo2CostEquivalent) {
		if (newCo2CostEquivalent != co2CostEquivalent) {
			NotificationChain msgs = null;
			if (co2CostEquivalent != null)
				msgs = ((InternalEObject)co2CostEquivalent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_EQUIVALENT, null, msgs);
			if (newCo2CostEquivalent != null)
				msgs = ((InternalEObject)newCo2CostEquivalent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_EQUIVALENT, null, msgs);
			msgs = basicSetCo2CostEquivalent(newCo2CostEquivalent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_EQUIVALENT, newCo2CostEquivalent, newCo2CostEquivalent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Co2MeasureType getCo2CostOffset() {
		return co2CostOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCo2CostOffset(Co2MeasureType newCo2CostOffset, NotificationChain msgs) {
		Co2MeasureType oldCo2CostOffset = co2CostOffset;
		co2CostOffset = newCo2CostOffset;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_OFFSET, oldCo2CostOffset, newCo2CostOffset);
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
	public void setCo2CostOffset(Co2MeasureType newCo2CostOffset) {
		if (newCo2CostOffset != co2CostOffset) {
			NotificationChain msgs = null;
			if (co2CostOffset != null)
				msgs = ((InternalEObject)co2CostOffset).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_OFFSET, null, msgs);
			if (newCo2CostOffset != null)
				msgs = ((InternalEObject)newCo2CostOffset).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_OFFSET, null, msgs);
			msgs = basicSetCo2CostOffset(newCo2CostOffset, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_OFFSET, newCo2CostOffset, newCo2CostOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PropertiesType getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(PropertiesType newProperties, NotificationChain msgs) {
		PropertiesType oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_CONSUMPTION_TYPE__PROPERTIES, oldProperties, newProperties);
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
	public void setProperties(PropertiesType newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_CONSUMPTION_TYPE__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.ENERGY_CONSUMPTION_TYPE__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.ENERGY_CONSUMPTION_TYPE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ENERGY_PROVIDERS:
				return ((InternalEList<?>)getEnergyProviders()).basicRemove(otherEnd, msgs);
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY_ENERGY_COST:
				return basicSetActivityEnergyCost(null, msgs);
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_EQUIVALENT:
				return basicSetCo2CostEquivalent(null, msgs);
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_OFFSET:
				return basicSetCo2CostOffset(null, msgs);
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__PROPERTIES:
				return basicSetProperties(null, msgs);
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
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY:
				return getActivity();
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ENERGY_PROVIDERS:
				return getEnergyProviders();
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY_ENERGY_COST:
				return getActivityEnergyCost();
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_EQUIVALENT:
				return getCo2CostEquivalent();
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_OFFSET:
				return getCo2CostOffset();
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__PROPERTIES:
				return getProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY:
				setActivity((ActivityType)newValue);
				return;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ENERGY_PROVIDERS:
				getEnergyProviders().clear();
				getEnergyProviders().addAll((Collection<? extends EnergyProviderType>)newValue);
				return;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY_ENERGY_COST:
				setActivityEnergyCost((EnergyMeasureType)newValue);
				return;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_EQUIVALENT:
				setCo2CostEquivalent((Co2MeasureType)newValue);
				return;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_OFFSET:
				setCo2CostOffset((Co2MeasureType)newValue);
				return;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__PROPERTIES:
				setProperties((PropertiesType)newValue);
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
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY:
				unsetActivity();
				return;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ENERGY_PROVIDERS:
				getEnergyProviders().clear();
				return;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY_ENERGY_COST:
				setActivityEnergyCost((EnergyMeasureType)null);
				return;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_EQUIVALENT:
				setCo2CostEquivalent((Co2MeasureType)null);
				return;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_OFFSET:
				setCo2CostOffset((Co2MeasureType)null);
				return;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__PROPERTIES:
				setProperties((PropertiesType)null);
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
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY:
				return isSetActivity();
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ENERGY_PROVIDERS:
				return energyProviders != null && !energyProviders.isEmpty();
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__ACTIVITY_ENERGY_COST:
				return activityEnergyCost != null;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_EQUIVALENT:
				return co2CostEquivalent != null;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__CO2_COST_OFFSET:
				return co2CostOffset != null;
			case BOMPackage.ENERGY_CONSUMPTION_TYPE__PROPERTIES:
				return properties != null;
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
		result.append(" (activity: ");
		if (activityESet) result.append(activity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //EnergyConsumptionTypeImpl
