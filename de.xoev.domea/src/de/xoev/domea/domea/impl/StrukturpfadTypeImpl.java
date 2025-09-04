/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.PfadelementType;
import de.xoev.domea.domea.StrukturpfadType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strukturpfad Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.StrukturpfadTypeImpl#getPfadelement <em>Pfadelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrukturpfadTypeImpl extends MinimalEObjectImpl.Container implements StrukturpfadType {
	/**
	 * The cached value of the '{@link #getPfadelement() <em>Pfadelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPfadelement()
	 * @generated
	 * @ordered
	 */
	protected PfadelementType pfadelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrukturpfadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.STRUKTURPFAD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PfadelementType getPfadelement() {
		return pfadelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPfadelement(PfadelementType newPfadelement, NotificationChain msgs) {
		PfadelementType oldPfadelement = pfadelement;
		pfadelement = newPfadelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.STRUKTURPFAD_TYPE__PFADELEMENT, oldPfadelement, newPfadelement);
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
	public void setPfadelement(PfadelementType newPfadelement) {
		if (newPfadelement != pfadelement) {
			NotificationChain msgs = null;
			if (pfadelement != null)
				msgs = ((InternalEObject)pfadelement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.STRUKTURPFAD_TYPE__PFADELEMENT, null, msgs);
			if (newPfadelement != null)
				msgs = ((InternalEObject)newPfadelement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.STRUKTURPFAD_TYPE__PFADELEMENT, null, msgs);
			msgs = basicSetPfadelement(newPfadelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.STRUKTURPFAD_TYPE__PFADELEMENT, newPfadelement, newPfadelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.STRUKTURPFAD_TYPE__PFADELEMENT:
				return basicSetPfadelement(null, msgs);
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
			case DomeaPackage.STRUKTURPFAD_TYPE__PFADELEMENT:
				return getPfadelement();
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
			case DomeaPackage.STRUKTURPFAD_TYPE__PFADELEMENT:
				setPfadelement((PfadelementType)newValue);
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
			case DomeaPackage.STRUKTURPFAD_TYPE__PFADELEMENT:
				setPfadelement((PfadelementType)null);
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
			case DomeaPackage.STRUKTURPFAD_TYPE__PFADELEMENT:
				return pfadelement != null;
		}
		return super.eIsSet(featureID);
	}

} //StrukturpfadTypeImpl
