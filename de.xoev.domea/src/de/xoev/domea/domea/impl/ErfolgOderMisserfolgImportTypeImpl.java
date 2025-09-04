/*
 */
package de.xoev.domea.domea.impl;

import de.xoev.domea.domea.DomeaPackage;
import de.xoev.domea.domea.ErfolgOderMisserfolgImportType;
import de.xoev.domea.domea.SonstigeFehlermeldungCodeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Erfolg Oder Misserfolg Import Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.domea.domea.impl.ErfolgOderMisserfolgImportTypeImpl#isErfolgreich <em>Erfolgreich</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.ErfolgOderMisserfolgImportTypeImpl#getFehlermeldung <em>Fehlermeldung</em>}</li>
 *   <li>{@link de.xoev.domea.domea.impl.ErfolgOderMisserfolgImportTypeImpl#getFehlermeldungCode <em>Fehlermeldung Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ErfolgOderMisserfolgImportTypeImpl extends MinimalEObjectImpl.Container implements ErfolgOderMisserfolgImportType {
	/**
	 * The default value of the '{@link #isErfolgreich() <em>Erfolgreich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isErfolgreich()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ERFOLGREICH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isErfolgreich() <em>Erfolgreich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isErfolgreich()
	 * @generated
	 * @ordered
	 */
	protected boolean erfolgreich = ERFOLGREICH_EDEFAULT;

	/**
	 * This is true if the Erfolgreich attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean erfolgreichESet;

	/**
	 * The cached value of the '{@link #getFehlermeldung() <em>Fehlermeldung</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFehlermeldung()
	 * @generated
	 * @ordered
	 */
	protected EList<String> fehlermeldung;

	/**
	 * The cached value of the '{@link #getFehlermeldungCode() <em>Fehlermeldung Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFehlermeldungCode()
	 * @generated
	 * @ordered
	 */
	protected EList<SonstigeFehlermeldungCodeType> fehlermeldungCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErfolgOderMisserfolgImportTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomeaPackage.Literals.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isErfolgreich() {
		return erfolgreich;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErfolgreich(boolean newErfolgreich) {
		boolean oldErfolgreich = erfolgreich;
		erfolgreich = newErfolgreich;
		boolean oldErfolgreichESet = erfolgreichESet;
		erfolgreichESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__ERFOLGREICH, oldErfolgreich, erfolgreich, !oldErfolgreichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetErfolgreich() {
		boolean oldErfolgreich = erfolgreich;
		boolean oldErfolgreichESet = erfolgreichESet;
		erfolgreich = ERFOLGREICH_EDEFAULT;
		erfolgreichESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__ERFOLGREICH, oldErfolgreich, ERFOLGREICH_EDEFAULT, oldErfolgreichESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetErfolgreich() {
		return erfolgreichESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getFehlermeldung() {
		if (fehlermeldung == null) {
			fehlermeldung = new EDataTypeEList<String>(String.class, this, DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG);
		}
		return fehlermeldung;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SonstigeFehlermeldungCodeType> getFehlermeldungCode() {
		if (fehlermeldungCode == null) {
			fehlermeldungCode = new EObjectContainmentEList<SonstigeFehlermeldungCodeType>(SonstigeFehlermeldungCodeType.class, this, DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG_CODE);
		}
		return fehlermeldungCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG_CODE:
				return ((InternalEList<?>)getFehlermeldungCode()).basicRemove(otherEnd, msgs);
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
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__ERFOLGREICH:
				return isErfolgreich();
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG:
				return getFehlermeldung();
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG_CODE:
				return getFehlermeldungCode();
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
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__ERFOLGREICH:
				setErfolgreich((Boolean)newValue);
				return;
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG:
				getFehlermeldung().clear();
				getFehlermeldung().addAll((Collection<? extends String>)newValue);
				return;
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG_CODE:
				getFehlermeldungCode().clear();
				getFehlermeldungCode().addAll((Collection<? extends SonstigeFehlermeldungCodeType>)newValue);
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
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__ERFOLGREICH:
				unsetErfolgreich();
				return;
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG:
				getFehlermeldung().clear();
				return;
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG_CODE:
				getFehlermeldungCode().clear();
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
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__ERFOLGREICH:
				return isSetErfolgreich();
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG:
				return fehlermeldung != null && !fehlermeldung.isEmpty();
			case DomeaPackage.ERFOLG_ODER_MISSERFOLG_IMPORT_TYPE__FEHLERMELDUNG_CODE:
				return fehlermeldungCode != null && !fehlermeldungCode.isEmpty();
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
		result.append(" (erfolgreich: ");
		if (erfolgreichESet) result.append(erfolgreich); else result.append("<unset>");
		result.append(", fehlermeldung: ");
		result.append(fehlermeldung);
		result.append(')');
		return result.toString();
	}

} //ErfolgOderMisserfolgImportTypeImpl
