/**
 */
package org.w3.owl.util;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.uml.UMLPackage;
import org.w3.owl.Datatype;
import org.w3.owl.OwlPackage;
import org.w3.owl.Restriction;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see org.w3.owl.OwlPackage
 * @generated
 */
public class OwlDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OwlPackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwlDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = OwlPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> with the appropriate model class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof EObject) {
			EClass eClass = ((EObject)notifier).eClass();
			if (eClass.eContainer() == modelPackage) {
				notifyChanged(notification, eClass);
			}
		}
	}

	/**
	 * Calls <code>notifyXXXChanged</code> for the corresponding class of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChanged(Notification notification, EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OwlPackage.CLASS:
				notifyClassChanged(notification, eClass);
				break;
			case OwlPackage.RESTRICTION:
				notifyRestrictionChanged(notification, eClass);
				break;
			case OwlPackage.DATATYPE:
				notifyDatatypeChanged(notification, eClass);
				break;
		}
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @param derivedUnion the derived union affected by the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification, EClass eClass, EStructuralFeature derivedUnion) {
		// Do nothing.
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyClassChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(org.w3.owl.Class.class)) {
			case OwlPackage.CLASS__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OwlPackage.CLASS__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__OWNING_TEMPLATE_PARAMETER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OwlPackage.CLASS__PACKAGE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OwlPackage.CLASS__TEMPLATE_BINDING:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__OWNED_TEMPLATE_SIGNATURE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__FEATURE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__ATTRIBUTE:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__COLLABORATION_USE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__GENERALIZATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__INHERITED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__OWNED_USE_CASE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__REDEFINED_CLASSIFIER:
				notifyChanged(notification, eClass, UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case OwlPackage.CLASS__REPRESENTATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__SUBSTITUTION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__OWNED_ATTRIBUTE:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case OwlPackage.CLASS__OWNED_CONNECTOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__ROLE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__OWNED_PORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case OwlPackage.CLASS__CLASSIFIER_BEHAVIOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__INTERFACE_REALIZATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__OWNED_BEHAVIOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__OWNED_OPERATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.CLASS__NESTED_CLASSIFIER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.CLASS__OWNED_RECEPTION:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyRestrictionChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Restriction.class)) {
			case OwlPackage.RESTRICTION__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OwlPackage.RESTRICTION__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__OWNING_TEMPLATE_PARAMETER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OwlPackage.RESTRICTION__PACKAGE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OwlPackage.RESTRICTION__TEMPLATE_BINDING:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__OWNED_TEMPLATE_SIGNATURE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__FEATURE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__ATTRIBUTE:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__COLLABORATION_USE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__GENERALIZATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__INHERITED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__OWNED_USE_CASE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__REDEFINED_CLASSIFIER:
				notifyChanged(notification, eClass, UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__REPRESENTATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__SUBSTITUTION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__OWNED_ATTRIBUTE:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case OwlPackage.RESTRICTION__OWNED_CONNECTOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__ROLE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__OWNED_PORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case OwlPackage.RESTRICTION__CLASSIFIER_BEHAVIOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__INTERFACE_REALIZATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__OWNED_BEHAVIOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__OWNED_OPERATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.RESTRICTION__NESTED_CLASSIFIER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.RESTRICTION__OWNED_RECEPTION:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyDatatypeChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Datatype.class)) {
			case OwlPackage.DATATYPE__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OwlPackage.DATATYPE__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__OWNING_TEMPLATE_PARAMETER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OwlPackage.DATATYPE__PACKAGE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OwlPackage.DATATYPE__TEMPLATE_BINDING:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__OWNED_TEMPLATE_SIGNATURE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__FEATURE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__ATTRIBUTE:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__COLLABORATION_USE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__GENERALIZATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__INHERITED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__OWNED_USE_CASE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__REDEFINED_CLASSIFIER:
				notifyChanged(notification, eClass, UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__REPRESENTATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__SUBSTITUTION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__OWNED_ATTRIBUTE:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case OwlPackage.DATATYPE__OWNED_CONNECTOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__ROLE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__OWNED_PORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE);
				break;
			case OwlPackage.DATATYPE__CLASSIFIER_BEHAVIOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__INTERFACE_REALIZATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__OWNED_BEHAVIOR:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__OWNED_OPERATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OwlPackage.DATATYPE__NESTED_CLASSIFIER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OwlPackage.DATATYPE__OWNED_RECEPTION:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

} //OwlDerivedUnionAdapter
