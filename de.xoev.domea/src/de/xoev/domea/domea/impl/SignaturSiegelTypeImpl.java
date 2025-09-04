/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.SignaturSiegelType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signatur Siegel Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.SignaturSiegelTypeImpl#isSignaturSiegelEingebettet <em>Signatur Siegel Eingebettet</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.SignaturSiegelTypeImpl#getSignaturSiegelDatei <em>Signatur Siegel Datei</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignaturSiegelTypeImpl extends MinimalEObjectImpl.Container implements SignaturSiegelType {
	/**
	 * The default value of the '{@link #isSignaturSiegelEingebettet() <em>Signatur Siegel Eingebettet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignaturSiegelEingebettet()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGNATUR_SIEGEL_EINGEBETTET_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isSignaturSiegelEingebettet() <em>Signatur Siegel Eingebettet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignaturSiegelEingebettet()
	 * @generated
	 * @ordered
	 */
	protected boolean signaturSiegelEingebettet = SIGNATUR_SIEGEL_EINGEBETTET_EDEFAULT;

	/**
	 * This is true if the Signatur Siegel Eingebettet attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean signaturSiegelEingebettetESet;

	/**
	 * The cached value of the '{@link #getSignaturSiegelDatei() <em>Signatur Siegel Datei</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignaturSiegelDatei()
	 * @generated
	 * @ordered
	 */
	protected EList<String> signaturSiegelDatei;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignaturSiegelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.SIGNATUR_SIEGEL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSignaturSiegelEingebettet() {
		return signaturSiegelEingebettet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSignaturSiegelEingebettet(boolean newSignaturSiegelEingebettet) {
		boolean oldSignaturSiegelEingebettet = signaturSiegelEingebettet;
		signaturSiegelEingebettet = newSignaturSiegelEingebettet;
		boolean oldSignaturSiegelEingebettetESet = signaturSiegelEingebettetESet;
		signaturSiegelEingebettetESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_EINGEBETTET, oldSignaturSiegelEingebettet, signaturSiegelEingebettet, !oldSignaturSiegelEingebettetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSignaturSiegelEingebettet() {
		boolean oldSignaturSiegelEingebettet = signaturSiegelEingebettet;
		boolean oldSignaturSiegelEingebettetESet = signaturSiegelEingebettetESet;
		signaturSiegelEingebettet = SIGNATUR_SIEGEL_EINGEBETTET_EDEFAULT;
		signaturSiegelEingebettetESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_EINGEBETTET, oldSignaturSiegelEingebettet, SIGNATUR_SIEGEL_EINGEBETTET_EDEFAULT, oldSignaturSiegelEingebettetESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSignaturSiegelEingebettet() {
		return signaturSiegelEingebettetESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSignaturSiegelDatei() {
		if (signaturSiegelDatei == null) {
			signaturSiegelDatei = new EDataTypeEList<String>(String.class, this, DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_DATEI);
		}
		return signaturSiegelDatei;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_EINGEBETTET:
				return isSignaturSiegelEingebettet();
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_DATEI:
				return getSignaturSiegelDatei();
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
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_EINGEBETTET:
				setSignaturSiegelEingebettet((Boolean)newValue);
				return;
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_DATEI:
				getSignaturSiegelDatei().clear();
				getSignaturSiegelDatei().addAll((Collection<? extends String>)newValue);
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
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_EINGEBETTET:
				unsetSignaturSiegelEingebettet();
				return;
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_DATEI:
				getSignaturSiegelDatei().clear();
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
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_EINGEBETTET:
				return isSetSignaturSiegelEingebettet();
			case DomeaPackage.SIGNATUR_SIEGEL_TYPE__SIGNATUR_SIEGEL_DATEI:
				return signaturSiegelDatei != null && !signaturSiegelDatei.isEmpty();
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
		result.append(" (signaturSiegelEingebettet: ");
		if (signaturSiegelEingebettetESet) result.append(signaturSiegelEingebettet); else result.append("<unset>");
		result.append(", signaturSiegelDatei: ");
		result.append(signaturSiegelDatei);
		result.append(')');
		return result.toString();
	}

} //SignaturSiegelTypeImpl
