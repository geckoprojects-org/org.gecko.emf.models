/*
 */
package de.xoev.domea.domea.impl;

import basisnachricht.CodeVerzeichnisdienstType;

import de.xoev.domea.domea.BehoerdeType;
import de.xoev.domea.domea.DomeaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behoerde Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.BehoerdeTypeImpl#getVerzeichnisdienst <em>Verzeichnisdienst</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.BehoerdeTypeImpl#getKennung <em>Kennung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehoerdeTypeImpl extends MinimalEObjectImpl.Container implements BehoerdeType {
	/**
	 * The cached value of the '{@link #getVerzeichnisdienst() <em>Verzeichnisdienst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerzeichnisdienst()
	 * @generated
	 * @ordered
	 */
	protected CodeVerzeichnisdienstType verzeichnisdienst;

	/**
	 * The default value of the '{@link #getKennung() <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected static final String KENNUNG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKennung() <em>Kennung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKennung()
	 * @generated
	 * @ordered
	 */
	protected String kennung = KENNUNG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehoerdeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.BEHOERDE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeVerzeichnisdienstType getVerzeichnisdienst() {
		return verzeichnisdienst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVerzeichnisdienst(CodeVerzeichnisdienstType newVerzeichnisdienst, NotificationChain msgs) {
		CodeVerzeichnisdienstType oldVerzeichnisdienst = verzeichnisdienst;
		verzeichnisdienst = newVerzeichnisdienst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DomeaPackage.BEHOERDE_TYPE__VERZEICHNISDIENST, oldVerzeichnisdienst, newVerzeichnisdienst);
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
	public void setVerzeichnisdienst(CodeVerzeichnisdienstType newVerzeichnisdienst) {
		if (newVerzeichnisdienst != verzeichnisdienst) {
			NotificationChain msgs = null;
			if (verzeichnisdienst != null)
				msgs = ((InternalEObject)verzeichnisdienst).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.BEHOERDE_TYPE__VERZEICHNISDIENST, null, msgs);
			if (newVerzeichnisdienst != null)
				msgs = ((InternalEObject)newVerzeichnisdienst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DomeaPackage.BEHOERDE_TYPE__VERZEICHNISDIENST, null, msgs);
			msgs = basicSetVerzeichnisdienst(newVerzeichnisdienst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BEHOERDE_TYPE__VERZEICHNISDIENST, newVerzeichnisdienst, newVerzeichnisdienst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKennung() {
		return kennung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKennung(String newKennung) {
		String oldKennung = kennung;
		kennung = newKennung;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.BEHOERDE_TYPE__KENNUNG, oldKennung, kennung));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.BEHOERDE_TYPE__VERZEICHNISDIENST:
				return basicSetVerzeichnisdienst(null, msgs);
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
			case DomeaPackage.BEHOERDE_TYPE__VERZEICHNISDIENST:
				return getVerzeichnisdienst();
			case DomeaPackage.BEHOERDE_TYPE__KENNUNG:
				return getKennung();
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
			case DomeaPackage.BEHOERDE_TYPE__VERZEICHNISDIENST:
				setVerzeichnisdienst((CodeVerzeichnisdienstType)newValue);
				return;
			case DomeaPackage.BEHOERDE_TYPE__KENNUNG:
				setKennung((String)newValue);
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
			case DomeaPackage.BEHOERDE_TYPE__VERZEICHNISDIENST:
				setVerzeichnisdienst((CodeVerzeichnisdienstType)null);
				return;
			case DomeaPackage.BEHOERDE_TYPE__KENNUNG:
				setKennung(KENNUNG_EDEFAULT);
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
			case DomeaPackage.BEHOERDE_TYPE__VERZEICHNISDIENST:
				return verzeichnisdienst != null;
			case DomeaPackage.BEHOERDE_TYPE__KENNUNG:
				return KENNUNG_EDEFAULT == null ? kennung != null : !KENNUNG_EDEFAULT.equals(kennung);
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
		result.append(" (kennung: ");
		result.append(kennung);
		result.append(')');
		return result.toString();
	}

} //BehoerdeTypeImpl
